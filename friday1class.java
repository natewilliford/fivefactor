package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class friday1class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday1);

        Button buttons4 = (Button) findViewById(R.id.button4);

        buttons4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons4Intent = new Intent(friday1class.this, saturday1class.class);

                startActivity(buttons4Intent);
            }
        });
    }
}