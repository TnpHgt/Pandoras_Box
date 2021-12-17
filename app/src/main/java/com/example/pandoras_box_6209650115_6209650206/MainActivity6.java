//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    private String selectCard=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        final String clickBack4 = "";
        final String clickHome3 = "";

        ImageButton backBtn4 = findViewById(R.id.backButton4);
        //ImageButton homeBtn3 = findViewById(R.id.homeButton3);

        backBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
                intent.putExtra("clickBack4", clickBack4);
                startActivity(intent);
            }
        });

        /*
        homeBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
                intent.putExtra("clickHome3", clickHome3);
                startActivity(intent);
            }
        });
        */

        Button tarotHistory = findViewById(R.id.histotyTarotButton);
        Button cardZero = findViewById(R.id.zeroButton);
        Button cardOne = findViewById(R.id.oneButton);
        Button cardTwo = findViewById(R.id.twoButton);
        Button cardThree = findViewById(R.id.threeButton);
        Button cardFour = findViewById(R.id.fourButton);
        Button cardFive = findViewById(R.id.fiveButton);
        Button cardSix = findViewById(R.id.sixButton);
        Button cardSeven = findViewById(R.id.sevenButton);
        Button cardEight = findViewById(R.id.eightButton);
        Button cardNine = findViewById(R.id.nineButton);
        Button cardTen = findViewById(R.id.tenButton);
        Button cardEleven = findViewById(R.id.elevenButton);
        Button cardTwelve = findViewById(R.id.twelveButton);
        Button cardThirteen = findViewById(R.id.thirteenButton);
        Button cardFourteen = findViewById(R.id.fourteenButton);
        Button cardFifteen = findViewById(R.id.fifteenButton);
        Button cardSixteen = findViewById(R.id.sixteenButton);
        Button cardSeventeen = findViewById(R.id.seventeenButton);
        Button cardEightteen = findViewById(R.id.eightteenButton);
        Button cardNineteen = findViewById(R.id.nineteenButton);
        Button cardTwenty = findViewById(R.id.twentyButton);
        Button cardTwentyOne = findViewById(R.id.twentyoneButton);

        tarotHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "tarotStory";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thefool0";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "themagician1";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thehighpriestess2";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "theempress3";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "theemperor4";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thehierophant5";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thelovers6";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thechariot7";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "strength8";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thehermit9";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "wheeloffortun10";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "justice11";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thehangedman12";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardThirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "death13";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardFourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "temperance14";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardFifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thedevil15";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardSixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thetower16";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardSeventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thestar17";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardEightteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "themoon18";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardNineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "thesun19";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "judgement20";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });

        cardTwentyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectCard = "theworld21";

                if(selectCard.isEmpty()){
                    Toast.makeText(MainActivity6.this, "กรุณาเลือกหัวข้อ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity6.this, CardActivity.class);
                    intent.putExtra("หัวข้อ",selectCard);
                    startActivity(intent);
                }
            }
        });


    }
}