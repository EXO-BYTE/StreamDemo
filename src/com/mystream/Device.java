package com.mystream;

public class Device {
	
	private String name;
	private String techName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", techName=" + techName + "]";
	}
	public Device() {
	}
	
	public Device(String name,String techName) {
		super();
		this.name=name;
		this.techName=techName;
	}
	}
	


