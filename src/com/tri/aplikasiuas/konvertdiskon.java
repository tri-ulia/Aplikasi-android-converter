package com.tri.aplikasiuas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class konvertdiskon extends Activity{

	EditText editawal, editakhir, editdiskon;
	Button buttondiskon;
	TextView save;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.halaman_diskon);
		
		editawal= (EditText) findViewById(R.id.editTexthargaawal);
		editakhir= (EditText) findViewById(R.id.editTexthargaakhir);
		editdiskon= (EditText) findViewById(R.id.editTextpersendiskon);

		save = (TextView) findViewById(R.id.textViewket);
		
		buttondiskon = (Button) findViewById(R.id.buttonKonvertdiskon);
		
		
		buttondiskon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double a = Double.parseDouble(editawal.getText().toString());
				double d = Double.parseDouble(editdiskon.getText().toString());
				
				double hasildiskon = (d/100)*a;
				 
				double untung = a - hasildiskon ;
			
				
				editakhir.setText("Rp. "+String.valueOf(untung));
				save.setText("you Save Rp. "+ String.valueOf(hasildiskon));
			}

			private double sqrt(double d) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
	}}
