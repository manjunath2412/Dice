package com.dice.ms1.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = (Button) findViewById(R.id.rollbutton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_RightDice);
        final int [] diceArray =
                {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};


        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","Roll button is pressed");
                Random randomNumberGenerator = new Random();
                int number1 = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "The random no is "+(number1+1));
                leftDice.setImageResource(diceArray[number1]);
                int number2 = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "The random no is "+(number2+1));
                rightDice.setImageResource(diceArray[number2]);
                int number = number1+number2;
                Log.d("Dice", "The random no is "+(number+2));
                Toast.makeText(MainActivity.this, "Result is "+(number+2), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
