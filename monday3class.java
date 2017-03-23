package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class monday3class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday3);

        Button buttons111 = (Button) findViewById(R.id.button111);

        buttons111.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons111Intent = new Intent(monday3class.this, tuesday3class.class);

                startActivity(buttons111Intent);
            }
        });
    }
}