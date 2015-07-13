package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_Rank4 extends Activity implements OnClickListener{
	Intent  intent = getIntent();
	Button bt_second_rank_main5_jung;
	Button bt_second_rank_main5_joong;
	Button bt_second_rank_main5_hoo;
	private String selectedMenu;
	private int kindOfFoodNum;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank4);
		bt_second_rank_main5_jung = (Button)findViewById(R.id.bt_second_rank_main5_jung);
		bt_second_rank_main5_joong = (Button)findViewById(R.id.bt_second_rank_main5_joong);
		bt_second_rank_main5_hoo = (Button)findViewById(R.id.bt_second_rank_main5_hoo);
		
		bt_second_rank_main5_jung.setOnClickListener(this);
		bt_second_rank_main5_joong.setOnClickListener(this);
		bt_second_rank_main5_hoo.setOnClickListener(this);
		
		this.kindOfFoodNum = (int)getIntent().getIntExtra("kindOfFoodNum", -1);
		this.selectedMenu =(String)getIntent().getStringExtra("selectedMenu");
		
		

	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch(v.getId()){
		case R.id.bt_second_rank_main5_jung:
			intent = new Intent(this,Second_Rank5.class);
			intent.putExtra("value1", 0);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main5_joong:
			intent = new Intent(this,Second_Rank5.class);
			intent.putExtra("value1", 1);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main5_hoo:
			intent = new Intent(this,Second_Rank5.class);
			intent.putExtra("value1", 2);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		}
		
	}

}
