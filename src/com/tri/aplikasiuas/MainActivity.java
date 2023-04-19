package com.tri.aplikasiuas;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttontemp = (Button) findViewById(R.id.buttonTemp);
		buttontemp.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			// TODO Auto-generated method stub
				Intent intent = new Intent(arg0.getContext(), konvertsuhu.class);
			startActivity(intent);
			}
		 });
		
		Button buttondiskonn = (Button) findViewById(R.id.buttonDiskon);
		buttondiskonn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			// TODO Auto-generated method stub
				Intent intent = new Intent(arg0.getContext(), konvertdiskon.class);
			startActivity(intent);
			}
		 });
		
		Button buttonmatauang = (Button) findViewById(R.id.buttonCurrency);
		buttonmatauang.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			// TODO Auto-generated method stub
				Intent intent = new Intent(arg0.getContext(), konvertmatauang.class);
			startActivity(intent);
			}
		 });
		
		
		Button buttonlength = (Button) findViewById(R.id.buttonLength);
		buttonlength.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			// TODO Auto-generated method stub
				Intent intent = new Intent(arg0.getContext(), konvertpanjang.class);
			startActivity(intent);
			}
		 });
		
		Button buttonpetunjuk = (Button) findViewById(R.id.buttonGuide);
		buttonpetunjuk.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			// TODO Auto-generated method stub
				Intent intent = new Intent(arg0.getContext(), halamanpetunjuk.class);
			startActivity(intent);
			}
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
