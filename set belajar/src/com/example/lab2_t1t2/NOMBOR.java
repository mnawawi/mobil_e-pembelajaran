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
public class NOMBOR extends Activity {
  GridView grid;
  
  String[] web = {
      "Satu",
      "Dua",
      "Tiga",
      "Empat",
      "Lima",
      "Enam",
      "Tujuh",
      "Lapan",
      "Sembilan",
      "Sepuluh",
      
      
  } ;
  int[] imageId = {
      R.drawable.satu,
      R.drawable.dua,
      R.drawable.tiga,
      R.drawable.empat,
      R.drawable.lima,
      R.drawable.enam,
      R.drawable.tujuh,
      R.drawable.lapan,
      R.drawable.sembilan,
      R.drawable.sepuluh,
     
      
  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.nombor);
    CustomGrid adapter = new CustomGrid(NOMBOR.this, web, imageId);
    grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                
                	if (position==0){
                		
                		Intent i=new Intent(NOMBOR.this,Satu.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==1){
                		
                		Intent i=new Intent(NOMBOR.this,Dua.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==2){
                		
                		Intent i=new Intent(NOMBOR.this,Tiga.class);
                		startActivity(i);
                	}
                	
                	if (position==3){
                		
                		Intent i=new Intent(NOMBOR.this,Empat.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==4){
                		
                		Intent i=new Intent(NOMBOR.this,Lima.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==5){
                		
                		Intent i=new Intent(NOMBOR.this,Enam.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==6){
                		
                		Intent i=new Intent(NOMBOR.this,Tujuh.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==7){
                		
                		Intent i=new Intent(NOMBOR.this,Lapan.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==8){
                		
                		Intent i=new Intent(NOMBOR.this,Sembilan.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==9){
                		
                		Intent i=new Intent(NOMBOR.this,Sepuluh.class);
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
	    	Intent i=new Intent(NOMBOR.this,PilihanKamus.class);
  		startActivity(i);
  		System.exit(0);
		onDestroy();
		finish();
	    	 
	    }

	    return false;
	}	
}
