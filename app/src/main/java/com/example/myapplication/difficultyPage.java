package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class difficultyPage extends AppCompatActivity {
    private Button easyB;
    private Button normalB;
    private Button hardB;
    private Button loginB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_page);
        loginB = (Button) findViewById(R.id.LoginButton);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }
        });
//        normalB = (Button) findViewById(R.id.LoginButton);
//        normalB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openNormalPage();
//            }
//        });
//        easyB = (Button) findViewById(R.id.LoginButton);
//        easyB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openEasyPage();
//            }
//        });
        hardB = (Button) findViewById(R.id.LoginButton);
        hardB.setOnClickListener(new View.OnClickListener() {
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
//        Intent intent = new Intent(this, GuessTheNumber.class);
//        startActivity(intent);
//    }
//    public void openNormalPage(){
//        Intent intent = new Intent(this, GuessTheNumber.class);
//        startActivity(intent);
//    }
//    public void openHardPage(){
//        Intent intent = new Intent(this, GuessTheNumber.class);
//        startActivity(intent);
//    }
    public void openLoginPage(){
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }
}