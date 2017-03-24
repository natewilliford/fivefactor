package com.example.android.firsttry;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.firsttry.R.layout.dynamic;
import static com.example.android.firsttry.R.string.d1;

/**
 * Created by Azhong on 3/23/2017.
 */
public class dynamicclass extends AppCompatActivity {

    private int i;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(dynamic);

        //<!--When the app opens, it should call to the counter variable and take it in to decide which layout to load dynamically-->
        i=22;


        updateLayout();

        /*
                // Get user's name
                EditText nameField = (EditText) findViewById(R.id.name_field);
                Editable nameEditable = nameField.getText();
                String name = nameEditable.toString();

                *//**
                 * This method displays the given quantity value on the screen.
                 *//*
        private void displayQuantity ( int numberOfCoffees){
            TextView quantityTextView = (TextView) findViewById(
                    R.id.quantity_text_view);
            quantityTextView.setText("" + numberOfCoffees);
        }*/

        //<!--Making the button go-->
        Button dynamicbuttons = (Button) findViewById(R.id.dynamicbutton);
        dynamicbuttons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //<!--Press the Done button and up the global counter-->
                i = i + 1;
                updateLayout();
            }
        });
        }
    }

    private void updateLayout() {
            //<!--Changing the day-->
        TextView dynamicdays = (TextView) findViewById(R.id.dynamicday);
        switch (i) {
            case 1:case 6:case 11:case 16:case 21:
                dynamicdays.setText(d1); break;
            case 2:case 7:case 12:case 17:case 22:
                dynamicdays.setText(R.string.d2); break;
            case 3:case 8:case 13:case 18:case 23:
                dynamicdays.setText(R.string.d3); break;
            case 4:case 9:case 14:case 19:case 24:
                dynamicdays.setText(R.string.d4); break;
            case 5:case 10:case 15:case 20:case 25:
                dynamicdays.setText(R.string.d5); break;
        }

        //<!--Changing the week-->
        TextView dynamicweeks = (TextView) findViewById(R.id.dynamicweek);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicweeks.setText(R.string.w1); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicweeks.setText(R.string.w2); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicweeks.setText(R.string.w3); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicweeks.setText(R.string.w4); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicweeks.setText(R.string.w5); break;
        }

        //<!--Changing the first strength exercise-->
        TextView dynamicfirstexercises = (TextView) findViewById(R.id.dynamicfirstexercise);
        switch(i){
            case 1:case 6:case 11:case 16:case 21:
                dynamicfirstexercises.setText(R.string.d1s1); break;
            case 2:case 7:case 12:case 17:case 22:
                dynamicfirstexercises.setText(R.string.d2s1); break;
            case 3:case 8:case 13:case 18:case 23:
                dynamicfirstexercises.setText(R.string.d3s1); break;
            case 4:case 9:case 14:case 19:case 24:
                dynamicfirstexercises.setText(R.string.d4s1); break;
            case 5:case 10:case 15:case 20:case 25:
                dynamicfirstexercises.setText(R.string.d5s1); break;
        }

        //<!--Changing the first sets-->
        TextView dynamicfirstsetss = (TextView) findViewById(R.id.dynamicfirstsets);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicfirstsetss.setText(R.string.w1s1); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicfirstsetss.setText(R.string.w2s1); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicfirstsetss.setText(R.string.w3s1); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicfirstsetss.setText(R.string.w4s1); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicfirstsetss.setText(R.string.w5s1); break;
        }

        //<!--Changing the first reps-->
        TextView dynamicfirstrepss = (TextView) findViewById(R.id.dynamicfirstreps);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicfirstrepss.setText(R.string.w1r1); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicfirstrepss.setText(R.string.w2r1); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicfirstrepss.setText(R.string.w3r1); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicfirstrepss.setText(R.string.w4r1); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicfirstrepss.setText(R.string.w5r1); break;
        }

        //<!--Changing the first rest-->
        TextView dynamicfirstrests = (TextView) findViewById(R.id.dynamicfirstrest);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicfirstrests.setText(R.string.w1e1); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicfirstrests.setText(R.string.w2e1); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicfirstrests.setText(R.string.w3e1); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicfirstrests.setText(R.string.w4e1); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicfirstrests.setText(R.string.w5e1); break;
        }

        //<!--Changing the second strength exercise-->
        TextView dynamicsecondexercises = (TextView) findViewById(R.id.dynamicsecondexercise);
        switch(i){
            case 1:case 6:case 11:case 16:case 21:
                dynamicsecondexercises.setText(R.string.d1s2); break;
            case 2:case 7:case 12:case 17:case 22:
                dynamicsecondexercises.setText(R.string.d2s2); break;
            case 3:case 8:case 13:case 18:case 23:
                dynamicsecondexercises.setText(R.string.d3s2); break;
            case 4:case 9:case 14:case 19:case 24:
                dynamicsecondexercises.setText(R.string.d4s2); break;
            case 5:case 10:case 15:case 20:case 25:
                dynamicsecondexercises.setText(R.string.d5s2); break;
        }

        //<!--Changing the second sets-->
        TextView dynamicsecondsetss = (TextView) findViewById(R.id.dynamicsecondsets);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicsecondsetss.setText(R.string.w1s2); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicsecondsetss.setText(R.string.w2s2); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicsecondsetss.setText(R.string.w3s2); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicsecondsetss.setText(R.string.w4s2); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicsecondsetss.setText(R.string.w5s2); break;
        }

        //<!--Changing the second reps-->
        TextView dynamicsecondrepss = (TextView) findViewById(R.id.dynamicsecondreps);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicsecondrepss.setText(R.string.w1r2); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicsecondrepss.setText(R.string.w2r2); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicsecondrepss.setText(R.string.w3r2); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicsecondrepss.setText(R.string.w4r2); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicsecondrepss.setText(R.string.w5r2); break;
        }

        //<!--Changing the second rest-->
        TextView dynamicsecondrests = (TextView) findViewById(R.id.dynamicsecondrest);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:
                dynamicsecondrests.setText(R.string.w1e2); break;
            case 6:case 7:case 8:case 9:case 10:
                dynamicsecondrests.setText(R.string.w2e2); break;
            case 11:case 12:case 13:case 14:case 15:
                dynamicsecondrests.setText(R.string.w3e2); break;
            case 16:case 17:case 18:case 19:case 20:
                dynamicsecondrests.setText(R.string.w4e2); break;
            case 21:case 22:case 23:case 24:case 25:
                dynamicsecondrests.setText(R.string.w5e2); break;
        }

        //<!--Changing the ab exercise-->
        TextView dynamicabss = (TextView) findViewById(R.id.dynamicabs);
        switch(i){
            case 1:case 6:case 11:case 16:case 21:
                dynamicabss.setText(R.string.d1a); break;
            case 2:case 7:case 12:case 17:case 22:
                dynamicabss.setText(R.string.d2a); break;
            case 3:case 8:case 13:case 18:case 23:
                dynamicabss.setText(R.string.d3a); break;
            case 4:case 9:case 14:case 19:case 24:
                dynamicabss.setText(R.string.d4a); break;
            case 5:case 10:case 15:case 20:case 25:
                dynamicabss.setText(R.string.d5a); break;
        }

        //<!--The weights should be variables called from somewhere, how to initialize and update and drawn from the EditTexts-->
        //<!--Changing the first weights-->
        EditText dynamicfirstweightss = (EditText) findViewById(R.id.dynamicfirstweights);
        switch(i){
            case 1: dynamicfirstweightss.setHint(R.string.d1w1w1); break;
            case 2: dynamicfirstweightss.setHint(R.string.d2w1w1); break;
            case 3: dynamicfirstweightss.setHint(R.string.d3w1w1); break;
            case 4: dynamicfirstweightss.setHint(R.string.d4w1w1); break;
            case 5: dynamicfirstweightss.setHint(R.string.d5w1w1); break;
            case 6: dynamicfirstweightss.setHint(R.string.d1w2w1); break;
            case 7: dynamicfirstweightss.setHint(R.string.d2w2w1); break;
            case 8: dynamicfirstweightss.setHint(R.string.d3w2w1); break;
            case 9: dynamicfirstweightss.setHint(R.string.d4w2w1); break;
            case 10: dynamicfirstweightss.setHint(R.string.d5w2w1); break;
            case 11: dynamicfirstweightss.setHint(R.string.d1w3w1); break;
            case 12: dynamicfirstweightss.setHint(R.string.d2w3w1); break;
            case 13: dynamicfirstweightss.setHint(R.string.d3w3w1); break;
            case 14: dynamicfirstweightss.setHint(R.string.d4w3w1); break;
            case 15: dynamicfirstweightss.setHint(R.string.d5w3w1); break;
            case 16: dynamicfirstweightss.setHint(R.string.d1w4w1); break;
            case 17: dynamicfirstweightss.setHint(R.string.d2w4w1); break;
            case 18: dynamicfirstweightss.setHint(R.string.d3w4w1); break;
            case 19: dynamicfirstweightss.setHint(R.string.d4w4w1); break;
            case 20: dynamicfirstweightss.setHint(R.string.d5w4w1); break;
            case 21: dynamicfirstweightss.setHint(R.string.d1w5w1); break;
            case 22: dynamicfirstweightss.setHint(R.string.d2w5w1); break;
            case 23: dynamicfirstweightss.setHint(R.string.d3w5w1); break;
            case 24: dynamicfirstweightss.setHint(R.string.d4w5w1); break;
            case 25: dynamicfirstweightss.setHint(R.string.d5w5w1); break;
        }

        //<!--Changing the second weights-->
        EditText dynamicsecondweightss = (EditText) findViewById(R.id.dynamicsecondweights);
        switch(i){
            case 1: dynamicsecondweightss.setHint(R.string.d1w1w2); break;
            case 2: dynamicsecondweightss.setHint(R.string.d2w1w2); break;
            case 3: dynamicsecondweightss.setHint(R.string.d3w1w2); break;
            case 4: dynamicsecondweightss.setHint(R.string.d4w1w2); break;
            case 5: dynamicsecondweightss.setHint(R.string.d5w1w2); break;
            case 6: dynamicsecondweightss.setHint(R.string.d1w2w2); break;
            case 7: dynamicsecondweightss.setHint(R.string.d2w2w2); break;
            case 8: dynamicsecondweightss.setHint(R.string.d3w2w2); break;
            case 9: dynamicsecondweightss.setHint(R.string.d4w2w2); break;
            case 10: dynamicsecondweightss.setHint(R.string.d5w2w2); break;
            case 11: dynamicsecondweightss.setHint(R.string.d1w3w2); break;
            case 12: dynamicsecondweightss.setHint(R.string.d2w3w2); break;
            case 13: dynamicsecondweightss.setHint(R.string.d3w3w2); break;
            case 14: dynamicsecondweightss.setHint(R.string.d4w3w2); break;
            case 15: dynamicsecondweightss.setHint(R.string.d5w3w2); break;
            case 16: dynamicsecondweightss.setHint(R.string.d1w4w2); break;
            case 17: dynamicsecondweightss.setHint(R.string.d2w4w2); break;
            case 18: dynamicsecondweightss.setHint(R.string.d3w4w2); break;
            case 19: dynamicsecondweightss.setHint(R.string.d4w4w2); break;
            case 20: dynamicsecondweightss.setHint(R.string.d5w4w2); break;
            case 21: dynamicsecondweightss.setHint(R.string.d1w5w2); break;
            case 22: dynamicsecondweightss.setHint(R.string.d2w5w2); break;
            case 23: dynamicsecondweightss.setHint(R.string.d3w5w2); break;
            case 24: dynamicsecondweightss.setHint(R.string.d4w5w2); break;
            case 25: dynamicsecondweightss.setHint(R.string.d5w5w2); break;
        }

        //<!--Changing the third weights-->
        EditText dynamicthirdweightss = (EditText) findViewById(R.id.dynamicthirdweights);
        switch(i){
            case 1:case 3:case 5:case 6:case 8:case 10:case 11:case 13:case 15:case 16:case 18:case 20:case 21:case 23:case 25:
                dynamicthirdweightss.setVisibility(View.GONE); break;
            case 2: dynamicthirdweightss.setHint(R.string.d2w1w3); break; //!
            case 4: dynamicthirdweightss.setHint(R.string.d4w1w3); break; //!
            case 7: dynamicthirdweightss.setHint(R.string.d2w2w3); break; //!
            case 9: dynamicthirdweightss.setHint(R.string.d4w2w3); break; //!
            case 12: dynamicthirdweightss.setHint(R.string.d2w3w3); break; //!
            case 14: dynamicthirdweightss.setHint(R.string.d4w3w3); break; //!
            case 17: dynamicthirdweightss.setHint(R.string.d2w4w3); break; //!
            case 19: dynamicthirdweightss.setHint(R.string.d4w4w3); break; //!
            case 22: dynamicthirdweightss.setHint(R.string.d2w5w3); break; //!
            case 24: dynamicthirdweightss.setHint(R.string.d4w5w3); break; //!
        }

        //<!--Changing the first checkboxes-->
        //<!--Three checkboxes: Week 1, Week 2. Set 4th and 5th checkboxes to Gone.-->
        //<!--Four checkboxes: Week 3, Week 4. Set 5th checkboxes to Gone.-->
        //<!--Five checkboxes: Week 5. Don't set any to Gone.-->
        CheckBox cb5s = (CheckBox) findViewById(R.id.cb5);
        CheckBox cb4s = (CheckBox) findViewById(R.id.cb4);
        switch(i){
            case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
                cb4s.setVisibility(View.GONE); cb5s.setVisibility(View.GONE); break;

            case 11:case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
                cb5s.setVisibility(View.GONE); break;

            case 21:case 22:case 23:case 24:case 25: break;
        }

        //<!--Changing the second checkboxes-->
        //<!--Three checkboxes: Week 4, Week 5. Set 4th and 5th checkboxes to Gone.-->
        //<!--Four checkboxes: Week 2, Week 3. Set 5th checkboxes to Gone.-->
        //<!--Five checkboxes: Week 1. Don't set any to Gone.-->
        CheckBox cb10s = (CheckBox) findViewById(R.id.cb10);
        CheckBox cb9s = (CheckBox) findViewById(R.id.cb9);
        switch(i){
            case 1:case 2:case 3:case 4:case 5: break;

            case 6:case 7:case 8:case 9:case 10:case 11:case 12:case 13:case 14:case 15:
                cb10s.setVisibility(View.GONE); break;

            case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:case 24:case 25:
                cb9s.setVisibility(View.GONE);
                cb10s.setVisibility(View.GONE); break;
        }
    }
