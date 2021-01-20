package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

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

        Button button = (Button) findViewById(R.id.button);
      final int[] a={R.drawable.dice1,
               R.drawable.dice2,
               R.drawable.dice3,
               R.drawable.dice4,
               R.drawable.dice5,
               R.drawable.dice6};
        ImageView diceleft = (ImageView) findViewById(R.id.diceleft);
        ImageView diceright = (ImageView) findViewById(R.id.diceright);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee","button has been pressed");
                Random rr = new Random();
                int n1 =rr.nextInt(6);
                int n2=rr.nextInt(6);
                Log.d("dicee","number generated="+n1+" and "+n2);
                diceleft.setImageResource(a[n1]);
                diceright.setImageResource((a[n2]));
            }
        });
    }
}