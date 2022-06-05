package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {

	@JsonProperty("geocoded_waypoints")
	private GeocodeWayPoint[] geocodeWayPoint;
	@JsonProperty("routes")
	private Route[] route;

}





