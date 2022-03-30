package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDifficultyPage();
            }
        });
    }
    public void openDifficultyPage(){
        Intent intent = new Intent(this, difficultyPage.class);
        startActivity(intent);
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
}
