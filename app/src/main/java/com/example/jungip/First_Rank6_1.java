package com.example.jungip;

import java.util.Random;

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

public class First_Rank6_1 extends Activity implements OnClickListener {
	Button bt_first_rank_main7_1_end;
	Button btnback;
	Button calldirect;
	Intent intent = getIntent();
	Random rand = new Random();
	C_DATAOBJ cDO = new C_DATAOBJ();
	WebView mWeb;
	private String selectedMenu = "";
	private int kindOfFoodNum, value1;
	private String foodStoreName = "";
	private String url;
	private String tel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first__rank6_1);

		bt_first_rank_main7_1_end = (Button) findViewById(R.id.bt_first_rank_main7_1_end);
		bt_first_rank_main7_1_end.setOnClickListener(this);

		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);

		calldirect = (Button) findViewById(R.id.calldirect);
		calldirect.setOnClickListener(this);

		foodStoreName = (String) getIntent().getStringExtra("foodStoreName1");
		this.selectedMenu = (String) getIntent().getStringExtra("selectedMenu");
		url = cDO.selectedUrl(foodStoreName, url);

		mWeb = (WebView) findViewById(R.id.web);
		mWeb.setWebViewClient(new MyWebClient());
		WebSettings set = mWeb.getSettings();
		set.setJavaScriptEnabled(true);
		set.setBuiltInZoomControls(true);
		mWeb.loadUrl(url); // ���� �������� ���õ� �������� �ּҰ� ����.

		tel = cDO.selectedTel(foodStoreName, tel);
	}

	@Override
	public void onClick(View v) {
		// TODO �ڵ� ������ �޼ҵ� ����
		switch (v.getId()) {
		case R.id.bt_first_rank_main7_1_end:
			moveTaskToBack(true);
			break;
		case R.id.btnback: {
			if (mWeb.canGoBack()) 
				mWeb.goBack();
			
			break; // �̰� ������, �׸𿡼� �� ������ ��ü�������� �� �ٽ� �ڷ� �� �� �ִ�. �̰� ������ �ڷ� ��
					// ���ư���.
		}
		case R.id.calldirect:
			Uri number;
			number = Uri.parse("tel:" + tel); // ���� �������� ������ �������� ��ȣ�� ����.
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
