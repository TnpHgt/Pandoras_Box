//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity3 extends AppCompatActivity {

    String filename2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final String clickStart3 = "";
        final String clickBack2 = "";
        final String clickHome1 = "";

        String name;

        final TextView playerNameTxtView = (TextView) findViewById(R.id.playerNameTextView2);
        final EditText editPlayerName2 = (EditText) findViewById(R.id.editPlayerName2);

        final ImageButton backBtn2 = findViewById(R.id.backButton7);
        //final ImageButton homeBtn1 = findViewById(R.id.homeButton5);
        final Button startBtn3 = findViewById(R.id.startButton3);

        backBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("clickBack2", clickBack2);
                startActivity(intent);
            }
        });

        /*
        homeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("clickHome1", clickHome1);
                startActivity(intent);
            }
        });
        */


        startBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                filename2 = "name.txt";
                String name = editPlayerName2.getText().toString();

                try {
                    OutputStreamWriter out3 = new OutputStreamWriter(openFileOutput(filename2, MODE_APPEND));
                    BufferedWriter writer3 = new BufferedWriter(out3);
                    writer3.write("\t" + name + "\t");
                    writer3.newLine();
                    writer3.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("clickStart3", clickStart3);
                startActivity(intent);

            }
        });

    }
}