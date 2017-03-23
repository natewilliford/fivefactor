package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class saturday1class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday1);

        Button buttons5 = (Button) findViewById(R.id.button5);

        buttons5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons5Intent = new Intent(saturday1class.this, monday2class.class);

                startActivity(buttons5Intent);
            }
        });
    }
}