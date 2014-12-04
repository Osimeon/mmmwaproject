package com.jesi.apps.mydawa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackPageActivity extends Activity{
	Button btnSet;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_track_page);
		
		if(android.os.Build.VERSION.SDK_INT >= 11){
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
		
		btnSet = (Button) findViewById(R.id.btnSet);
		btnSet.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v){
				Intent i = new Intent(TrackPageActivity.this, FeedbackPageActivity.class);
				startActivity(i);
			}
		});
	}
}
