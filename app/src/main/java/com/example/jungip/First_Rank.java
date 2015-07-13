package com.example.jungip;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class First_Rank extends Activity implements OnClickListener{
	Intent intent;
	Button bt_first_rank_main1_box;
	
	Handler mHandler;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank);
		bt_first_rank_main1_box = (Button)findViewById(R.id.bt_first_rank_main1_box);
		bt_first_rank_main1_box.setOnClickListener(this);                                                                                                                                                                      		
		

	}
	public void onClick(View v) {
		Animation an = null;
		switch (v.getId()) {
		case R.id.bt_first_rank_main1_box:
			an = AnimationUtils.loadAnimation(this, R.anim.box);
			
			bt_first_rank_main1_box.startAnimation(an);
			intent = new Intent(this, First_Rank1.class);
					
			startActivity(intent);
			break;
		}
		
	}

}
