package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class friday3class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday3);

        Button buttons444 = (Button) findViewById(R.id.button444);

        buttons444.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons444Intent = new Intent(friday3class.this, saturday3class.class);

                startActivity(buttons444Intent);
            }
        });
    }
}