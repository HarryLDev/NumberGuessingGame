package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class game_code extends AppCompatActivity {


    private String username = loginPage.name;
    private static int points;
    private static double pointsMultiplier;
    private static int randomNumber;
    private static int lives;
    private static int guessed;
    private static int upperLimit;



    public static int getRandomNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public String getGuessed(){
        return "You have gained " + points + " points";
    }
    public String getLives(){
        return "You have " + lives + " lives left";
    }
    public static int getPoints(){
        return points;
    }


    public int getUpperLimit(){
        return upperLimit;
    }
    public static void startEasyDifficulty(){
        randomNumber = getRandomNumber(0, 10);
        lives = 10;
        guessed = 0;
        upperLimit = 10;
        pointsMultiplier = 1;
        points = 0;
    }

    public static void  startMediumDifficulty(){
        randomNumber = getRandomNumber(0,30);
        lives = 5;
        guessed = 0;
        upperLimit = 30;
        pointsMultiplier = 2.5;
        points = 0;
    }

    public static void startHardDifficulty(){
        randomNumber = getRandomNumber(0, 100);
        lives = 3;
        guessed = 0;
        upperLimit = 100;
        pointsMultiplier = 5;
        points = 0;
    }

    public int getChosenNumber(){
        return randomNumber;
    }

    public String checkGuess(int guess){
        if(guess == randomNumber){
            guessed++;
            points+= pointsMultiplier;
            randomNumber = getRandomNumber(0, upperLimit);
            return "Your guess is RIGHT!!!";
        }
        else{
            lives--;
            guessed++;
            return "WRONG! The number is " + higherOrLower(guess);
        }
    }

    public String higherOrLower(int guess){
        if(getChosenNumber() > guess){
            return  "Higher";
        }
        else{
            return "Lower";
        }
    }


    //code for the game displays
    String guess;
    int guessInt;
    EditText guessInput;
    Button guessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_code_screen);

        TextView gameDescriptionMessage = (TextView) findViewById(R.id.description);
        gameDescriptionMessage.setText("The number is between 0 and " + getUpperLimit());

        guessInput = (EditText) findViewById(R.id.guessInput);
        guessButton = (Button) findViewById(R.id.guessButton);

        TextView afterGuessMessage = (TextView) findViewById(R.id.HigherLower);
        TextView livesLeft = (TextView) findViewById(R.id.guessesLeft);
        TextView guessesLeft = (TextView) findViewById(R.id.numOfGuesses);
        TextView userName = (TextView) findViewById(R.id.Username);
        userName.setText(username);


            guessButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(lives>0) {
                        guess = guessInput.getText().toString();
                        guessInt = Integer.parseInt(guess);
                        afterGuessMessage.setText(checkGuess(guessInt));
                        livesLeft.setText(getLives());
                        guessesLeft.setText(getGuessed());
                    }
                    else if(lives==0){
                        RelativeLayout popup;
                        popup = (RelativeLayout) findViewById(R.id.gameOverPopUp);
                        if (popup.getVisibility() == View.GONE) {
                            popup.setVisibility(View.VISIBLE);
                        }
                    }
                }
            });




    }
    public void playAgain(View view){
        Intent intent = new Intent(this, difficultyPage.class);
        startActivity(intent);
    }
    public void mainMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}