package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class saturday3class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday3);

        Button buttons555 = (Button) findViewById(R.id.button555);

        buttons555.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons555Intent = new Intent(saturday3class.this, monday4class.class);

                startActivity(buttons555Intent);
            }
        });
    }
}