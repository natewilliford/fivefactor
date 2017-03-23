package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class friday5class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday5);

        Button buttons44444 = (Button) findViewById(R.id.button44444);

        buttons44444.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons44444Intent = new Intent(friday5class.this, saturday5class.class);

                startActivity(buttons44444Intent);
            }
        });
    }
}