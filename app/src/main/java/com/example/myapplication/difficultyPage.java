package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class difficultyPage extends AppCompatActivity {
//    private Button easyB;
//    private Button normalB;
//    private Button hardB;
    private Button loginB;
//    private Button leaderboardB;
//    private Button helpB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_page);
        loginB = (Button) findViewById(R.id.button);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });
    }

    public void showRules(View v){
        RelativeLayout popup;
        popup = (RelativeLayout) findViewById(R.id.rulesPopup);
        if (popup.getVisibility() == View.GONE) {
            popup.setVisibility(View.VISIBLE);
        }
    }

    public void hideRules(View v){
        RelativeLayout popup;
        popup = (RelativeLayout) findViewById(R.id.rulesPopup);
        if (popup.getVisibility() == View.VISIBLE) {
            popup.setVisibility(View.GONE);
        }
    }

//    public void openEasyPage(){
//        Intent intent = new Intent(this, gamePage.class);
//        startActivity(intent);
//    }
//    public void openNormalPage(){
//        Intent intent = new Intent(this, gamePage.class);
//        startActivity(intent);
//    }
//    public void openHardPage(){
//        Intent intent = new Intent(this, gamePage.class);
//        startActivity(intent);
//    }
    public void openLoginPage(){
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }
//    public void openLeaderboardPage(){
//        Intent intent = new Intent(this, leaderboardPage.class);
//        startActivity(intent);
//    }
//    public void helpPage(){
//        Intent intent = new Intent(this, helpPage.class);
//        startActivity(intent);
//    }
}