package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etVerb;
    private EditText etAdj;
    private EditText etColor;
    private EditText etShape;
    private EditText etLocation;
    private EditText etMoney;
    private EditText etPassword;
    private EditText etBusiness;
    private EditText etFood;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNoun = findViewById(R.id.et_noun);
        etVerb = findViewById(R.id.et_verb);
        etAdj = findViewById(R.id.et_adj);
        etColor = findViewById(R.id.et_color);
        etShape = findViewById(R.id.et_noun);
        etLocation = findViewById(R.id.et_location);
        etMoney = findViewById(R.id.et_money);
        etPassword = findViewById(R.id.et_password);
        etBusiness = findViewById(R.id.et_business);
        etFood = findViewById(R.id.et_food);
        btnCreate = findViewById(R.id.btn_create);

        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "";
                story += "...";
                story += "\nOn a " + etAdj.getText() + " day, you decide to go on a road trip by yourself.";
                story += "\nHaving packed $" + etMoney.getText() + " and some " + etFood.getText() + " you set on for your trip.";

                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);

            }
        });




    }
}