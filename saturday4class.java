package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class saturday4class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday4);

        Button buttons5555 = (Button) findViewById(R.id.button5555);

        buttons5555.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons5555Intent = new Intent(saturday4class.this, monday5class.class);

                startActivity(buttons5555Intent);
            }
        });
    }
}