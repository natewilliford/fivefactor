package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class monday4class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monday4);

        Button buttons1111 = (Button) findViewById(R.id.button1111);

        buttons1111.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons1111Intent = new Intent(monday4class.this, tuesday4class.class);

                startActivity(buttons1111Intent);
            }
        });
    }
}