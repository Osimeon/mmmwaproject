package com.jesi.apps.mydawa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultsPageActivity extends Activity{
	Button btnTrack;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_results_page);
		
		if(android.os.Build.VERSION.SDK_INT >= 11){
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
		
		btnTrack = (Button) findViewById(R.id.btnTrack);
		btnTrack.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v){
				Intent i = new Intent(ResultsPageActivity.this, TrackPageActivity.class);
				startActivity(i);
			}
		});
	}
}
