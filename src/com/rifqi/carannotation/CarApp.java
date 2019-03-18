package com.rifqi.carannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		
		Car myLancer = context.getBean("sedanCar", Car.class);
		
		SedanCar sLancer = (SedanCar)myLancer;
		sLancer.setBrand("Mitsubishi");
		sLancer.setType("Evolution X");
		System.out.println(sLancer);
		
		context.close();
	}

}
