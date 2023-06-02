package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvStory;
    private ImageView ivPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvStory = findViewById(R.id.tv_story);
        ivPicture = findViewById(R.id.iv_picture);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        ivPicture.setImageResource(R.drawable.im_zesty);
        tvStory.setText(story);
    }
}