package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class gameOverScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameoverscreen);

        TextView finalScoreMessage = (TextView)findViewById(R.id.finalScore);//stores final score message
        finalScoreMessage.setText("You gained  " + game_code.getPoints() + " points");


    }

}
