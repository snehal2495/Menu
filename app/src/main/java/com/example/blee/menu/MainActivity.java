package com.example.blee.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void printToLogs(View view) {

        TextView textView1=(TextView)findViewById(R.id.menu_item_1);
        String item1=textView1.getText().toString();
        Log.d("mainActivity",item1);

        TextView textView2=(TextView)findViewById(R.id.menu_item_2);
        String item2=textView2.getText().toString();
        Log.d("MainActivity",item2);

        TextView textView3=(TextView)findViewById(R.id.menu_item_3);
        String item3=textView3.getText().toString();
        Log.d("MainActivity",item3);
    }

    }
