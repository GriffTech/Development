package com.grifftech.helloworld;


class Vehicle {
	String make;
	String model;
	String engine;
	String body;
	int doors;
	
	String description(){
		//System.out.println(make + " " + model + " " + body + " " +engine);
		return make + " " + model + " " + body + " " +engine;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// 
		Vehicle russcar = new Vehicle();
		russcar.make = "Audi";
		russcar.model = "S3";
		russcar.body = "Sportback";
		russcar.engine = "20T";
		
		Vehicle suescar = new Vehicle();
		suescar.make = "Vauxhall";
		suescar.model = "Astra";
		suescar.body = "Tourer";
		suescar.engine = "1.6";
		
		//String desc = suescar.description();
		System.out.println("Description: "+suescar.description());
		System.out.println("Description: "+russcar.description());	
	}
}
