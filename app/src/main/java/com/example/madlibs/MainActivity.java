package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etTime;
    private EditText etVerb;
    private EditText etVerb2;
    private EditText etAdj;
    private EditText etAdj2;
    private EditText etColor;
    private EditText etShape;
    private EditText etCity;
    private EditText etMoney;
    private EditText etArtist;
    private EditText etAnimal;
    private EditText etDrink;
    private EditText etFood;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTime = findViewById(R.id.et_time);
        etVerb = findViewById(R.id.et_verb);
        etVerb2 = findViewById(R.id.et_verb2);
        etAdj = findViewById(R.id.et_adj);
        etAdj2 = findViewById(R.id.et_adj2);
        etColor = findViewById(R.id.et_color);
        etShape = findViewById(R.id.et_shape);
        etCity = findViewById(R.id.et_city);
        etMoney = findViewById(R.id.et_money);
        etArtist = findViewById(R.id.et_artist);
        etAnimal = findViewById(R.id.et_animal);
        etDrink = findViewById(R.id.et_drink);
        etFood = findViewById(R.id.et_food);
        btnCreate = findViewById(R.id.btn_create);

        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "";
                story += "\nAt about " + etTime.getText() + ", on a " + etAdj.getText() + " day, you decide to go on a road trip by yourself.";
                story += "\nHaving packed $" + etMoney.getText() + " and some " + etFood.getText() + ", you set on for your trip.";
                story += "\nYou didn't have an actual plan on where to go, so on a whim decide to go to " + etCity.getText() + ".";
                story += "\nYou feel the " + etAdj2.getText() + " breeze pass you by through the windows. The scenery isn't that bad and in the distance you spot a pretty " + etShape.getText() + " shaped building. You continue going down your journey towards " + etCity.getText() + " and put on your favorite music artist, " + etArtist.getText() + ".";
                story += "\nJust as you begin to let yourself feel the music, a " + etAnimal.getText() + " abruptly jumps into the middle of the road causing you to slam on your brakes.";
                story += "\nYou try your best to stay on the road, but your car begins to swerve out of control and then flips over. You try calling for help but fail and soon your vision goes dark.";
                story += "\nA few moments later..";
                story += "\nYou wake up with a " + etAdj.getText() + " headache. You don't recognize your surroundings and begin to " + etVerb.getText() + " in panic. Desperately trying to figure out where you've ended up, you come to the conclusion that it must be some sort of backroom. Looking around, you notice a faint " + etColor.getText() + " light in the distance. You begin to " + etVerb2.getText() + " towards it but can never seem to make it there.";
                story += "\nStopping to catch your breath, you check your pockets and realize your $" + etMoney.getText() + "is still on you.. So at least you haven't been robbed.";
                story += "\nYour stomach begins to grumble and you wish you had your " + etFood.getText() + " on you. You decide to just continue trying to find a way out.";
                story += "\nThe ground begins to rumble and you start to " + etVerb.getText() + " once again out of panic. Above you starts to rain what seems like " + etDrink.getText() + " and while you try to seek cover, there is nothing to protect you. In the distance you see a figure and try to make out what it is, and come to realize it is the " + etAnimal.getText() + " that was in the road where you were before you ended up where you were.";
                story += "\nYour vision starts to get dark once again and you try to " + etVerb.getText() + " one again, but then you fall to the ground, right before your vision is out completely, you see a hoard of " + etAnimal.getText() + "towards you. Then everything goes out once again.";
                story += "\nYour eyes open and you seem to find yourself back in your car. You frantically look around you and see that you are back at the odd " + etShape.getText() + " building, that was in the distance before. You double check if you still have $" + etMoney.getText() + " and your " + etFood.getText() + " and are relieved when everything is still where it was. You don't understand how you arrived where you were, but assume it must've only been a dream..";

                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);

            }
        });




    }
}