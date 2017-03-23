package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class tuesday3class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday3);

        Button buttons222 = (Button) findViewById(R.id.button222);

        buttons222.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons222Intent = new Intent(tuesday3class.this, thursday3class.class);

                startActivity(buttons222Intent);
            }
        });
    }
}