package com.example.jungip;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Select_Rank extends Activity implements OnClickListener{
	Button bt_select_rank_first;
	Button bt_select_rank_second;
	Button bt_select_rank_third;
	Button bt_select_rank_question;
	Intent intent;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select__rank);

		bt_select_rank_first = (Button) findViewById(R.id.bt_select_rank_first);
		bt_select_rank_second = (Button) findViewById(R.id.bt_select_rank_second);
		bt_select_rank_third = (Button) findViewById(R.id.bt_select_rank_third);
		bt_select_rank_question = (Button) findViewById(R.id.bt_select_rank_question);
		
		bt_select_rank_first.setOnClickListener(this);
		bt_select_rank_second.setOnClickListener(this);
		bt_select_rank_third.setOnClickListener(this);
		bt_select_rank_question.setOnClickListener(this);

	}

	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.bt_select_rank_first:
			intent = new Intent(this, First_Rank.class);
			startActivity(intent);
			break;
		case R.id.bt_select_rank_second:
			intent = new Intent(this, Second_Rank.class);
			startActivity(intent);
			break;
		case R.id.bt_select_rank_third:
			intent = new Intent(this, Third_rank_main1.class);
			startActivity(intent);
			break;
		case R.id.bt_select_rank_question:
			  Context mContext = getApplicationContext();
	            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
	 
	            //R.layout.dialog�� xml ���ϸ��̰�  R.id.popup�� ������ ���̾ƿ� ���̵�
	            View layout = inflater.inflate(R.layout.dialog,(ViewGroup) findViewById(R.id.popup));
	            AlertDialog.Builder aDialog = new AlertDialog.Builder(this);
	         
	            aDialog.setTitle("����"); //Ÿ��Ʋ�� ����
	            aDialog.setView(layout); //dialog.xml ������ ��� ����
	         
	            //�׳� �ݱ��ư�� ���� �κ�
	            aDialog.setNegativeButton("�ݱ�", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	            }
	        });
	        //�˾�â ����
	        AlertDialog ad = aDialog.create();
	        ad.show();//������!
	    }
			

		}
}
