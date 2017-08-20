package com.example.tolik.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // instance variable of the randomNumber, so we can access is from every scope in the class
    int randomNUmber;

    public void guessing(View view){

        EditText guessingNumber = (EditText) findViewById(R.id.guessingNumber);
        // Getting string from the guessingNumber EditText field
        String guessedNumberString = guessingNumber.getText().toString();
        // getting int from the guessingNUmber string variable
        int guessNumberInt = Integer.parseInt(guessedNumberString);
        /*
        To avoid getting duplicated code for the Toast popup, storing the message in a variable "message"
        and using it in each case of check and popup the Toast with cased message
         */
        String message = "";

        if (guessNumberInt > randomNUmber){

            message = "Too high!";
        } else if(guessNumberInt < randomNUmber){

            message = "Too low!";
        } else {

            message = "Well done, you guessed it!";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Random is a class, so we need an instance of that class each time we need to make randomNumber,
        so we create a randomGenerator variable casted to Random(), and store our randomNumber

         */
        Random randomGenerator = new Random();
        //storing randomGenerator in a range between 0 and 20 in a randomNumber instance variable,
        // changing it from null to a value for the first time, or each time from previous value to a new one.
        randomNUmber = randomGenerator.nextInt(21);
        // checking the randomNumber that the system lottories
        System.out.println(randomNUmber);

    }
}
