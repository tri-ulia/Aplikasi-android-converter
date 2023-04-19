package com.tri.aplikasiuas;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class konvertmatauang extends Activity {


	EditText editidr, editusd, editeur;
	Button buttonkonversimatauang;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_matauang);
		
		editidr= (EditText) findViewById(R.id.editTextidr);
		editusd= (EditText) findViewById(R.id.editTextusd);
		editeur= (EditText) findViewById(R.id.editTexteur);
		buttonkonversimatauang = (Button) findViewById(R.id.buttonConvertcurrency);
		
		
		buttonkonversimatauang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double idr = Double.parseDouble(editidr.getText().toString());
				//double f = Double.parseDouble(editf.getText().toString());
				//double k = Double.parseDouble(editk.getText().toString());
				
				double usd = idr * 0.000067;
				double eur = idr * 0.000064;
				
				editusd.setText(String.valueOf(usd));
				editeur.setText(String.valueOf(eur));
				
		
			}

			private double sqrt(double d) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
	}}
