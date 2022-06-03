package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder({"copyrights", "bounds", "legs"})
public class Route {

	@JsonProperty("copyrights")
	private String copyright;
	@JsonProperty("bounds")
	private Bounds bound;
	@JsonProperty("legs")
	private Leg[] leg;
	
}



