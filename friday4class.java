package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class friday4class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday4);

        Button buttons4444 = (Button) findViewById(R.id.button4444);

        buttons4444.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons4444Intent = new Intent(friday4class.this, saturday4class.class);

                startActivity(buttons4444Intent);
            }
        });
    }
}