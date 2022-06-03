package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeocodeWayPoint {

	@JsonProperty("geocoder_status")
	private String geocoderStatus;
	
	@JsonProperty("place_id")
	private String placeId;
	
}
