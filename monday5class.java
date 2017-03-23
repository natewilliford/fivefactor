package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class monday5class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday5);

        Button buttons11111 = (Button) findViewById(R.id.button11111);

        buttons11111.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons11111Intent = new Intent(monday5class.this, tuesday5class.class);

                startActivity(buttons11111Intent);
            }
        });
    }
}