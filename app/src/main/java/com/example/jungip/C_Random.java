package com.example.jungip;

import java.util.Random;

public class C_Random {
	Random rand = new Random();
	private String kindOfFood[] = new String[6];
	private String selectedKindOfFood;
	private int i;
	public C_Random() {
		kindOfFood[0] = "한식";
		kindOfFood[1] = "중식";
		kindOfFood[2] = "일식";
		kindOfFood[3] = "양식";
		kindOfFood[4] = "분식";
		kindOfFood[5] = "기타";
	}

	public String selectKindOfFood() {
		 i = rand.nextInt(6);
		selectedKindOfFood = kindOfFood[i];
		
		return selectedKindOfFood;
	}
	
}
