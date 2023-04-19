package com.tri.aplikasiuas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class konvertsuhu extends Activity{

	EditText editc, editf, editk;
	Button buttonsuhu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_suhu);
		
		editc= (EditText) findViewById(R.id.editTextC);
		editf= (EditText) findViewById(R.id.editTextF);
		editk= (EditText) findViewById(R.id.editTextK);
		buttonsuhu = (Button) findViewById(R.id.buttonkonvertT);
		
		
		buttonsuhu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double c = Double.parseDouble(editc.getText().toString());
				//double f = Double.parseDouble(editf.getText().toString());
				//double k = Double.parseDouble(editk.getText().toString());
				
				double f = (((c*9)/5)+32);
				double k = (c+273.15);
				
				editf.setText(String.valueOf(f)+ " F");
				editk.setText(String.valueOf(k) + " K");
				
		
			}

			private double sqrt(double d) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
	}}
