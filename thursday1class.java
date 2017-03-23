package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class thursday1class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday1);

        Button buttons3 = (Button) findViewById(R.id.button3);

        buttons3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons3Intent = new Intent(thursday1class.this, friday1class.class);

                startActivity(buttons3Intent);
            }
        });
    }
}