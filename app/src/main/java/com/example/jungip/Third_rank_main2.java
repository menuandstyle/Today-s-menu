package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Third_rank_main2 extends Activity implements OnClickListener {
	Intent intent;
	Button bt_third_rank_main2_1;
	Button bt_third_rank_main2_2;
	Button bt_third_rank_main2_next;
	Button bt_third_rank_main2_back;
	EditText et_third_rank_main2_input1;
	EditText et_third_rank_main2_input2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_rank_main2);

		 bt_third_rank_main2_1 = (Button)findViewById(R.id. bt_third_rank_main2_1);
		 bt_third_rank_main2_2 = (Button)findViewById(R.id. bt_third_rank_main2_2);
		 bt_third_rank_main2_next = (Button)findViewById(R.id. bt_third_rank_main2_next);
		 bt_third_rank_main2_back = (Button)findViewById(R.id. bt_third_rank_main2_back);
		 
		 et_third_rank_main2_input1=(EditText)findViewById(R.id.et_third_rank_main2_input1);
		 et_third_rank_main2_input2=(EditText)findViewById(R.id.et_third_rank_main2_input2);
		 
		 
		 bt_third_rank_main2_1.setOnClickListener(this);
		 bt_third_rank_main2_2.setOnClickListener(this);
		 bt_third_rank_main2_next.setOnClickListener(this);
		 bt_third_rank_main2_back.setOnClickListener(this);
	
	
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		String value1="";
		String value2="";
		switch(v.getId())
		{
		case R.id.bt_third_rank_main2_1:
			value1 =et_third_rank_main2_input1.getText().toString();
			break;
		case R.id.bt_third_rank_main2_2:
			value2 =et_third_rank_main2_input2.getText().toString();
			break;
		case R.id.bt_third_rank_main2_next:
			intent = new Intent(this,Third_rank_main2_n.class );
			value1 =et_third_rank_main2_input1.getText().toString();
			value2 =et_third_rank_main2_input2.getText().toString();
			intent.putExtra("value1", value1);
			intent.putExtra("value2", value2);
			startActivity(intent);
			break;
		case R.id.bt_third_rank_main2_back:
			intent = new Intent(this, Third_rank_main1.class);
			startActivity(intent);
			break;
		}
		
	}
}
