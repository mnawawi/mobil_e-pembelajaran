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
public class BUAH extends Activity {
  GridView grid;
  
  String[] web = {
      "Belimbing",
      "Durian",
      "Strawberi",
      "Rambutan",
      "Jambu Batu",
      "Tembikai Susu",
      "Durian Belanda",
      "Mata Kucing",
      "Anggur",
      "Ciku",
      "Betik",
      "Nenas",
      "Epal"
      
  } ;
  int[] imageId = {
      R.drawable.belimbing,
      R.drawable.durian,
      R.drawable.strawberi,
      R.drawable.rambutan,
      R.drawable.guava,
      R.drawable.hdew,
      R.drawable.durianbelanda,
      R.drawable.matakucing,
      R.drawable.anggur,
      R.drawable.ciku,
      R.drawable.betik,
      R.drawable.nenas,
      R.drawable.epal,
      
  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.buah);
    CustomGrid adapter = new CustomGrid(BUAH.this, web, imageId);
    grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                
                	if (position==0){
                		
                		Intent i=new Intent(BUAH.this,Belimbing.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==1){
                		
                		Intent i=new Intent(BUAH.this,Durian.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==2){
                		
                		Intent i=new Intent(BUAH.this,Strawbery.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==3){
                		
                		Intent i=new Intent(BUAH.this,Rambutan.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==4){
                		
                		Intent i=new Intent(BUAH.this,JambuBatu.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==5){
                		
                		Intent i=new Intent(BUAH.this,TembikaiSusu.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==6){
                		
                		Intent i=new Intent(BUAH.this,DurianBelanda.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==7){
                		
                		Intent i=new Intent(BUAH.this,MataKucing.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==8){
                		
                		Intent i=new Intent(BUAH.this,Anggur.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==9){
                		
                		Intent i=new Intent(BUAH.this,Ciku.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==10){
                		
                		Intent i=new Intent(BUAH.this,Betik.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==11){
                		
                		Intent i=new Intent(BUAH.this,Nenas.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==12){
                		
                		Intent i=new Intent(BUAH.this,Epal.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==13){
                		
                		Intent i=new Intent(BUAH.this,N.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==14){
                		
                		Intent i=new Intent(BUAH.this,O.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==15){
                		
                		Intent i=new Intent(BUAH.this,P.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==16){
                		
                		Intent i=new Intent(BUAH.this,Q.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==17){
                		
                		Intent i=new Intent(BUAH.this,R_R.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==18){
                		
                		Intent i=new Intent(BUAH.this,S.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==19){
                		
                		Intent i=new Intent(BUAH.this,T.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==20){
                		
                		Intent i=new Intent(BUAH.this,U.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==21){
                		
                		Intent i=new Intent(BUAH.this,V.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==22){
                		
                		Intent i=new Intent(BUAH.this,W.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==23){
                		
                		Intent i=new Intent(BUAH.this,X.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==24){
                		
                		Intent i=new Intent(BUAH.this,Y.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==25){
                		
                		Intent i=new Intent(BUAH.this,Z.class);
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
	    	Intent i=new Intent(BUAH.this,PilihanKamus.class);
  		startActivity(i);
  		System.exit(0);
		onDestroy();
		finish();
	    	 
	    }

	    return false;
	}	
  
}
