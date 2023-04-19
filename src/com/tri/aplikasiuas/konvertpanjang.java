package com.tri.aplikasiuas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class konvertpanjang extends Activity {

	EditText editcm, editft, editin;
	Button buttonkonversilength;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_panjang);
		
		editcm= (EditText) findViewById(R.id.editTextcm);
		editft= (EditText) findViewById(R.id.editTextft);
		editin= (EditText) findViewById(R.id.editTextin);
		buttonkonversilength = (Button) findViewById(R.id.buttonConvertLength);
		
		
		buttonkonversilength.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double cm = Double.parseDouble(editcm.getText().toString());
				//double f = Double.parseDouble(editf.getText().toString());
				//double k = Double.parseDouble(editk.getText().toString());
				
				double ft = cm * 0.032808399;
				double in = cm * 0.393700787;
				
				editft.setText(String.valueOf(ft));
				editin.setText(String.valueOf(in));
				
		
			}

			private double sqrt(double d) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
	}}
