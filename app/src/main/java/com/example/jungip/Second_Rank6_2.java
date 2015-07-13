package com.example.jungip;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Second_Rank6_2 extends Activity implements OnClickListener {
	Button mBtnAnim;
	Button bt_second_rank_main7_2_decisionend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank6_2);
		mBtnAnim = (Button) findViewById(R.id.bt_second_rank_main7_2_pen);

		bt_second_rank_main7_2_decisionend = (Button) findViewById(R.id.bt_second_rank_main7_2_decisionend);
		bt_second_rank_main7_2_decisionend.setOnClickListener(this);

	}

	public void mOnClick(View v) {

		Animation anim = null;

		int i = (int) (Math.random() * 13); // 13���� ������ �����ϰ� �������� ������ ���� i

		if (i == 0) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_90);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 1) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_110);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 2) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_154);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 3) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_162);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 4) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_196);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 5) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_246);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 6) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_259);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 7) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_280);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 8) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_307);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 9) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_335);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 10) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_23);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else if (i == 11) {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_40);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		} else {
			switch (v.getId()) {
			case R.id.bt_second_rank_main7_2_pen:
				// ������� ����, ���� ���� 3�辿 Ŀ����.
				anim = AnimationUtils.loadAnimation(this, R.anim.pen_60);
				mBtnAnim.startAnimation(anim); // ������� 0.1�ʰ� 6�� ����, ���� ���� 4�辿
												// 0.01�ʰ� 60�� Ŀ����.
				break;
			}
		}

	}

	@Override
	public void onClick(View v) {
		// TODO �ڵ� ������ �޼ҵ� ����
		switch(v.getId()){
		case R.id.bt_second_rank_main7_2_decisionend:
			moveTaskToBack(true);
			break;
		}
	}

}
