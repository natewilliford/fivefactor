package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class saturday2class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday2);

        Button buttons55 = (Button) findViewById(R.id.button55);

        buttons55.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons55Intent = new Intent(saturday2class.this, monday3class.class);

                startActivity(buttons55Intent);
            }
        });
    }
}