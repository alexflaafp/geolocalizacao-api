package com.infoafp.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Step {

	private Distance distance;
	private Duration duration;
	@JsonProperty("start_location")
	private StartLocation startLocation;
	@JsonProperty("html_instructions")
	private String htmlInstructions;
	private String maneuver;
	@JsonProperty("end_location")
	private EndLocation endLocation;
	@JsonProperty("travel_mode")
	private String travelMode;
	
}


