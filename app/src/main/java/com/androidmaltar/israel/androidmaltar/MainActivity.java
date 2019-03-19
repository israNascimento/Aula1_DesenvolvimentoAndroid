package com.androidmaltar.israel.androidmaltar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText n1;
    EditText n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button_soma);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("num1",n1.getText().toString());
                i.putExtra("num2",n2.getText().toString());

                startActivity(i);

            }
        });
    }
}
