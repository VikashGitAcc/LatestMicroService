package com.example.model;

public class Limits {

	private int MINIMUM;
	private int MAXIMUM;
	
	public Limits() {
		
	}
	
	public Limits(int minimum2, int maximum2) {
		super();
		this.MINIMUM=minimum2;
		this.MAXIMUM = maximum2;
	}
	
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
