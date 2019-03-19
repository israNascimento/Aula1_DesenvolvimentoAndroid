package com.androidmaltar.israel.androidmaltar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String num1 = i.getStringExtra("num1");
        String num2 = i.getStringExtra("num2");

        TextView t = findViewById(R.id.textView);
        Double res = Double.parseDouble(num1)+Double.parseDouble(num2);
        t.setText(res.toString());

        if(res%2 == 0){
            Toast.makeText(this,"par",Toast.LENGTH_SHORT).show();
        }else{

            Toast.makeText(this,"impar",Toast.LENGTH_SHORT).show();
        }

        Button b;

        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }
}
