package com.infoafp.api.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.infoafp.core.property.GeolocalizacaoApiProperty;
import com.infoafp.domain.exception.DestinoInexistenteException;
import com.infoafp.domain.exception.OrigemInexistenteException;
import com.infoafp.domain.model.Response;

@RestController
@RequestMapping(value = "/v1/geolocalizacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class GeolocalizacaoController {

	@Autowired
	private GeolocalizacaoApiProperty geolocalizacaoApiProperty;
	
	@GetMapping()
	public Response obterRota(@RequestParam String origem, @RequestParam String destino) {
		
		exceptionHandler(origem, destino);
		
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("maps.googleapis.com")
				.path("/maps/api/directions/json")
				.queryParam("key", geolocalizacaoApiProperty.getGMaps().getKey())
				.queryParam("origin", origem)
				.queryParam("destination", destino)
				.queryParam("language", "pt")
				.queryParam("departure_time", "now")
				.build();
		
		ResponseEntity<Response> response = new RestTemplate().getForEntity(uri.toString(), Response.class);
		
		return response.getBody();
	}
	
	private void exceptionHandler(String origem, String destino) {
		if(origem.isBlank()) {
			throw new OrigemInexistenteException(String.format("Informe a origem para que seja gerada a rota"));
		}
		
		if(destino.isBlank()) {
			throw new DestinoInexistenteException(String.format("Informe o destino para que seja gerada a rota"));
		}
	}
	
}






