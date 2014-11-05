package com.example.lab2_t1t2;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.setpembelajaran.R;

public class Lima extends Activity {
	MediaPlayer ourSound;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lima);
		final ImageButton bm=(ImageButton)findViewById(R.id.bm);
		final ImageButton bi= (ImageButton)findViewById(R.id.en);
		final ImageButton cn=(ImageButton)findViewById (R.id.cn);
		final ImageButton tm=(ImageButton)findViewById(R.id.tm);
		final ImageButton kd=(ImageButton)findViewById(R.id.kd);
		final ImageButton home=(ImageButton)findViewById(R.id.home);
		final ImageButton depan=(ImageButton)findViewById(R.id.depan);
		final ImageButton belakang=(ImageButton)findViewById(R.id.belakang);
		final ImageButton objek=(ImageButton)findViewById(R.id.objek);
		final ImageButton abc=(ImageButton)findViewById(R.id.abc);
		final TextView text=(TextView)findViewById(R.id.text);
		
		
		final Animation animScale1=AnimationUtils.loadAnimation(this,R.anim.scale);
		final Animation animScale=AnimationUtils.loadAnimation(this,R.anim.scale1);
		final Animation animRot=AnimationUtils.loadAnimation(this,R.anim.rotate);
		final Animation animRotB=AnimationUtils.loadAnimation(this,R.anim.rotatebelakang);
		bm.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				ourSound=MediaPlayer.create(Lima.this, R.raw.lima);
				ourSound.start();
				text.setText("Lima");
				text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
			}
		
		});
		
		bi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				v.startAnimation(animScale);
				ourSound=MediaPlayer.create(Lima.this, R.raw.five);
				ourSound.start();
				text.setText("Five");
				text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
				
			}
		});
		
		
		cn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				ourSound=MediaPlayer.create(Lima.this, R.raw.limac);
				ourSound.start();
				text.setText("wǔ");
				text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
			}
		});
		
		tm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				ourSound=MediaPlayer.create(Lima.this, R.raw.limat);
				ourSound.start();
				text.setText("Ainthu");
				text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
			}
		});
		
		kd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animScale);
				ourSound=MediaPlayer.create(Lima.this, R.raw.limak);
				ourSound.start();
				text.setText("Limo");
				text.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
			}
		});
		
home.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.startAnimation(animRot);
				Intent i= new Intent(Lima.this,PilihanKamus.class);
				startActivity(i);
				onDestroy();
			}
		});

depan.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		v.startAnimation(animRot);
		Intent i=new Intent(Lima.this,Enam.class);
		startActivity(i);
		onDestroy();
	}
});

belakang.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		v.startAnimation(animRotB);
		Intent i=new Intent(Lima.this,Empat.class);
		startActivity(i);
		onDestroy();
	}
});

objek.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		v.startAnimation(animScale1);
		
		
	}
});


abc.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		v.startAnimation(animScale1);
		Intent i=new Intent(Lima.this,NOMBOR.class);
		startActivity(i);
		onDestroy();
		
	}
});
	}
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{

	    if (keyCode == KeyEvent.KEYCODE_BACK)
	    {
	    	Intent i=new Intent(Lima.this,NOMBOR.class);
    		startActivity(i);
    		onDestroy();
	    	 
	    }

	    return false;
	}
	
}
