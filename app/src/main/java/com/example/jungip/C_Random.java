package com.example.jungip;

import java.util.Random;

public class C_Random {
	Random rand = new Random();
	private String kindOfFood[] = new String[6];
	private String selectedKindOfFood;
	private int i;
	public C_Random() {
		kindOfFood[0] = "�ѽ�";
		kindOfFood[1] = "�߽�";
		kindOfFood[2] = "�Ͻ�";
		kindOfFood[3] = "���";
		kindOfFood[4] = "�н�";
		kindOfFood[5] = "��Ÿ";
	}

	public String selectKindOfFood() {
		 i = rand.nextInt(6);
		selectedKindOfFood = kindOfFood[i];
		
		return selectedKindOfFood;
	}
	
}
