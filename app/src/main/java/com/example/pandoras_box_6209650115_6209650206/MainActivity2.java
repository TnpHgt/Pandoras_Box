//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String clickTarotHistory = "";
        final String clickForetellCard = "";
        final String clickGreekMyth = "";
        final String clickQuizGame = "";
        final String clickBack1 = "";
        final String clickHistory = "";

        final TextView mainPageTxtView = (TextView) findViewById(R.id.noTextView);

        final ImageButton backBtn1 = findViewById(R.id.backButton1);
        final ImageButton historyBtn = findViewById(R.id.historyButton);

        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("clickBack1", clickBack1);
                startActivity(intent);
            }
        });

        //history page
        historyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                //intent.putExtra("clickHistory", clickHistory);
                //startActivity(intent);

                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);

                String filename1="score.txt";
                String inputString1;

                try{
                    BufferedReader inputReader1 = new BufferedReader(new InputStreamReader(openFileInput(filename1)));
                    StringBuffer stringBuffer1 = new StringBuffer();
                    while ((inputString1 = inputReader1.readLine()) != null){
                        stringBuffer1.append(inputString1 + "\n");
                    }
                    intent.putExtra("extra2", String.valueOf(stringBuffer1) + "\n");
                }catch(Exception e){
                    e.printStackTrace();
                }

                String filename3 = "name.txt";
                String inputString2;
                try{
                    BufferedReader inputReader2 = new BufferedReader(new InputStreamReader(openFileInput(filename3)));
                    StringBuffer stringBuffer2 = new StringBuffer();
                    while ((inputString2 = inputReader2.readLine()) != null){
                        stringBuffer2.append(inputString2 + "\n");
                    }
                    intent.putExtra("extra3", String.valueOf(stringBuffer2) + "\n");
                }catch(Exception e){
                    e.printStackTrace();
                }

                startActivity(intent);

            }
        });

        final Button tarotHistoryBtn = findViewById(R.id.tarotQuizButton);
        final Button foretellCardBtn = findViewById(R.id.mythQuizButton);
        final Button greekMythBtn = findViewById(R.id.quizTarotMythButton);
        final Button quizGameBtn = findViewById(R.id.quizGameButton);

        //go to page Tarot's history
        tarotHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                intent.putExtra("clickTarotHistory", clickTarotHistory);
                startActivity(intent);
            }
        });

        //go to page Foretell your card
        foretellCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity9.class);
                intent.putExtra("clickForetellCard", clickForetellCard);
                startActivity(intent);
            }
        });

        //go to page Greek-Roman god Mythology
        greekMythBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity8.class);
                intent.putExtra("clickGreekMyth", clickGreekMyth);
                startActivity(intent);
            }
        });

        //go to page Quizgame menu
        quizGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("clickQuizGame", clickQuizGame);
                startActivity(intent);
            }
        });
    }
}