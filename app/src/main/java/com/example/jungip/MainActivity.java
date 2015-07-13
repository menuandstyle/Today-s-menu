package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener  {
	Intent intent;
	Button bt_mainpagestart;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt_mainpagestart = (Button)findViewById(R.id.bt_mainpagestart);
		
		bt_mainpagestart.setOnClickListener(this);
	}
	public void onClick(View v){
		switch(v.getId()){
		case R.id.bt_mainpagestart:
		intent = new Intent(this, Select_Rank.class);
		startActivity(intent);
		break;
	}
	}
	
}
//intent,activitystack