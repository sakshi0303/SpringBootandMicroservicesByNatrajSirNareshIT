package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.CarFactory;

public class Customer1 {

	public static void main(String[] args) {
		ICar  car=CarFactory.getInstance("luxory");
		car.drive();
		
		

	}

}
