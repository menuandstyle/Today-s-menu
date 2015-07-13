package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class First_Rank1 extends Activity implements OnClickListener {
	Intent intent;
	C_Random cRD = new C_Random();
	Button bt_first_rank_main2_no;
	Button bt_first_rank_main2_yes;
	TextView tv_first_rank_main2_result;
	String kindOfFood;
	int kindOfFoodNum;
		@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank1);
	
		tv_first_rank_main2_result = (TextView)findViewById(R.id.tv_first_rank_main2_result);
		
		bt_first_rank_main2_no = (Button)findViewById(R.id.bt_first_rank_main2_no);
		bt_first_rank_main2_no.setOnClickListener(this);
		
		bt_first_rank_main2_yes = (Button)findViewById(R.id.bt_first_rank_main2_yes);
		bt_first_rank_main2_yes.setOnClickListener(this);
		
		kindOfFood = cRD.selectKindOfFood();
		if(kindOfFood.equals("한식"))
			kindOfFoodNum = 0;
		else if(kindOfFood.equals("중식"))
			kindOfFoodNum=1;
		else if(kindOfFood.equals("일식"))
			kindOfFoodNum=2;
		else if(kindOfFood.equals("양식"))
			kindOfFoodNum=3;
		else if(kindOfFood.equals("분식"))
			kindOfFoodNum=4;
		else 
			kindOfFoodNum=5;
			
		tv_first_rank_main2_result.setText(kindOfFood);
	
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_first_rank_main2_no:
			intent = new Intent(this, First_Rank.class);
			startActivity(intent);
			break;
		case R.id.bt_first_rank_main2_yes:
			intent = new Intent(this, First_Rank2.class);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			startActivity(intent);
			break;
		
	}

	
	}
	
}


