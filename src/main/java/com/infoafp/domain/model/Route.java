package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder({"bounds", "copyrights", "legs"})
public class Route {

	@JsonProperty("bounds")
	private Bounds bound;
	@JsonProperty("copyrights")
	private String copyright;
	@JsonProperty("legs")
	private Leg[] leg;
	
}



