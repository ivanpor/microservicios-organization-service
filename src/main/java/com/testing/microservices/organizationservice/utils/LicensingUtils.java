package com.testing.microservices.organizationservice.utils;

import java.util.Random;

public class LicensingUtils {

	
	public static void slowRandomRequest() {
		
		int[] items = new int[]{1,2,3};
		
		Random random = new Random();
		int pos = random.nextInt(items.length);
		int num = items[pos];
		
		if(num == 3) {
			sleep();
		}
	}
	
	private static void sleep() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
