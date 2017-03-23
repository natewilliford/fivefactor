package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class monday2class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday2);

        Button buttons11 = (Button) findViewById(R.id.button11);

        buttons11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons11Intent = new Intent(monday2class.this, tuesday2class.class);

                startActivity(buttons11Intent);
            }
        });
    }
}