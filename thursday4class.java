package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class thursday4class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday4);

        Button buttons3333 = (Button) findViewById(R.id.button3333);

        buttons3333.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons3333Intent = new Intent(thursday4class.this, friday4class.class);

                startActivity(buttons3333Intent);
            }
        });
    }
}