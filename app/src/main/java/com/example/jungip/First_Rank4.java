package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First_Rank4 extends Activity implements OnClickListener {
	Intent intent = getIntent();
	Button bt_first_rank_main5_jung;
	Button bt_first_rank_main5_joong;
	Button bt_first_rank_main5_hoo;
	private String selectedMenu;
	private int kindOfFoodNum;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank4);

		this.selectedMenu = (String)getIntent().getStringExtra("selectedMenu");
		this.kindOfFoodNum = (int)getIntent().getIntExtra("kindOfFoodNum", -1);
		bt_first_rank_main5_jung = (Button) findViewById(R.id.bt_first_rank_main5_jung);
		bt_first_rank_main5_joong = (Button) findViewById(R.id.bt_first_rank_main5_joong);
		bt_first_rank_main5_hoo = (Button) findViewById(R.id.bt_first_rank_main5_hoo);

		bt_first_rank_main5_jung.setOnClickListener(this);
		bt_first_rank_main5_joong.setOnClickListener(this);
		bt_first_rank_main5_hoo.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch (v.getId()) {
		case R.id.bt_first_rank_main5_jung:
			intent = new Intent(this, First_Rank5.class);
			intent.putExtra("value1", 0);
			intent.putExtra("selectedMenu", selectedMenu);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			startActivity(intent);
			break;
		case R.id.bt_first_rank_main5_joong:
			intent = new Intent(this, First_Rank5.class);
			intent.putExtra("value1", 1);
			intent.putExtra("selectedMenu", selectedMenu);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);

			startActivity(intent);
			break;
		case R.id.bt_first_rank_main5_hoo:
			intent = new Intent(this, First_Rank5.class);
			intent.putExtra("value1", 2);
			intent.putExtra("selectedMenu", selectedMenu);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);

			startActivity(intent);
			break;
		}
	}

}
