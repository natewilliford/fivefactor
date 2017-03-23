package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class thursday2class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday2);

        Button buttons33 = (Button) findViewById(R.id.button33);

        buttons33.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons33Intent = new Intent(thursday2class.this, friday2class.class);

                startActivity(buttons33Intent);
            }
        });
    }
}