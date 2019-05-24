package com.study.cardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button btTryAgain;
    public TextView message;
    public ImageView selectedCard, card1, card2, card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTryAgain = findViewById(R.id.btPlayAgain);
        message = findViewById(R.id.textView);
        card1 = findViewById(R.id.imageView);
        card2 = findViewById(R.id.imageView2);
        card3 = findViewById(R.id.imageView3);
    }

    public void imageEnable(boolean b){
        card1.setEnabled(b);
        card2.setEnabled(b);
        card3.setEnabled(b);
    }

    public void cardClick (View view){
        imageEnable(false);
        selectedCard = (ImageView) view;
        Random random = new Random();

        if(random.nextBoolean()){
            this.selectedCard.setImageResource(R.drawable.winner);
            message.setText("You won !");
        }else{
            this.selectedCard.setImageResource(R.drawable.joke);
            message.setText("You lose !");
        }
    }

    public void newGame(View view){
        selectedCard.setImageResource(R.drawable.back);
        imageEnable(true);
        String cleanTextView = "";
        message.setText(cleanTextView);
    }
}
