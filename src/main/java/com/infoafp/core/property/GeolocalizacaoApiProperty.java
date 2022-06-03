package com.infoafp.core.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties("infoafp-geolocalizacao")
public class GeolocalizacaoApiProperty {

	private final GMaps gMaps = new GMaps();
	
	@Getter
	@Setter
	public class GMaps {
		private String key;
	}
	
}
