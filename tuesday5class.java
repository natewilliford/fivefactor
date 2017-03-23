package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class tuesday5class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday5);

        Button buttons22222 = (Button) findViewById(R.id.button22222);

        buttons22222.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons22222Intent = new Intent(tuesday5class.this, thursday5class.class);

                startActivity(buttons22222Intent);
            }
        });
    }
}