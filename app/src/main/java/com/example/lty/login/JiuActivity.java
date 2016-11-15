package com.example.lty.login;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;


public class JiuActivity extends Activity {
    private GridView list = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiu);


     list = (GridView) findViewById(R.id.MainActivityGrid);




     ImageAdapter adapter=new ImageAdapter(this);
       list.setAdapter(adapter);

     list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             switch (i){
                 case 1:
                  // Intent intent = new Intent(Intent.Action_Main);
                  // startActivity(intent);


                     Intent intent = new Intent(JiuActivity.this, MainActivity.class);
                     startActivity(intent);
                     break;
             }
         }
     });



    }

}

