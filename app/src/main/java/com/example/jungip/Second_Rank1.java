package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Second_Rank1 extends Activity implements OnClickListener{
	Intent intent = getIntent();
	Button bt_second_rank_main2_box;
	private int kindOfFoodNum;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank1);
		bt_second_rank_main2_box = (Button) findViewById(R.id.bt_second_rank_main2_box);
		bt_second_rank_main2_box.setOnClickListener(this);
		
		this.kindOfFoodNum = (int)getIntent().getIntExtra("kindOfFoodNum",-1);
		
		}
		
	

	@Override
	public void onClick(View v) {
		Animation an=null;
		switch(v.getId()){
		case R.id.bt_second_rank_main2_box:
			an=AnimationUtils.loadAnimation(this, R.anim.box);
			bt_second_rank_main2_box.startAnimation(an);
			intent = new Intent(this, Second_Rank2.class);
			intent.putExtra("kindOfFoodNum", this.kindOfFoodNum);
			startActivity(intent);
			break;
		}
	}

	
	}


