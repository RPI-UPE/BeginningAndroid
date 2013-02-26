package com.example.helloworld2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				final TextView textView = (TextView) findViewById(R.id.textView1);
				textView.setText("You Rock!");
			}
		});
		
		final Button button2 = (Button)findViewById(R.id.button2);
		final Context that = this;
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				final EditText editText = (EditText) findViewById(R.id.editText1);
            	Intent myIntent = new Intent(that, SecondActivity.class);
            	myIntent.putExtra("name", editText.getText().toString());
            	startActivity(myIntent);
			}
		});
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Context context = getApplicationContext();
		CharSequence text = "Get Ready!";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
