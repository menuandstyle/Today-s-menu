package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First_Rank3 extends Activity implements OnClickListener{
	Intent intent=getIntent();
	private String selectedMenu;
	private int kindOfFoodNum;
	Button bt_first_rank_main4_yes;
	Button bt_first_rank_main4_end;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank3);
		selectedMenu = (String) getIntent().getStringExtra("selectedMenu");
		kindOfFoodNum = (int)getIntent().getIntExtra("kindOfFoodNum", -1);
		bt_first_rank_main4_yes = (Button)findViewById(R.id.bt_first_rank_main4_yes);
		bt_first_rank_main4_yes.setOnClickListener(this);
		
		bt_first_rank_main4_end = (Button)findViewById(R.id.bt_first_rank_main4_end);
		bt_first_rank_main4_end.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch(v.getId()){
		case R.id.bt_first_rank_main4_yes:
			intent = new Intent(this, First_Rank4.class);
			intent.putExtra("selectedMenu", selectedMenu);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			startActivity(intent);
			break;
		case R.id.bt_first_rank_main4_end:
			//this.finish();
			moveTaskToBack(true);
			finish();
		}
	}

	
	

}
