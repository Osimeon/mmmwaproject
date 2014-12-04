package com.jesi.apps.mydawa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.jesi.apps.mydawa.tools.AlertDialogManager;

@SuppressLint("NewApi")
public class MainActivity extends Activity{
	
	AutoCompleteTextView searchBox;
	Button btnOk;
	String[] drugs = {"Amoxyl Syrup", "Amoxyl Oral Syrup", "Amoxyl Migraine Oral", "Amoxyl Tablet"};
	AlertDialogManager alert = new AlertDialogManager();
	

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		searchBox = (AutoCompleteTextView) findViewById(R.id.txtSearchDawa);
		searchBox.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, drugs));
		
		btnOk = (Button) findViewById(R.id.btnSearch);
		btnOk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v){
				if(searchBox.getText().toString().isEmpty()){
					alert.showAlertDialog(MainActivity.this,"Drug Missing","No Drug Specified", false);
				}
				else{
					Intent i = new Intent(MainActivity.this, DrugPageActivity.class);
					startActivity(i);
				}								
			}
		});
	}
}
