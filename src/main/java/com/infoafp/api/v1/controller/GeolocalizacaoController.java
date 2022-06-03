package com.infoafp.api.v1.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.infoafp.domain.model.Response;

@RestController
@RequestMapping(value = "/v1/geolocalizacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class GeolocalizacaoController {

	private static final Object API_KEY = "AIzaSyAtWKlfJ6JCczn2g7IUELH4JEkExdAsDNM";
	
	@GetMapping()
	public Response obterRota(@RequestParam String origem, @RequestParam String destino) {
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("maps.googleapis.com")
				.path("/maps/api/directions/json")
				.queryParam("key", API_KEY)
				.queryParam("origin", origem)
				.queryParam("destination", destino)
				.queryParam("language", "pt")
				.queryParam("departure_time", "now")
				.build();
		
		ResponseEntity<Response> response = new RestTemplate().getForEntity(uri.toString(), Response.class);
		
		return response.getBody();
	}
	
}





