package com.example.philippe.seg3125test;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GlossaryActivity extends Activity implements View.OnClickListener{

    private Button profileButton;
    private Button glossaryButton;
    private Button learnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary);

        profileButton = (Button) findViewById(R.id.button_profile);
        profileButton.setOnClickListener(this);
        glossaryButton = (Button) findViewById(R.id.button_glossary);
        glossaryButton.setOnClickListener(this);
        glossaryButton.setTextColor(ColorStateList.valueOf(Color.BLUE));
        learnButton = (Button) findViewById(R.id.button_learn);
        learnButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_profile:
                Intent intentp = new Intent(this, ProfileActivity.class);
                startActivity(intentp);
                overridePendingTransition(0, 0);
                break;
            case R.id.button_glossary:
                Intent intentg = new Intent(this, GlossaryActivity.class);
                startActivity(intentg);
                overridePendingTransition(0, 0);
                break;
            case R.id.button_learn:
                Intent intentl = new Intent(this, MainActivity.class);
                startActivity(intentl);
                overridePendingTransition(0, 0);
                break;
        }

    }
}
