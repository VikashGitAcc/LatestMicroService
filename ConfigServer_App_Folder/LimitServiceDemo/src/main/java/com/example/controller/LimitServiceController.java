package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.LimitConfiguration;
import com.example.model.Limits;

@RestController
public class LimitServiceController {
	
	@Autowired
	private LimitConfiguration limitConfiguration;
	
	@GetMapping("/getLimit")
	public Limits  getLimits() {
		
	//	return new Limits(10, 100);
		return new Limits(limitConfiguration.getMINIMUM(), limitConfiguration.getMAXIMUM());
	}
	
	

}
