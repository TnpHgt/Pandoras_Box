//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatButton;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity9 extends AppCompatActivity {

    private static final String TAG="MainActivity9";
    private AppCompatButton mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    int year,month,day;
    int thousandDiv;
    int thousandMod;
    int hundredDiv;
    int hundredMod;
    int thousandDivSumHundredDiv;
    int first;
    int hundredDiv2;
    int hundredMod2;
    int tendiv;
    int tenmod;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        final String clickBackForetell = "";
        final String clickHomeForetell = "";

        final ImageView imgView5 = findViewById(R.id.imageView5);

        final ImageButton back = findViewById(R.id.backforetell);
        //final ImageButton home = findViewById(R.id.homeforetell);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity2.class);
                intent.putExtra("clickBackForetell", clickBackForetell);
                startActivity(intent);
            }
        });

        /*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity2.class);
                intent.putExtra("clickHomeForetell", clickHomeForetell);
                startActivity(intent);
            }
        });
        */

        mDisplayDate=(AppCompatButton) findViewById(R.id.selectyourdate);
        final AppCompatButton guesscard = findViewById(R.id.guessthecards);
        final TextView showdate = findViewById(R.id.showyourdateofbirth);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar cal = Calendar.getInstance();
                int year =cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(
                        MainActivity9.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year1, int month1, int day1) {
                month1=month1+1;
                Log.d(TAG, "onDateSet: date " + year1 + "/" + month1 + "/" + day1);

                String date = month1 + "/"+ day1 + "/" + year1;
                showdate.setText(date);

                year = year1;
                month = month1;
                day = day1;
            }
        };


        guesscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity9.this, card_tarot.class);

                thousandDiv = year / 1000;
                thousandMod = year % 1000;
                hundredDiv = thousandMod / 100;
                hundredMod = thousandMod % 100;
                thousandDivSumHundredDiv = (thousandDiv*10) + hundredDiv;
                first = day + month + thousandDivSumHundredDiv + hundredMod;

                if(first >= 1 && first <= 21){
                    sum = first;
                    intent.putExtra("sum",String.valueOf(sum));
                }
                if(first > 99){
                    hundredDiv2 = first / 100;
                    hundredMod2 = first % 100;
                    tendiv = hundredMod2 / 10;
                    tenmod = hundredMod2 % 10;
                    sum = ((hundredDiv2 * 10)+ tendiv) + tenmod;
                    if(sum >= 1 && sum <= 21){
                        intent.putExtra("sum",String.valueOf(sum));
                    }

                }
                if(first <= 99 && first >= 22){
                    tendiv = first / 10;
                    tenmod = first % 10;
                    sum=tendiv + tenmod;
                    if(sum >= 1 && sum <= 21){
                        intent.putExtra("sum",String.valueOf(sum));
                    }
                }
                if(sum <= 99 && sum >= 22){
                    tendiv = sum / 10;
                    tenmod = sum % 10;
                    sum=tendiv + tenmod;
                    if(sum >= 1 && sum <= 21){
                        intent.putExtra("sum",String.valueOf(sum));
                    }
                }
                startActivity(intent);
            }
        });



    }
}