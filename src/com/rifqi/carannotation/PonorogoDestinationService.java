package com.rifqi.carannotation;

import org.springframework.stereotype.Component;

@Component
public class PonorogoDestinationService implements DestinationService {
	public String getDestination() {
		return "Go to Ponorogo in 5 hours!";
	}

}
