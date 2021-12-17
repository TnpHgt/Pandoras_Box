//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final String clickHome2 = "";
        final String clickBack3 = "";

        ImageButton backBtn3 = findViewById(R.id.backButton3);
        //ImageButton homeBtn2 = findViewById(R.id.homeButton2);

        final TextView playerlist = findViewById(R.id.playerlist);
        final TextView yourscorelist = findViewById(R.id.yourscorelist);

        backBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtra("clickBack3", clickBack3);
                startActivity(intent);
            }
        });

        /*
        homeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtra("clickHome2", clickHome2);
                startActivity(intent);
            }
        });
        */

        String extra2 = getIntent().getStringExtra("extra2");
        yourscorelist.setText(extra2);
        String extra3 = getIntent().getStringExtra("extra3");
        playerlist.setText(extra3);

    }
}