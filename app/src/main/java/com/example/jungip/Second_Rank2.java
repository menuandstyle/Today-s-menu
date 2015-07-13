package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Second_Rank2 extends Activity implements OnClickListener {
	Intent intent = getIntent();
	TextView tv_second_rank_main3_result;
	Button bt_second_rank_main3_no;
	Button bt_second_rank_main3_yes;
	C_Random cRD = new C_Random();
	C_DATAOBJ cDO = new C_DATAOBJ();
	private String selectedMenu;
	private int kindOfFoodNum;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank2);
		tv_second_rank_main3_result = (TextView)findViewById(R.id.tv_second_rank_main3_result);
		bt_second_rank_main3_no = (Button)findViewById(R.id.bt_second_rank_main3_no);
		bt_second_rank_main3_no.setOnClickListener(this);
		
		bt_second_rank_main3_yes = (Button)findViewById(R.id.bt_second_rank_main3_yes);
		bt_second_rank_main3_yes.setOnClickListener(this);
		 this.kindOfFoodNum = (int) getIntent().getIntExtra("kindOfFoodNum", -1);
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
			tv_second_rank_main3_result.setText(selectedMenu); 

		
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch(v.getId()){
		case R.id.bt_second_rank_main3_no:
			intent = new Intent(this, Second_Rank1.class);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main3_yes:
			intent = new Intent(this, Second_Rank3.class);
			intent.putExtra("kindOfFoodNum",kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		
		}
		
	}

	
	

}
