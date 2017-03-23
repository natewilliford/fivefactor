package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class tuesday2class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday2);

        Button buttons22 = (Button) findViewById(R.id.button22);

        buttons22.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons22Intent = new Intent(tuesday2class.this, thursday2class.class);

                startActivity(buttons22Intent);
            }
        });
    }
}