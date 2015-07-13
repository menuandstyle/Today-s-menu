package com.example.jungip;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.jungip.First_Rank6_1.MyWebClient;

public class Second_Rank6_1 extends Activity implements OnClickListener {
Button bt_second_rank_main7_1_end;
Button btnback1;
Button calldirect1;
Intent intent = getIntent();
C_DATAOBJ cDO=new C_DATAOBJ();
WebView mWeb1;
private String selectedMenu="";
private int kindOfFoodNum,value1;
private String foodStoreName = "";
private String url;
private String tel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second__rank6_1);

		bt_second_rank_main7_1_end = (Button)findViewById(R.id.bt_second_rank_main7_1_end);
		bt_second_rank_main7_1_end.setOnClickListener(this);
		btnback1 = (Button)findViewById(R.id.btnback1);
		btnback1.setOnClickListener(this);
		
		calldirect1 = (Button)findViewById(R.id.calldirect1);
		calldirect1.setOnClickListener(this);
		foodStoreName = (String) getIntent().getStringExtra("foodStoreName1");
		this.selectedMenu = (String) getIntent().getStringExtra("selectedMenu");
		url = cDO.selectedUrl(foodStoreName, url);

		mWeb1 = (WebView) findViewById(R.id.web1);
		mWeb1.setWebViewClient(new MyWebClient());
		WebSettings set = mWeb1.getSettings();
		set.setJavaScriptEnabled(true);
		set.setBuiltInZoomControls(true);
		mWeb1.loadUrl(url); // 여기 랜덤으로 선택된 음식점의 주소가 들어간다.

		tel = cDO.selectedTel(foodStoreName, tel);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO 자동 생성된 메소드 스텁
		switch(v.getId()){
		case R.id.bt_second_rank_main7_1_end:
			moveTaskToBack(true);
			finish();
			break;
		
	case R.id.btnback1: {
		if (mWeb1.canGoBack()) 
			mWeb1.goBack();
		
		break; // 이걸 누르면, 네모에서 뜬 지도를 전체보기했을 때 다시 뒤로 갈 수 있다. 이게 없으면 뒤로 못
				// 돌아간다.
	}
	case R.id.calldirect1:
		Uri number;
		number = Uri.parse("tel:" + tel); // 여기 랜덤으로 선택한 음식점의 번호가 들어간다.
		intent = new Intent(Intent.ACTION_CALL, number);
		startActivity(intent);
		break;

	}
	}

	class MyWebClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}

	

}
