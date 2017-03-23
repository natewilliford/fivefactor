package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import static com.example.android.firsttry.R.layout.monday1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(monday1);

        Button buttons1 = (Button) findViewById(R.id.button1);

        buttons1.setOnClickListener(new OnClickListener(){
            public void onClick(View view) {
                Intent buttons1Intent = new Intent(MainActivity.this, tuesday1class.class);

                startActivity(buttons1Intent);
            }
        });
    }
}
