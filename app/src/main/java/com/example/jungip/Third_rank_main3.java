package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Third_rank_main3 extends Activity implements OnClickListener {
	Intent intent;
	Button bt_third_rank_main3_1;
	Button bt_third_rank_main3_2;
	Button bt_third_rank_main3_3;
	Button bt_third_rank_main3_next;
	Button bt_third_rank_main3_back;

	EditText et_third_rank_main3_input1;
	EditText et_third_rank_main3_input2;
	EditText et_third_rank_main3_input3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_rank_main3);

		bt_third_rank_main3_1 = (Button) findViewById(R.id.bt_third_rank_main3_1);
		bt_third_rank_main3_2 = (Button) findViewById(R.id.bt_third_rank_main3_2);
		bt_third_rank_main3_3 = (Button) findViewById(R.id.bt_third_rank_main3_3);
		bt_third_rank_main3_next = (Button) findViewById(R.id.bt_third_rank_main3_next);
		bt_third_rank_main3_back = (Button) findViewById(R.id.bt_third_rank_main3_back);
		et_third_rank_main3_input1 = (EditText) findViewById(R.id.et_third_rank_main3_input1);
		et_third_rank_main3_input2 = (EditText) findViewById(R.id.et_third_rank_main3_input2);
		et_third_rank_main3_input3 = (EditText) findViewById(R.id.et_third_rank_main3_input3);
		
		 bt_third_rank_main3_1.setOnClickListener(this);
		 bt_third_rank_main3_2.setOnClickListener(this);
		 bt_third_rank_main3_3.setOnClickListener(this);
		 bt_third_rank_main3_next.setOnClickListener(this);
		 bt_third_rank_main3_back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		String value1="";
		String value2="";
		String value3="";
		switch(v.getId())
		{
		case R.id.bt_third_rank_main3_1:
			value1 =et_third_rank_main3_input1.getText().toString();
			break;
		case R.id.bt_third_rank_main3_2:
			value2 =et_third_rank_main3_input2.getText().toString();
			break;
		case R.id.bt_third_rank_main3_3:
			value2 =et_third_rank_main3_input3.getText().toString();
			break;
		case R.id.bt_third_rank_main3_next:
			intent = new Intent(this,Third_rank_main3_n.class );
			value1 =et_third_rank_main3_input1.getText().toString();
			value2 =et_third_rank_main3_input2.getText().toString();
			value3 =et_third_rank_main3_input3.getText().toString();
			intent.putExtra("value1", value1);
			intent.putExtra("value2", value2);
			intent.putExtra("value3", value3);
			startActivity(intent);
			break;
		case R.id.bt_third_rank_main3_back:
			intent = new Intent(this,Third_rank_main1.class );
			startActivity(intent);
		}
	}

}
