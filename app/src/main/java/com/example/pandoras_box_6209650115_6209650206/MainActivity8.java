//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    private String selectGR=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        final String clickBackGodBtn = "";
        final String clickHomeGodBtn = "";

        //final ImageButton homeGodBtn = findViewById(R.id.homeGodButton);
        final ImageButton backGodBtn = findViewById(R.id.backGodButton);

        /*
        homeGodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this, MainActivity2.class);
                intent.putExtra("clickHomeGodBtn", clickHomeGodBtn);
                startActivity(intent);
            }
        });
        */

        backGodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this, MainActivity2.class);
                intent.putExtra("clickBackGodBtn", clickBackGodBtn);
                startActivity(intent);
            }
        });

        final AppCompatButton dionysus1=findViewById(R.id.dionysus1);
        final AppCompatButton hermes2=findViewById(R.id.hermes2);
        final AppCompatButton demeter3=findViewById(R.id.demeter3);
        final AppCompatButton zeus4=findViewById(R.id.zeus4);
        final AppCompatButton cupid5=findViewById(R.id.cupid5);
        final AppCompatButton ares6=findViewById(R.id.ares6);
        final AppCompatButton cronos7=findViewById(R.id.cronos7);
        final AppCompatButton athena8=findViewById(R.id.athena8);
        final AppCompatButton apollo9=findViewById(R.id.apollo9);
        final AppCompatButton artemis10=findViewById(R.id.artemis10);
        final AppCompatButton aphrodite11=findViewById(R.id.aphrodite11);
        final AppCompatButton hera12=findViewById(R.id.hera12);
        final AppCompatButton hestia13=findViewById(R.id.hestia13);
        final AppCompatButton poseidon14=findViewById(R.id.poseidon14);
        final AppCompatButton odin15=findViewById(R.id.odin15);
        final AppCompatButton stvalentine16=findViewById(R.id.stvalentine16);
        final AppCompatButton hades17=findViewById(R.id.hades17);
        final AppCompatButton pan18=findViewById(R.id.pan18);
        final AppCompatButton nike19=findViewById(R.id.nike19);
        final AppCompatButton hephaestus20=findViewById(R.id.hephaestus20);

        dionysus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="dionysus1";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }

                //Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                //intent.putExtra("หัวข้อ",selectGR);
                //startActivity(intent);

            }
        });
        hermes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="hermes2";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        demeter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="demeter3";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        zeus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="zeus4";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        cupid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="cupid5";


                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        ares6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="ares6";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        cronos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="cronos7";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        athena8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="athena8";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        apollo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="apollo9";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        artemis10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="artemis10";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        aphrodite11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="aphrodite11";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        hera12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="hera12";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        hestia13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="hestia13";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        poseidon14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="poseidon14";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        odin15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="odin15";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        stvalentine16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="stvalentine16";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        hades17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="hades17";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        pan18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="pan18";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        nike19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="nike19";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });
        hephaestus20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectGR="hephaestus20";

                if(selectGR.isEmpty()){
                    Toast.makeText(MainActivity8.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(MainActivity8.this,GodActivity.class);
                    intent.putExtra("หัวข้อ",selectGR);
                    startActivity(intent);
                }
            }
        });


    }
}

//                dionysus1.setBackgroundResource(R.drawable.round_back_white_stroke10);
//                hermes2.setBackgroundResource(R.drawable.round_back_white10);
//                demeter3.setBackgroundResource(R.drawable.round_back_white10);
//                zeus4.setBackgroundResource(R.drawable.round_back_white10);
//                cupid5.setBackgroundResource(R.drawable.round_back_white10);
//                ares6.setBackgroundResource(R.drawable.round_back_white10);
//                cronos7.setBackgroundResource(R.drawable.round_back_white10);
//                athena8.setBackgroundResource(R.drawable.round_back_white10);
//                apollo9.setBackgroundResource(R.drawable.round_back_white10);
//                artemis10.setBackgroundResource(R.drawable.round_back_white10);
//                aphrodite11.setBackgroundResource(R.drawable.round_back_white10);
//                hera12.setBackgroundResource(R.drawable.round_back_white10);
//                hestia13.setBackgroundResource(R.drawable.round_back_white10);
//                poseidon14.setBackgroundResource(R.drawable.round_back_white10);
//                odin15.setBackgroundResource(R.drawable.round_back_white10);
//                stvalentine16.setBackgroundResource(R.drawable.round_back_white10);
//                hades17.setBackgroundResource(R.drawable.round_back_white10);
//                pan18.setBackgroundResource(R.drawable.round_back_white10);
//                nike19.setBackgroundResource(R.drawable.round_back_white10);
//                hephaestus20.setBackgroundResource(R.drawable.round_back_white10);