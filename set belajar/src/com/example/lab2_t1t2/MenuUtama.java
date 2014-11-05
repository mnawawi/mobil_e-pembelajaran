package com.example.lab2_t1t2;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;

import com.example.setpembelajaran.R;

public class MenuUtama extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menuutama);
		final ImageButton menu= (ImageButton) findViewById(R.id.menu);
		final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate);
		
		
		menu.setOnClickListener(new View.OnClickListener(){
			@Override
				public void onClick(View arg0 )
					   {
				arg0.startAnimation(animTranslate);			
				Intent i= new Intent(MenuUtama.this,PilihanKamus.class);
				startActivity(i);
				onDestroy();
				finish();
					 
					   }
					   
				   });
	    	       
	}


	
	public boolean onKeyDown(int keycode,KeyEvent event){
    	AlertDialog.Builder dialog = new AlertDialog.Builder(MenuUtama.this);
		dialog.setCancelable(false);
		
    	if(keycode==KeyEvent.KEYCODE_BACK){
    		
    	/*	dialog.setTitle("Keluar");
    		dialog.setMessage("Anda ingin menamatkan sesi");
    		dialog.setPositiveButton("Tamatkan",new OnClickListener(){

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					System.exit(0);
					finish();
				
    			
    				
    		});
    		dialog.show();*/
    	}
		return false;
    	
    }

}
