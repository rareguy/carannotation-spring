package com.rifqi.carannotation;

import org.springframework.stereotype.Component;

@Component
public class SurabayaDestinationService implements DestinationService {
	public String getDestination() {
		return "Go to Surabaya in 2 hours!";
	}
}
