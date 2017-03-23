package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class saturday5class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday5);

        Button buttons55555 = (Button) findViewById(R.id.button55555);

        buttons55555.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons55555Intent = new Intent(saturday5class.this, monday1class.class);

                startActivity(buttons55555Intent);
            }
        });
    }
}