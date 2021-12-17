//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        final String clickBack8 = "";
        final String clickHomeMenuQuiz = "";
        final String clickTarotQuiz = "";
        final String clickMythQuiz = "";
        final String clickAllQuiz = "";

        final ImageButton backBtn5 = findViewById(R.id.backButton5);
        final ImageButton homeMenuQuizBtn = findViewById(R.id.homeMenuQuiz);

        backBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity7.this, MainActivity2.class);
                intent.putExtra("clickBack8", clickBack8);
                startActivity(intent);
            }
        });

        homeMenuQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity7.this, MainActivity2.class);
                intent.putExtra("clickHomeMenuQuiz", clickHomeMenuQuiz);
                startActivity(intent);
            }
        });

        final Button tarotQuizBtn = findViewById(R.id.tarotQuizButton);
        final Button mythQuizBtn = findViewById(R.id.mythQuizButton);
        final Button allQuizBtn = findViewById(R.id.quizTarotMythButton);

        tarotQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity7.this, MainActivity3.class);
                //intent.putExtra("clickTarotQuiz", clickTarotQuiz);
                //startActivity(intent);
            }
        });

        mythQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity7.this, MainActivity3.class);
                //intent.putExtra("clickMythQuiz", clickMythQuiz);
                //startActivity(intent);
            }
        });

        allQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity7.this, MainActivity3.class);
                intent.putExtra("clickQuizGame", clickAllQuiz);
                startActivity(intent);
            }
        });

    }
}