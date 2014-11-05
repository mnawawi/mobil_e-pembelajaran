package com.example.lab2_t1t2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.setpembelajaran.R;
public class HAIWAN extends Activity {
  GridView grid;
  
  String[] web = {
        "Ayam",
        "Ikan",
        "Itik",
        "Kuda",
        "Ular",
        "Belalang",
        "Buaya",
        "Harimau",
        "Zirafah",
        "Kelawar",
        "Badak Sembu",
        "Burung Unta",
        "Harimau Bintang",
        "Kuda Belang",
        "Orang Utan"
     

        

      
  } ;
  int[] imageId = {
      R.drawable.ayam,
      R.drawable.ikan,
      R.drawable.itik,
      R.drawable.kuda,
      R.drawable.ular,
      R.drawable.belalang,
      R.drawable.buaya,
      R.drawable.harimau,
      R.drawable.zirafah,
      R.drawable.kelawar,
      R.drawable.badak,
      R.drawable.burungunta,
      R.drawable.cheetah,
      R.drawable.kudabelang,
      R.drawable.orangutan,
      

  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.haiwan);
    CustomGrid adapter = new CustomGrid(HAIWAN.this, web, imageId);
    grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                
                	if (position==0){
                		
                		Intent i=new Intent(HAIWAN.this,Ayam.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==1){
                		
                		Intent i=new Intent(HAIWAN.this,Ikan.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==2){
                		
                		Intent i=new Intent(HAIWAN.this,Itik.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==3){
                		
                		Intent i=new Intent(HAIWAN.this,Kuda.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==4){
                		
                		Intent i=new Intent(HAIWAN.this,Ular.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==5){
                		
                		Intent i=new Intent(HAIWAN.this,Belalang.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==6){
                		
                		Intent i=new Intent(HAIWAN.this,Buaya.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==7){
                		
                		Intent i=new Intent(HAIWAN.this,Harimau.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==8){
                		
                		Intent i=new Intent(HAIWAN.this,Zirafah.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==9){
                		
                		Intent i=new Intent(HAIWAN.this,Kelawar.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==10){
                		
                		Intent i=new Intent(HAIWAN.this,Badak.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==11){
                		
                		Intent i=new Intent(HAIWAN.this,BurungUnta.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==12){
                		
                		Intent i=new Intent(HAIWAN.this,Cheetah.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==13){
                		
                		Intent i=new Intent(HAIWAN.this,KudaBelang.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==14){
                		
                		Intent i=new Intent(HAIWAN.this,OrangUtan.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	
                }
                
                
            });
        

  }
  
  public boolean onKeyDown(int keyCode, KeyEvent event)
	{

	    if (keyCode == KeyEvent.KEYCODE_BACK)
	    {
	    	Intent i=new Intent(HAIWAN.this,PilihanKamus.class);
  		startActivity(i);
  		System.exit(0);
		onDestroy();
		finish();
	    	 
	    }

	    return false;
	}	
  
}
