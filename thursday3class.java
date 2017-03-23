package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class thursday3class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thursday3);

        Button buttons333 = (Button) findViewById(R.id.button333);

        buttons333.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons333Intent = new Intent(thursday3class.this, friday3class.class);

                startActivity(buttons333Intent);
            }
        });
    }
}