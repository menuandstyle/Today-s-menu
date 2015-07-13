package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second_Rank3 extends Activity implements OnClickListener{
	Intent intent = getIntent();
	Button bt_second_rank_main4_yes;
	Button bt_second_rank_main4_end;
	private int kindOfFoodNum;
	private String selectedMenu;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank3);

		bt_second_rank_main4_yes = (Button)findViewById(R.id.bt_second_rank_main4_yes);
		bt_second_rank_main4_yes.setOnClickListener(this);
		
		bt_second_rank_main4_end = (Button)findViewById(R.id.bt_second_rank_main4_end);
		bt_second_rank_main4_end.setOnClickListener(this);
		this.kindOfFoodNum = (int)getIntent().getIntExtra("kindOfFoodNum", -1);
		this.selectedMenu = (String)getIntent().getStringExtra("selectedMenu");
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch(v.getId()){
		case R.id.bt_second_rank_main4_end:
			moveTaskToBack(true);
			finish();//종료하는거 찾아내기
		break;
		case R.id.bt_second_rank_main4_yes:
			intent = new Intent(this, Second_Rank4.class);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		
			
		
		}
		
	}

	

}
