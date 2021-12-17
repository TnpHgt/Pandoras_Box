//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String clickStart = "";

        final Button startBtn = findViewById(R.id.startButton);
        final Button quitBtn = findViewById(R.id.quitButton);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("clickStart", clickStart);
                startActivity(intent);
            }
        });

        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Clear all activity
                finishAffinity();

                //exit
                System.exit(0);
            }
        });

    }
}