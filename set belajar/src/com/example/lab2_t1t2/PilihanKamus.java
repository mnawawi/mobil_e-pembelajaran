package com.example.lab2_t1t2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.example.setpembelajaran.R;

public class PilihanKamus extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pilihankamus);
		final ImageButton huruf=(ImageButton)findViewById(R.id.huruf);
		final ImageButton buah= (ImageButton)findViewById(R.id.buah);
		final ImageButton nombor=(ImageButton)findViewById (R.id.nombor);
		final ImageButton haiwan=(ImageButton)findViewById(R.id.haiwan);
		final ImageButton warna=(ImageButton)findViewById(R.id.warna);
		
		final Animation animScale=AnimationUtils.loadAnimation(this,R.anim.scale);
		huruf.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				Intent i=new Intent(PilihanKamus.this,ABC.class);
				startActivity(i);
				onDestroy();
			}
		
		});
		
		buah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				v.startAnimation(animScale);
				Intent i=new Intent (PilihanKamus.this,BUAH.class);
				startActivity(i);
				onDestroy();
				
			}
		});
		
		
		nombor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				Intent i=new Intent (PilihanKamus.this,NOMBOR.class);
				startActivity(i);
				onDestroy();
			}
		});
		
		haiwan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				Intent i=new Intent (PilihanKamus.this,HAIWAN.class);
				startActivity(i);
				onDestroy();
			}
		});
		
		warna.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				Intent i=new Intent (PilihanKamus.this,WARNA.class);
				startActivity(i);
				onDestroy();
			}
		});
	}
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{

	    if (keyCode == KeyEvent.KEYCODE_BACK)
	    {
	    	Intent i=new Intent(PilihanKamus.this,MenuUtama.class);
    		startActivity(i);
    		System.exit(0);
    		onDestroy();
    		finish();
	    	 
	    }

	    return false;
	}	
	
}
