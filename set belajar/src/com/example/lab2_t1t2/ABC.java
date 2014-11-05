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
public class ABC extends Activity {
  GridView grid;
  
  String[] web = {
        "A",
      "B",
      "C",
      "D",
      "E",
      "F",
      "G",
      "H",
      "I",
      "J",
      "K",
      "L",
      "M",
      "N",
      "O",
      "P",
      "Q",
      "R",
      "S",
      "T",
      "U",
      "V",
      "W",
      "X",
      "Y",
      "Z"
  } ;
  int[] imageId = {
      R.drawable.a,
      R.drawable.b,
      R.drawable.c,
      R.drawable.d,
      R.drawable.e,
      R.drawable.f,
      R.drawable.g,
      R.drawable.h,
      R.drawable.i,
      R.drawable.j,
      R.drawable.k,
      R.drawable.l,
      R.drawable.m,
      R.drawable.n,
      R.drawable.o,
      R.drawable.p,
      R.drawable.q,
      R.drawable.r,
      R.drawable.s,
      R.drawable.t,
      R.drawable.u,
      R.drawable.v,
      R.drawable.w,
      R.drawable.x,
      R.drawable.y,
      R.drawable.z
  };
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.abc);
    CustomGrid adapter = new CustomGrid(ABC.this, web, imageId);
    grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                
                	if (position==0){
                		
                		Intent i=new Intent(ABC.this,A.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==1){
                		
                		Intent i=new Intent(ABC.this,B.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==2){
                		
                		Intent i=new Intent(ABC.this,C.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==3){
                		
                		Intent i=new Intent(ABC.this,D.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==4){
                		
                		Intent i=new Intent(ABC.this,E.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==5){
                		
                		Intent i=new Intent(ABC.this,F.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==6){
                		
                		Intent i=new Intent(ABC.this,G.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==7){
                		
                		Intent i=new Intent(ABC.this,H.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==8){
                		
                		Intent i=new Intent(ABC.this,I.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==9){
                		
                		Intent i=new Intent(ABC.this,J.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==10){
                		
                		Intent i=new Intent(ABC.this,K.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==11){
                		
                		Intent i=new Intent(ABC.this,L.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==12){
                		
                		Intent i=new Intent(ABC.this,M.class);
                		startActivity(i);
                		onDestroy();
                	}
                	
                	if (position==13){
                		
                		Intent i=new Intent(ABC.this,N.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==14){
                		
                		Intent i=new Intent(ABC.this,O.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==15){
                		
                		Intent i=new Intent(ABC.this,P.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==16){
                		
                		Intent i=new Intent(ABC.this,Q.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==17){
                		
                		Intent i=new Intent(ABC.this,R_R.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==18){
                		
                		Intent i=new Intent(ABC.this,S.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==19){
                		
                		Intent i=new Intent(ABC.this,T.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==20){
                		
                		Intent i=new Intent(ABC.this,U.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==21){
                		
                		Intent i=new Intent(ABC.this,V.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==22){
                		
                		Intent i=new Intent(ABC.this,W.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==23){
                		
                		Intent i=new Intent(ABC.this,X.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==24){
                		
                		Intent i=new Intent(ABC.this,Y.class);
                		startActivity(i);
                		onDestroy();
                	}
                	if (position==25){
                		
                		Intent i=new Intent(ABC.this,Z.class);
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
	    	Intent i=new Intent(ABC.this,PilihanKamus.class);
    		startActivity(i);
    		System.exit(0);
    		onDestroy();
    		finish();
	    	 
	    }

	    return false;
	}	
}
