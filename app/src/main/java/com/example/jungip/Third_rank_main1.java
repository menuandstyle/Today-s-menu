package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Third_rank_main1 extends Activity implements OnClickListener {
	Intent intent;
	Button bt_third_rank_main1_2;
	Button bt_third_rank_main1_3;
	Button bt_third_rank_main1_4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_rank_main1);

	
		bt_third_rank_main1_2 = (Button) findViewById(R.id.bt_third_rank_main1_2);
		bt_third_rank_main1_3 = (Button) findViewById(R.id.bt_third_rank_main1_3);
		bt_third_rank_main1_4 = (Button) findViewById(R.id.bt_third_rank_main1_4);

		bt_third_rank_main1_2.setOnClickListener(this);
		bt_third_rank_main1_3.setOnClickListener(this);
		bt_third_rank_main1_4.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_third_rank_main1_2:
			intent = new Intent(this, Third_rank_main2.class);
			startActivity(intent);
			break;
			
		case R.id.bt_third_rank_main1_3:
			intent = new Intent(this, Third_rank_main3.class);
			startActivity(intent);
			break;
			
		case R.id.bt_third_rank_main1_4:
			intent = new Intent(this, Third_rank_main4.class);
			startActivity(intent);
			break;

		}
	}

}
