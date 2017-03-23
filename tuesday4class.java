package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class tuesday4class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuesday4);

        Button buttons2222 = (Button) findViewById(R.id.button2222);

        buttons2222.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons2222Intent = new Intent(tuesday4class.this, thursday4class.class);

                startActivity(buttons2222Intent);
            }
        });
    }
}