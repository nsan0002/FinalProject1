package com.example.jo_1.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class FoodNutrition extends Activity {

    private TextView foodName;
    private EditText foodItem;
    private Button food;
    private ProgressBar progressB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_nutrition);

        foodName = (TextView)findViewById(R.id.foodName) ;
        foodItem = (EditText)findViewById(R.id.foodItem);
        food = (Button)findViewById(R.id.food) ;
        progressB = (ProgressBar)findViewById(R.id.progressB);
        progressB.setVisibility(View.VISIBLE);




        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Add Food button is clicked");
            }
        });



    }
}
