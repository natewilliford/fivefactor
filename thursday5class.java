package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class thursday5class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday5);

        Button buttons33333 = (Button) findViewById(R.id.button33333);

        buttons33333.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons33333Intent = new Intent(thursday5class.this, friday5class.class);

                startActivity(buttons33333Intent);
            }
        });
    }
}