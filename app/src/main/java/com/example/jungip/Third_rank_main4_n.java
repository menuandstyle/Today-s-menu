package com.example.jungip;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Third_rank_main4_n extends Activity implements OnClickListener {
	String arr[] = new String[4];
	Button bt_third_rank_main4_n_end;
	Random rand = new Random();
	TextView tv_third_rank_main4_n_rand;
	Intent intent = getIntent();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_rank_main4_n);
		bt_third_rank_main4_n_end = (Button) findViewById(R.id.bt_third_rank_main4_n_end);
		bt_third_rank_main4_n_end.setOnClickListener(this);
		tv_third_rank_main4_n_rand = (TextView) findViewById(R.id.tv_third_rank_main4_n_rand);
		String value1 = (String) getIntent().getStringExtra("value1");
		String value2 = (String) getIntent().getStringExtra("value2");
		String value3 = (String) getIntent().getStringExtra("value3");
		String value4 = (String) getIntent().getStringExtra("value4");

		arr[0] = value1;
		arr[1] = value2;
		arr[2] = value3;
		arr[3] = value4;
		int randomResult;
		String randomResult1;
		randomResult = rand.nextInt(4);
		randomResult1 = arr[randomResult];
		tv_third_rank_main4_n_rand.setText(randomResult1);

	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch (v.getId()) {
		case R.id.bt_third_rank_main4_n_end:
			moveTaskToBack(true);
			finish();
		}
	}

}
