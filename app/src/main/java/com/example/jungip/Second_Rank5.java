package com.example.jungip;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Second_Rank5 extends Activity implements OnClickListener {
	ArrayList<String> Items;
	ArrayAdapter<String> Adapter;
	ListView list1;
	ListView listView;
	Intent intent = getIntent();
	Button bt_second_rank_main6_randomdecision;
	Button bt_second_rank_main6_pointppl;
	Button bt_second_rank_main6_decisionend;
	C_DATAOBJ cDO = new C_DATAOBJ();
	private int value1;
	private int kindOfFoodNum;
	private String selectedMenu;
	private String foodStoreName = "";
	private String foodStoreName1[] = new String[5];
	private String foodName1 = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank5);
		bt_second_rank_main6_randomdecision = (Button) findViewById(R.id.bt_second_rank_main6_randomdecision);
		bt_second_rank_main6_pointppl = (Button) findViewById(R.id.bt_second_rank_main6_pointppl);
		bt_second_rank_main6_decisionend = (Button) findViewById(R.id.bt_second_rank_main6_decisionend);

		bt_second_rank_main6_randomdecision.setOnClickListener(this);
		bt_second_rank_main6_pointppl.setOnClickListener(this);
		bt_second_rank_main6_decisionend.setOnClickListener(this);

		value1 = (int) getIntent().getIntExtra("value1", -1);
	    selectedMenu = (String) getIntent().getStringExtra("selectedMenu");
		kindOfFoodNum = (int) getIntent().getIntExtra("kindOfFoodNum", -1);

		foodStoreName1 = cDO.storeName(this.value1, this.kindOfFoodNum,
				this.selectedMenu);
		Items = new ArrayList<String>();
		Items.add(foodStoreName1[0]);
		Items.add(foodStoreName1[1]);
		Items.add(foodStoreName1[2]);
		Items.add(foodStoreName1[3]);
		Items.add(foodStoreName1[4]);

		Adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Items);
		list1 = (ListView) findViewById(R.id.lv_list1);
		list1.setAdapter(Adapter);

	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch (v.getId()) {
		case R.id.bt_second_rank_main6_randomdecision:
			intent = new Intent(this, Second_Rank6_1.class);
			intent.putExtra("foodStoreName1", foodStoreName1[0]);
			intent.putExtra("value1", value1);
			intent.putExtra("kindOfFoodNum", kindOfFoodNum);
			intent.putExtra("selectedMenu", selectedMenu);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main6_pointppl:
			intent = new Intent(this, Second_Rank6_2.class);
			startActivity(intent);
			break;
		case R.id.bt_second_rank_main6_decisionend:
			moveTaskToBack(true);
			finish();
			break;

		}
	}

}
