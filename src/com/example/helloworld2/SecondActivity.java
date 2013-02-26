package com.example.helloworld2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
	private static final String TAG = "SecondActivity";

	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		Intent intent = getIntent();
		setContentView(R.layout.second_layout);
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText(intent.getStringExtra("name"));
	}

}
