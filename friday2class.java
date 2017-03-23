package com.example.android.firsttry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Azhong on 3/23/2017.
 */

public class friday2class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friday2);

        Button buttons44 = (Button) findViewById(R.id.button44);

        buttons44.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent buttons44Intent = new Intent(friday2class.this, saturday2class.class);

                startActivity(buttons44Intent);
            }
        });
    }
}