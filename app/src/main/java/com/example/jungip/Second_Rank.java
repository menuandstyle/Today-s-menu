package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_Rank extends Activity implements OnClickListener {
	Intent intent;
	Button bt_second_rank_main1_hansik;
	Button bt_second_rank_main1_yangsik;
	Button bt_second_rank_main1_joongsik;
	Button bt_second_rank_main1_boonsik;
	Button bt_second_rank_main1_ilsik;
	Button bt_second_rank_main1_other;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank);
		bt_second_rank_main1_hansik = (Button) findViewById(R.id.bt_second_rank_main1_hansik);
		bt_second_rank_main1_yangsik = (Button) findViewById(R.id.bt_second_rank_main1_yangsik);
		bt_second_rank_main1_joongsik = (Button) findViewById(R.id.bt_second_rank_main1_joongsik);
		bt_second_rank_main1_boonsik = (Button) findViewById(R.id.bt_second_rank_main1_boonsik);
		bt_second_rank_main1_ilsik = (Button) findViewById(R.id.bt_second_rank_main1_ilsik);
		bt_second_rank_main1_other = (Button) findViewById(R.id.bt_second_rank_main1_other);

		bt_second_rank_main1_hansik.setOnClickListener(this);
		bt_second_rank_main1_yangsik.setOnClickListener(this);
		bt_second_rank_main1_joongsik.setOnClickListener(this);
		bt_second_rank_main1_boonsik.setOnClickListener(this);
		bt_second_rank_main1_ilsik.setOnClickListener(this);
		bt_second_rank_main1_other.setOnClickListener(this);

		
	}
	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		int value1 = 0;
		int value2 = 1;
		int value3 = 2;
		int value4 = 3;
		int value5 = 4;
		int value6 = 5;
		switch(v.getId())
		{
		case R.id.bt_second_rank_main1_hansik:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value1);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main1_yangsik:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value4);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main1_joongsik:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value2);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main1_boonsik:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value5);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main1_ilsik:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value3);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main1_other:
			intent = new Intent(this, Second_Rank1.class);
			intent.putExtra("kindOfFoodNum", value6);
			startActivity(intent);
			break;
			
		
		
		}	
	}

	

}



