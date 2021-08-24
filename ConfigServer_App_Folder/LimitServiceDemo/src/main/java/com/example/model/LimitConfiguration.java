package com.example.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
	
	int MINIMUM;
	int MAXIMUM;
	public int getMINIMUM() {
		return MINIMUM;
	}
	public void setMINIMUM(int mINIMUM) {
		MINIMUM = mINIMUM;
	}
	public int getMAXIMUM() {
		return MAXIMUM;
	}
	public void setMAXIMUM(int mAXIMUM) {
		MAXIMUM = mAXIMUM;
	}
	

}
