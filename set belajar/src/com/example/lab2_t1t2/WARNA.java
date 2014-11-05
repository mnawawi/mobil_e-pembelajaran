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
public class WARNA extends Activity {
  GridView grid;
  
  String[] web = {
      "Biru",
      "Coklate",
      "Hijau",
      "Hitam",
      "Kuning",
      "Merah",
      "Putih",
      "Ungu",
      "Merah Jambu"
      
      
  } ;
  int[] imageId = {
      R.drawable.biru,
      R.drawable.coklet,
      R.drawable.hijau,
      R.drawable.hitam,
      R.drawable.kuning,
      R.drawable.merah,
      R.drawable.putih,
      R.drawable.ungu,
      R.drawable.merahjambu,
      
  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.warna);
    CustomGrid adapter = new CustomGrid(WARNA.this, web, imageId);
    grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                
                	if (position==0){
                		
                		Intent i=new Intent(WARNA.this,Biru.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==1){
                		
                		Intent i=new Intent(WARNA.this,Coklet.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==2){
                		
                		Intent i=new Intent(WARNA.this,Hijau.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==3){
                		
                		Intent i=new Intent(WARNA.this,Hitam.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==4){
                		
                		Intent i=new Intent(WARNA.this,Kuning.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==5){
                		
                		Intent i=new Intent(WARNA.this,Merah.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==6){
                		
                		Intent i=new Intent(WARNA.this,Putih.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==7){
                		
                		Intent i=new Intent(WARNA.this,Ungu.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==8){
                		
                		Intent i=new Intent(WARNA.this,MerahJambu.class);
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
	    	Intent i=new Intent(WARNA.this,PilihanKamus.class);
  		startActivity(i);
  		System.exit(0);
		onDestroy();
		finish();
	    	 
	    }

	    return false;
	}	
}
