package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leg {

	private Distance distance;
	private Duration duration;
	@JsonProperty("start_address")
	private String startAddress;
	@JsonProperty("start_location")
	private StartLocation startLocation;
	@JsonProperty("end_address")
	private String endAddress;
	@JsonProperty("end_location")
	private EndLocation endLocation;
	@JsonProperty("steps")
	private Step[] step;
	
}


