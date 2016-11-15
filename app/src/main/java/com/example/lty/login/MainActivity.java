package com.example.lty.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import junit.framework.Test;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });



        Button btn3= (Button) findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                List<Test> data=null;
                Intent intent = new Intent(MainActivity.this, ThreeActivity.class);
                 intent.putExtra("data","aa");
                startActivity(intent);
                //第三个需要参数
                //
                // intent.putExtra("url2",url1);
            }
        });



        Button btn4 = (Button) findViewById(R.id.button);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                List<Test> data=null;
                Intent intent = new Intent(MainActivity.this, JiuActivity.class);
                // intent.putExtra("data","aa");
                startActivity(intent);
                //第三个需要参数
                //
                // intent.putExtra("url2",url1);
            }
        });



        Button btn_table = (Button) findViewById(R.id.button_table);

        btn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                List<Test> data=null;
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                // intent.putExtra("data","aa");
                startActivity(intent);
                //第三个需要参数
                //
                // intent.putExtra("url2",url1);
            }
        });







        Button btn_listivew = (Button) findViewById(R.id.button_listview);

        btn_listivew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                List<Test> data=null;
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                // intent.putExtra("data","aa");
                startActivity(intent);
                //第三个需要参数
                //
                // intent.putExtra("url2",url1);
            }
        });






    }

}
