package com.asterisklab.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton;
        rollButton = (Button) findViewById(R.id.roll_btn);

        final ImageView leftDice;
        leftDice = (ImageView) findViewById(R.id.left_dice);

        final ImageView rightDice;
        rightDice = (ImageView) findViewById(R.id.right_dice);

        final int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6 };
        
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                Random secondDice = new Random();

                int number2;
                int number;

                number = randomNumberGenerator.nextInt(6);
                number2 = secondDice.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);



            }
        });

    }

}
