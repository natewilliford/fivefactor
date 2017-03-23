package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class tuesday1class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday1);

        Button buttons2 = (Button) findViewById(R.id.button2);

        buttons2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons2Intent = new Intent(tuesday1class.this, thursday1class.class);

                startActivity(buttons2Intent);
            }
        });
    }
}

