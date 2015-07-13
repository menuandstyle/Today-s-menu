package com.example.jungip;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class First_Rank2 extends Activity implements OnClickListener {
	Intent intent = getIntent();
	Button bt_first_rank_main3_no;
	Button bt_first_rank_main3_yes;
	TextView tv_first_rank_main3_result;
	C_Random cRD = new C_Random();
	C_DATAOBJ cDO = new C_DATAOBJ();
	private String selectedMenu;
	private int kindOfFoodNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank2);
		tv_first_rank_main3_result = (TextView) findViewById(R.id.tv_first_rank_main3_result);
		bt_first_rank_main3_no = (Button) findViewById(R.id.bt_first_rank_main3_no);
		bt_first_rank_main3_no.setOnClickListener(this);

		bt_first_rank_main3_yes = (Button) findViewById(R.id.bt_first_rank_main3_yes);
		bt_first_rank_main3_yes.setOnClickListener(this);
		 kindOfFoodNum = (int) getIntent().getIntExtra("kindOfFoodNum", -1);
		if (kindOfFoodNum == 0)
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		else if (kindOfFoodNum == 1)
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		else if (kindOfFoodNum == 2)
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		else if (kindOfFoodNum == 3)
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		else if (kindOfFoodNum == 4)
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		else {
			kindOfFoodNum=5;
			this.selectedMenu = cDO.selectedMenu(kindOfFoodNum);
		}
			/* tv_first_rank_main3_result.setText(String.valueOf(kindOfFoodNum)); */
		tv_first_rank_main3_result.setText(this.selectedMenu); 

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// TODO 자동 생성된 메소드 스텁
		case R.id.bt_first_rank_main3_no:
			intent = new Intent(this, First_Rank1.class);
			startActivity(intent);
			break;
		case R.id.bt_first_rank_main3_yes:
			intent = new Intent(this, First_Rank3.class);
			intent.putExtra("selectedMenu", selectedMenu);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			startActivity(intent);
			break;

		}

	}
}
