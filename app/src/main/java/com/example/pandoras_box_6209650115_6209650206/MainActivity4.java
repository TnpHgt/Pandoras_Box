//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    TextView question, numQuestion;
    Button option1Btn, option2Btn, option3Btn, option4Btn;
    ArrayList<QuizModal> quizModalArrayList;
    Random random;

    String filename1;
    final int[] currentScore = new int[1];
    int questionAttemped = 1, currentPos, attemped = 1;
    final String[] score = new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final String clickBack = "";
        final String clickHome = "";

        final TextView numQuestionTxtView = (TextView) findViewById(R.id.numQuestionTextView);
        final TextView questionTxtView = (TextView) findViewById(R.id.questionTextView);

        /*
        final ImageButton backBtn = findViewById(R.id.backButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                intent.putExtra("clickBack", clickBack);
                startActivity(intent);
            }
        });
        */

        /*
        final ImageButton homeBtn = findViewById(R.id.homeButton);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtra("clickHome", clickHome);
                startActivity(intent);
            }
        });
        */

        final ImageButton nextBtn = findViewById(R.id.nextButton);

        question = findViewById(R.id.questionTextView);
        numQuestion = findViewById(R.id.numQuestionTextView);
        option1Btn = findViewById(R.id.option1Button);
        option2Btn = findViewById(R.id.option2Button);
        option3Btn = findViewById(R.id.option3Button);
        option4Btn = findViewById(R.id.option4Button);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option1Btn.getText().toString().trim())) {
                //    currentScore++;
                //}

                option2Btn.setEnabled(false);
                option3Btn.setEnabled(false);
                option4Btn.setEnabled(false);

                if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option1Btn.getText().toString().trim())) {
                    currentScore[0]++;

                    option1Btn.setBackgroundColor(Color.GREEN);
                    option1Btn.setTextColor(Color.BLACK);

                    //select other choice after have selected choice or showed answer true
                    if(option2Btn.hasOnClickListeners()==true) {
                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    if(option3Btn.hasOnClickListeners()==true) {
                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                    if(option4Btn.hasOnClickListeners()==true) {
                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }
                else{
                    option1Btn.setBackgroundColor(Color.RED);
                    option1Btn.setTextColor(Color.WHITE);

                    //show answer choice
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option2Btn.getText().toString().trim())){
                        option2Btn.setBackgroundColor(Color.GREEN);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option3Btn.getText().toString().trim())){
                        option3Btn.setBackgroundColor(Color.GREEN);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option4Btn.getText().toString().trim())){
                        option4Btn.setBackgroundColor(Color.GREEN);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }

                //questionAttemped++;
                //currentPos = random.nextInt(quizModalArrayList.size());
                //setDataToViews(currentPos);

                nextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);

                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);

                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);

                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);

                        questionAttemped++;

                        if(questionAttemped <= 10)
                        {   attemped++;     }

                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDataToViews(currentPos);

                        option2Btn.setEnabled(true);
                        option3Btn.setEnabled(true);
                        option4Btn.setEnabled(true);
                    }
                });

            }
        });

        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option2Btn.getText().toString().trim())){
                //    currentScore++;
                //}

                option1Btn.setEnabled(false);
                option3Btn.setEnabled(false);
                option4Btn.setEnabled(false);

                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option2Btn.getText().toString().trim())){
                    currentScore[0]++;

                    option2Btn.setBackgroundColor(Color.GREEN);
                    option2Btn.setTextColor(Color.BLACK);

                    //select other choice after have selected choice or showed answer true
                    if(option1Btn.hasOnClickListeners()==true) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    if(option3Btn.hasOnClickListeners()==true) {
                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                    if(option4Btn.hasOnClickListeners()==true) {
                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }
                else {
                    option2Btn.setBackgroundColor(Color.RED);
                    option2Btn.setTextColor(Color.WHITE);

                    //show answer choice
                    if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option1Btn.getText().toString().trim())) {
                        option1Btn.setBackgroundColor(Color.GREEN);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    else if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option3Btn.getText().toString().trim())) {
                        option3Btn.setBackgroundColor(Color.GREEN);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                    else if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option4Btn.getText().toString().trim())) {
                        option4Btn.setBackgroundColor(Color.GREEN);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }

                //questionAttemped++;
                //currentPos = random.nextInt(quizModalArrayList.size());
                //setDataToViews(currentPos);

                nextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);

                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);

                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);

                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);

                        questionAttemped++;

                        if(questionAttemped <= 10)
                        {   attemped++;     }

                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDataToViews(currentPos);

                        option1Btn.setEnabled(true);
                        option3Btn.setEnabled(true);
                        option4Btn.setEnabled(true);
                    }
                });

            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                option1Btn.setEnabled(false);
                option2Btn.setEnabled(false);
                option4Btn.setEnabled(false);

                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option3Btn.getText().toString().trim())){
                    currentScore[0]++;

                    option3Btn.setBackgroundColor(Color.GREEN);
                    option3Btn.setTextColor(Color.BLACK);

                    //select other choice after have selected choice or showed answer true
                    if(option1Btn.hasOnClickListeners()==true) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    if(option2Btn.hasOnClickListeners()==true) {
                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    if(option4Btn.hasOnClickListeners()==true) {
                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }
                else{
                    option3Btn.setBackgroundColor(Color.RED);
                    option3Btn.setTextColor(Color.WHITE);

                    //show answer choice
                    if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option1Btn.getText().toString().trim())){
                        option1Btn.setBackgroundColor(Color.GREEN);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option2Btn.getText().toString().trim())){
                        option2Btn.setBackgroundColor(Color.GREEN);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    else if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option4Btn.getText().toString().trim())){
                        option4Btn.setBackgroundColor(Color.GREEN);
                        option4Btn.setTextColor(Color.BLACK);
                    }
                }

                //questionAttemped++;
                //currentPos = random.nextInt(quizModalArrayList.size());
                //setDataToViews(currentPos);

                nextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);

                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);

                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);

                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);

                        questionAttemped++;

                        if(questionAttemped <= 10)
                        {   attemped++;     }

                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDataToViews(currentPos);

                        option1Btn.setEnabled(true);
                        option2Btn.setEnabled(true);
                        option4Btn.setEnabled(true);
                    }
                });

            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                option1Btn.setEnabled(false);
                option2Btn.setEnabled(false);
                option3Btn.setEnabled(false);

                if(quizModalArrayList.get(currentPos).getAnswer().trim().equals(option4Btn.getText().toString().trim())){
                    currentScore[0]++;

                    option4Btn.setBackgroundColor(Color.GREEN);
                    option4Btn.setTextColor(Color.BLACK);

                    //select other choice after have selected choice or showed answer true

                    if(option1Btn.hasOnClickListeners()==true) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    if(option2Btn.hasOnClickListeners()==true) {
                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    if(option3Btn.hasOnClickListeners()==true) {
                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                }
                else{
                    option4Btn.setBackgroundColor(Color.RED);
                    option4Btn.setTextColor(Color.WHITE);

                    //show answer choice
                    if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option1Btn.getText().toString().trim())) {
                        option1Btn.setBackgroundColor(Color.GREEN);
                        option1Btn.setTextColor(Color.BLACK);
                    }
                    else if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option2Btn.getText().toString().trim())) {
                        option2Btn.setBackgroundColor(Color.GREEN);
                        option2Btn.setTextColor(Color.BLACK);
                    }
                    else if (quizModalArrayList.get(currentPos).getAnswer().trim().equals(option3Btn.getText().toString().trim())) {
                        option3Btn.setBackgroundColor(Color.GREEN);
                        option3Btn.setTextColor(Color.BLACK);
                    }
                }

                //questionAttemped++;
                //currentPos = random.nextInt(quizModalArrayList.size());
                //setDataToViews(currentPos);

                nextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        option1Btn.setBackgroundColor(Color.WHITE);
                        option1Btn.setTextColor(Color.BLACK);

                        option2Btn.setBackgroundColor(Color.WHITE);
                        option2Btn.setTextColor(Color.BLACK);

                        option3Btn.setBackgroundColor(Color.WHITE);
                        option3Btn.setTextColor(Color.BLACK);

                        option4Btn.setBackgroundColor(Color.WHITE);
                        option4Btn.setTextColor(Color.BLACK);

                        questionAttemped++;

                        if(questionAttemped <= 10)
                        {   attemped++;     }

                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDataToViews(currentPos);

                        option1Btn.setEnabled(true);
                        option2Btn.setEnabled(true);
                        option3Btn.setEnabled(true);
                    }
                });

            }
        });

    }

    void showScoreSheet(){

        final String clickBackToMainPage = "";
        final String clickHistoryImgBtn = "";

        BottomSheetDialog scoreSheetDialog = new BottomSheetDialog(MainActivity4.this);
        View scoreSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_sheet,(LinearLayout)findViewById(R.id.scoreLayout));
        TextView scoreTxtView = scoreSheetView.findViewById(R.id.yourScoreIsTextView);

        Button backToMainPageBtn = scoreSheetView.findViewById(R.id.backToMainPageButton);
        Button restartQuizBtn = scoreSheetView.findViewById(R.id.restartButton);
        //ImageButton historyImgBtn = scoreSheetView.findViewById(R.id.historyImageButton);

        scoreTxtView.setText(currentScore[0]+" / 10");

        score[0]= String.valueOf(Integer.parseInt(String.valueOf(currentScore[0])));

        filename1 = "score.txt";
        String string1= score[0];
        backToMainPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtra("clickBackToMainPage", clickBackToMainPage);
                startActivity(intent);

                try{

                    OutputStreamWriter out1 = new OutputStreamWriter(openFileOutput(filename1,MODE_APPEND));
                    BufferedWriter writer1 = new BufferedWriter(out1);
                    writer1.write("\t"+string1+"\t");
                    writer1.newLine();
                    writer1.close();
                    //  intent.putExtra("extra1", String.valueOf(writer1)+"\n");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        /*
        historyImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putExtra("clickHistoryImgBtn", clickHistoryImgBtn);
                startActivity(intent);
            }
        });
        */

        restartQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
                questionAttemped = 1;
                currentScore[0]= 0;
                attemped = 1;
                scoreSheetDialog.dismiss();

                try{

                    OutputStreamWriter out1 = new OutputStreamWriter(openFileOutput(filename1,MODE_APPEND));
                    BufferedWriter writer1 = new BufferedWriter(out1);
                    writer1.write("\t"+string1+"\t");
                    writer1.newLine();
                    writer1.close();
                    //  intent.putExtra("extra1", String.valueOf(writer1)+"\n");

                } catch (Exception e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        scoreSheetDialog.setCancelable(false);
        scoreSheetDialog.setContentView(scoreSheetView);
        scoreSheetDialog.show();

    }

    void setDataToViews(int currentPos){
        numQuestion.setText("Question Attemped : "+ attemped + "/10");

        if(questionAttemped > 10){
            showScoreSheet();
        }
        else {
            question.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());
        }
    }

    void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList){

        //Tarot card question
        quizModalArrayList.add(new QuizModal("ไพ่ที่มีความหมายถึง ความกังวล ความกลัว สิ่งที่กลัวเก็บซ่อนไว้จะถูกเปิดเผย อารมณ์อ่อนไหว ความรู้สึกไม่ปลอดภัย คือ?","The Moon","The Magician","The Chariot","The Hermit","The Moon"));
        quizModalArrayList.add(new QuizModal("ไพ่ที่มีความหมายถึง ความหวัง การฟื้นฟูรักษา การเริ่มต้นใหม่ คือ?","The Fool","The Sun","The Star","Judgement","The Star"));
        quizModalArrayList.add(new QuizModal("ไพ่ลำดับที่ 21 (XXI) The World มีความหมายว่าอย่างไร?","ความอุดมสมบูรณ์ ธรรมชาติ ความสวยงาม และการให้กำเนิด","การเริ่มต้น การผจญภัย อิสระ และพร้อมที่จะเดินหน้าแม้ข้างหน้าจะเป็นอันตราย","การจบสิ้นเพื่อเริ่มต้นใหม่ การเปลี่ยนแปลงสภาพ","ความจบสิ้นสมบูรณ์ ในทุก ๆ อย่าง มีอิสระและหลุดพ้นจากพันธนาการต่าง ๆ","ความจบสิ้นสมบูรณ์ ในทุก ๆ อย่าง มีอิสระและหลุดพ้นจากพันธนาการต่าง ๆ"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 0 The Fool คือใคร?","เทพซุส (Zeus)","เทพไดโอนิซัส (Dionysus)","เทพฮาเดส (Hades)","เทพโพไซดอน (Posidon)","เทพไดโอนิซัส (Dionysus)"));
        quizModalArrayList.add(new QuizModal("เรื่องราวของหอคอยบาเบล (Tower of Babel) ที่ปรากฏอยู่ในคัมภีร์ไบเบิลภาคพันธสัญญาเก่า บทปฐมกาล (Genesis) ที่เป็นที่มาของการที่ทำไมทั่วโลกจึงใช้ 'ภาษา' ที่แตกต่างกัน เป็นตำนานของไพ่อะไร?","Strength","The Tower","Wheel of Fortune","The Chariot","The Tower"));
        quizModalArrayList.add(new QuizModal("เทพีอิซตาร์ (Ishtar) เป็นตำนานเทพกรีกบนหน้าไพ่อะไร?","The Sun","The Moon","The Star","The Magician","The Star"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 10 (X) Wheel of Fortune คือใคร?","เทพีไอริส (Iris)","เทพีอโฟรไดท์ (Aprodite)","เทพีอินันนา (Inanna)","เทพีมอยเร (Moira)","เทพีมอยเร (Moira)"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายถึง สัญชาตญาณ พลังลึกลับซ่อนเร้น จิตวิญญาณความคิดที่ซ่อนเร้น ความซับซ้อน ไม่ชัดเจน?","ไพ่นักเวทย์","ไพ่ราชินีพระจันทร์","ไพ่พระสังฆราช","ไพ่จักรพรรดินี","ไพ่ราชินีพระจันทร์"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายถึง จารีต ประเพณี ศาสนา พิธีกรรม การสั่งสอนเผยแพร่?","ไพ่ฤาษี","ไพ่ราชินีพระจันทร์","ไพ่พระสังฆราช","ไพ่นักเวทย์","ไพ่พระสังฆราช"));
        quizModalArrayList.add(new QuizModal("ภาพในไพ่ลำดับที่ 12 (XII) The Hanged Man เป็นภาพของชายที่ถูกทรมานโดยการห้อยหัว การที่ชายคนนี้ถูกห้อยหัวมีความหมายว่าอย่างไร?","การควบคุมจิตใจ ความเข้มแข็ง ความอดทน","เพื่อมองสถานการณ์ในมุมมองใหม่ ๆ จนตระหนักรู้อะไรบางอย่างได้","การแยกตัว ค้นหาตัวเอง ดูจิตใจตัวเอง เพื่อมองสถานการณ์ในมุมกว้าง","ความอดทน การหาสมดุล การปรับตัว และการทดลอง ","เพื่อมองสถานการณ์ในมุมมองใหม่ ๆ จนตระหนักรู้อะไรบางอย่างได้"));
        quizModalArrayList.add(new QuizModal("เทพโอดิน (Odin) เป็นตำนานเทพกรีกบนหน้าไพ่อะไร?","Temperance","Judgement","Juctice","The Hanged Man","The Hanged Man"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายถึง การเริ่มต้น เปรียบเหมือนกับเด็กที่เกิดมาแล้วยังมีความเขลาอยู่ ยังไม่มีความรู้อะไร ทำให้ทำอะไรไปอย่างอิสระ ไร้เดียงสา และเพราะอย่างนั้นจึงถูกมองว่าเป็นคนมีความเพ้อฝัน ทำตามอารมณ์?","The Magician","The Empress","The Hierophant","The Fool","The Fool"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 21 (XXI) The World คือใคร?","เทพีไกอา (Gaia)","เทพีเอริส (Eris)"," เทพีดีมิเทอร์ (Demeter)","เทพีนัต (Nut)","เทพีไกอา (Gaia)"));
        quizModalArrayList.add(new QuizModal("ข้อใดคือความหมายของไพ่ลำดับที่ 13 (XIII) Death?","การเปลี่ยนแปลงอย่างกระทันหัน การพังทลาย สิ่งที่เราสร้างขึ้นมาได้พังลง","ความจบสิ้นสมบูรณ์ ในทุก ๆ อย่าง มีอิสระและหลุดพ้นจากพันธนาการต่าง ๆ","ความตาย การจบสิ้นชีวิต การสิ้นสุด","การจบสิ้นเพื่อเริ่มต้นใหม่ การเปลี่ยนแปลงสภาพ สิ่งที่ไม่ดีที่ผ่านมากำลังจะจบลง","การจบสิ้นเพื่อเริ่มต้นใหม่ การเปลี่ยนแปลงสภาพ สิ่งที่ไม่ดีที่ผ่านมากำลังจะจบลง"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 3 (III) The High Priestess คือใคร?","เทพีอิซตาร์ (Ishtar)","เทพีดีมิเทอร์ (Demeter)","เทพีเพอร์เซโฟนี (Persephone)","เทพีเฮรา (Hera)","เทพีเพอร์เซโฟนี (Persephone)"));
        quizModalArrayList.add(new QuizModal("‘การผูกมัด ความหลงใหล การเสพติด หรือสิ่งที่เราได้ก่อไว้หรือผูกไว้ ทำให้เรายังติดอยู่กับสิ่ง ๆ นั้นไม่หลุดไปเสียที’ หมายถึงไพ่อะไร?","The Devil","The Lover","The Tower","Temperance","The Devil"));
        quizModalArrayList.add(new QuizModal("ไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี ในสำรับของ Major Arcana มีทั้งหมดกี่ใบ ลำดับที่เท่าไรถึงเท่าไร?","21 ใบ ลำดับที่ 0-21","22 ใบ ลำดับที่ 0-21","21 ใบ ลำดับที่ 1-22","22 ใบ ลำดับที่ 1-22","22 ใบ ลำดับที่ 0-21"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายถึง ความอุดมสมบูรณ์ ธรรมชาติ ความสวยงาม ความเป็นแม่และการให้กำเนิด การมีลูก?","The High Priestess","The Empress","The Hierophant","The World","The Empress"));
        quizModalArrayList.add(new QuizModal("ไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี 1 สำรับ มีทั้งหมดกี่ใบ แบ่งออกเป็นกี่ประเภท อะไรบ้าง?","มีทั้งหมด 87 ใบ แบ่งออกเป็น 2 ประเภท ได้แก่ ไพ่ชุดใหญ่ ไพ่ชุดเล็ก","มีทั้งหมด 87 ใบ แบ่งออกเป็น 2 ประเภท ได้แก่ ไพ่ชุดหลัก ไพ่ชุดรอง","มีทั้งหมด 78 ใบ แบ่งออกเป็น 2 ประเภท ได้แก่ ไพ่ชุดใหญ่ ไพ่ชุดเล็ก","มีทั้งหมด 78 ใบ แบ่งออกเป็น 2 ประเภท ได้แก่ ไพ่ชุดหลัก ไพ่ชุดรอง","มีทั้งหมด 78 ใบ แบ่งออกเป็น 2 ประเภท ได้แก่ ไพ่ชุดหลัก ไพ่ชุดรอง"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 19 (XIX) The Sun คือใคร?","เทพีไอริส (Iris)","เทพีอาร์เทมิส (Artemis)","เทพอพอลโล (Apollo)","เทพไครอน (Chiron)","เทพอพอลโล (Apollo)"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายว่า ความมั่นคง ความควบคุม ความนิ่ง ความเป็นพ่อ ที่เข้มแข็ง การดูแลปกป้อง?","The Empress","The Emperor","Wheel of Fortune","Judgement","The Emperor"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายถึง ความสดใส ความสุข ความสำเร็จ สิ่งดี ๆ ที่กำลังเข้ามา ความขุ่นมัวที่หายไป?","The Magician","The Star","The Sun","The Tower","The Sun"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 7 (VII) The Chariot คือใคร?","เทพโอดิน (Odin)","เทพโครนัส (Cronos)","เทพแพน (Pan)","เทพเอเรส (Ares)","เทพเอเรส (Ares)"));
        quizModalArrayList.add(new QuizModal("เหตุการณ์ใดมีความเกี่ยวข้องกับไพ่ลำดับที่ 20 (XX) Judgement","12 ภารกิจของเฮอร์คิวลิส","สงครามกรุงทรอย","วันแห่งการพิพากษา","การสร้างมหาวิหารพาเธนอน เพื่อถวายแด่เทพีอาธีนา","วันแห่งการพิพากษา"));
        quizModalArrayList.add(new QuizModal("ไพ่ลำดับที่ 10 (X) Wheel of Fortune มีความหมายว่าอย่างไร?","ความมั่นคง ความควบคุม ความนิ่ง การดูแลปกป้อง","โชคชะตาที่เปลี่ยนแปลง การเปลี่ยนแปลงที่ไม่สามารถควบคุมได้ ความโชคดี","พรหมลิขิต โอกาสที่เข้ามา หรือทางเลือก","การเปลี่ยนแปลงกระทันหัน เปลี่ยนแปลงอย่างรุนแรง สิ่งที่เราสร้างขึ้นมาได้พังลง","โชคชะตาที่เปลี่ยนแปลง การเปลี่ยนแปลงที่ไม่สามารถควบคุมได้ ความโชคดี"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 6 (VI) The Lovers คือใคร?","เทพอีรอส (Eros)","เทพีอโฟรไดท์ (Aphrodite)","เทพอพอลโล (Apollo)","เทพีเฮสเทีย (Hestia)","เทพอีรอส (Eros)"));
        quizModalArrayList.add(new QuizModal("ข้อใดคือความหมายของไพ่ลำดับที่ 11 (XI) Justice?","ความกังวล ความกลัว อารมณ์อ่อนไหว ความรู้สึกไม่ปลอดภัย","ความหวัง การฟื้นฟูรักษา การเริ่มต้นใหม่","การหาสมดุล การปรับตัว การทดลอง และความอดทน","ความยุติธรรม ความเท่าเทียม การปรับสมดุลให้เท่าเทียม การตัดสินใจอย่างยุติธรรม","ความยุติธรรม ความเท่าเทียม การปรับสมดุลให้เท่าเทียม การตัดสินใจอย่างยุติธรรม"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 14 (XIV) Temperance คือใคร?","เทพีไอริส (Iris)","เทพีไนกี้ (Nike)","เทพีแอตแลนตา (Atlanta)","เทพีเพอร์เซโฟนี (Persephone)","เทพีไอริส (Iris)"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 5 (V) The Hierophant คือใคร?","เทพไครอน (Chiron)","เทพโพไซดอน (Posidon)","เทพโครนัส (Cronos)","เทพอูรานอส (Ouranos)","เทพไครอน (Chiron)"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 11 (XI) Juctice คือใคร?","เทพีอาร์เทมิส (Artemis)","เทพีอาธีนา (Athena)","เทพเฮอร์เมส (Hermes)","เทพเอเรส (Ares)","เทพีอาธีนา (Athena)"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายว่า พลัง ความรู้ ความสามารถที่สามารถสร้างสิ่งต่าง ๆ ขึ้นมาใหม่ได้?","ไพ่โลก","ไพ่คู่รัก","ไพ่อัศวินรถม้า","ไพ่นักเวทย์","ไพ่นักเวทย์"));
        quizModalArrayList.add(new QuizModal("ไพ่ใบใดมีความหมายว่า ความทรงพลัง ความแข็งแกร่ง ความแข็งแรง พละกำลัง ความกล้าหาญ?","Death","The Hermit","The Magician","Strength","Strength"));
        quizModalArrayList.add(new QuizModal("ไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี ในสำรับของ Minor Arcana มีทั้งหมดกี่ใบ ประกอบด้วยอะไรบ้าง?","56 ใบ ประกอบด้วย ไพ่ไม้เท้า ไพ่ถ้วย  ไพ่ดาบ ไพ่เหรียญ อย่างละ 16 ใบ","56 ใบ ประกอบด้วย ไพ่ไม้เท้า ไพ่ถ้วย  ไพ่ดาบ ไพ่เหรียญ อย่างละ 14 ใบ","65 ใบ ประกอบด้วย ไพ่ไม้เท้า ไพ่ถ้วย  ไพ่ดาบ ไพ่เหรียญ อย่างละ 16 ใบ","65 ใบ ประกอบด้วย ไพ่ไม้เท้า ไพ่ถ้วย  ไพ่ดาบ ไพ่เหรียญ อย่างละ 14 ใบ","56 ใบ ประกอบด้วย ไพ่ไม้เท้า ไพ่ถ้วย  ไพ่ดาบ ไพ่เหรียญ อย่างละ 14 ใบ"));
        quizModalArrayList.add(new QuizModal("เทพโครนัส (Cronos) เป็นตำนานเทพกรีกของไพ่ใบใด?","ไพ่ฤาษี","ไพ่ความกล้าหาญเข้มแข็ง","ไพ่อัศวินรถม้า","ไพ่จักรพรรดิ","ไพ่ฤาษี"));
        quizModalArrayList.add(new QuizModal("นางแอตแลนตา (Atlanta) เป็นตำนานเทพกรีกของไพ่ใบใด?","Wheel of Fortune","The Moon","Strength","The World","Strength"));
        quizModalArrayList.add(new QuizModal("ไพ่เหรียญ (Pentacles) ในสำรับไพ่ Minor Arcana ของไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี มีความหมายว่าอย่างไร?","บ่งบอกถึงลักษณะของคนธาตุดิน เทียบได้กับข้าวหลามตัด หมายถึง เงิน ความมั่นคง เศรษฐกิจ การค้า ความสำเร็จ","บ่งบอกถึงลักษณะของคนธาตุลม เทียบได้กับ โพธิ์ดำ หมายถึง การต่อสู้แต่การต่อสู้นั้นขึ้นกับเหตุการณ์รอบข้างที่กำลังเผชิญอยู่","บ่งบอกถึงลักษณะของคนธาตุน้ำ เทียบได้กับ โพธิ์แดง หมายถึง ความรู้สึก อารมณ์ ความพึงพอใจที่เปลี่ยนแปลงไปตามสถานการณ์","บ่งบอกถึงลักษณะของคนธาตุไฟ เทียบได้กับดอกจิก หมายถึง ความก้าวหน้า การงาน การศึกษา ความสำเร็จที่เติบโตขึ้น","บ่งบอกถึงลักษณะของคนธาตุดิน เทียบได้กับข้าวหลามตัด หมายถึง เงิน ความมั่นคง เศรษฐกิจ การค้า ความสำเร็จ"));
        quizModalArrayList.add(new QuizModal("ไพ่ไม้เท้า (Wands) ในสำรับไพ่ Minor Arcana ของไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี มีความหมายว่าอย่างไร?","บ่งบอกถึงลักษณะของคนธาตุน้ำ เทียบได้กับ โพธิ์แดง หมายถึง ความรู้สึก อารมณ์ ความพึงพอใจที่เปลี่ยนแปลงไปตามสถานการณ์","บ่งบอกถึงลักษณะของคนธาตุไฟ เทียบได้กับดอกจิก หมายถึง ความก้าวหน้า การงาน การศึกษา ความสำเร็จที่เติบโตขึ้น","บ่งบอกถึงลักษณะของคนธาตุดิน เทียบได้กับข้าวหลามตัด หมายถึง เงิน ความมั่นคง เศรษฐกิจ การค้า ความสำเร็จ","บ่งบอกถึงลักษณะของคนธาตุลม เทียบได้กับ โพธิ์ดำ หมายถึง การต่อสู้แต่การต่อสู้นั้นขึ้นกับเหตุการณ์รอบข้างที่กำลังเผชิญอยู่","บ่งบอกถึงลักษณะของคนธาตุไฟ เทียบได้กับดอกจิก หมายถึง ความก้าวหน้า การงาน การศึกษา ความสำเร็จที่เติบโตขึ้น"));
        quizModalArrayList.add(new QuizModal("ไพ่ดาบ (Swords) ในสำรับไพ่ Minor Arcana ของไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี มีความหมายว่าอย่างไร?","บ่งบอกถึงลักษณะของคนธาตุน้ำ เทียบได้กับ โพธิ์แดง หมายถึง ความรู้สึก อารมณ์ ความพึงพอใจที่เปลี่ยนแปลงไปตามสถานการณ์","บ่งบอกถึงลักษณะของคนธาตุไฟ เทียบได้กับดอกจิก หมายถึง ความก้าวหน้า การงาน การศึกษา ความสำเร็จที่เติบโตขึ้น","บ่งบอกถึงลักษณะของคนธาตุดิน เทียบได้กับข้าวหลามตัด หมายถึง เงิน ความมั่นคง เศรษฐกิจ การค้า ความสำเร็จ","บ่งบอกถึงลักษณะของคนธาตุลม เทียบได้กับ โพธิ์ดำ หมายถึง การต่อสู้แต่การต่อสู้นั้นขึ้นกับเหตุการณ์รอบข้างที่กำลังเผชิญอยู่","บ่งบอกถึงลักษณะของคนธาตุลม เทียบได้กับ โพธิ์ดำ หมายถึง การต่อสู้แต่การต่อสู้นั้นขึ้นกับเหตุการณ์รอบข้างที่กำลังเผชิญอยู่"));
        quizModalArrayList.add(new QuizModal("ไพ่ถ้วย (Cups) ในสำรับไพ่ Minor Arcana ของไพ่ทาโรต์ (Tarot) หรือไพ่ยิปซี มีความหมายว่าอย่างไร?","บ่งบอกถึงลักษณะของคนธาตุลม เทียบได้กับ โพธิ์ดำ หมายถึง การต่อสู้แต่การต่อสู้นั้นขึ้นกับเหตุการณ์รอบข้างที่กำลังเผชิญอยู่","บ่งบอกถึงลักษณะของคนธาตุดิน เทียบได้กับข้าวหลามตัด หมายถึง เงิน ความมั่นคง เศรษฐกิจ การค้า ความสำเร็จ","บ่งบอกถึงลักษณะของคนธาตุน้ำ เทียบได้กับ โพธิ์แดง หมายถึง ความรู้สึก อารมณ์ ความพึงพอใจที่เปลี่ยนแปลงไปตามสถานการณ์","บ่งบอกถึงลักษณะของคนธาตุไฟ เทียบได้กับดอกจิก หมายถึง ความก้าวหน้า การงาน การศึกษา ความสำเร็จที่เติบโตขึ้น","บ่งบอกถึงลักษณะของคนธาตุน้ำ เทียบได้กับ โพธิ์แดง หมายถึง ความรู้สึก อารมณ์ ความพึงพอใจที่เปลี่ยนแปลงไปตามสถานการณ์"));
        quizModalArrayList.add(new QuizModal("ไพ่ชุดรอง หรือ Minor Arcana มีความหมายว่าอะไร?","สิ่งมหัศจรรย์หรือมีความพิเศษ","ไพ่ชุดเล็ก หรือมีขนาดเล็ก","ความลับหรือลี้ลับ","การพยากรณ์หรือการทำนาย","ความลับหรือลี้ลับ"));
        quizModalArrayList.add(new QuizModal("ตำนานเทพกรีกบนหน้าไพ่ลำดับที่ 1 (I) The Magician คือ?","เทพอีออส (Eos)","เทพเฮอร์เมส (Hermes)","เทพอีรอส (Eros)","เฮฟเฟทัส (Hephaestus)","เทพเฮอร์เมส (Hermes)"));
        quizModalArrayList.add(new QuizModal("เทพีมอยเร (Moira) เป็นเทพีในตำนานเทพเจ้ากรีกของไพ่ลำดับที่ 10 (X) Wheel of Fortune เป็นบุตรแห่งเทพซุสและเทพีเทมิส เป็นเทพีสามองค์ที่เป็นเทพแห่งพรหมลิขิต คอยปั่นด้ายแห่งโชคชะตา เทพีทั้ง 3 องค์มีใครบ้าง?","อโทรพอส เอ็คโค โครโท","โคลโท แลกคีลิส อโทรพอส","โคลโท ไซคี แลกคีลิส","แลกคีลิส ออโรรา อโทรพอส","โคลโท แลกคีลิส อโทรพอส"));
        quizModalArrayList.add(new QuizModal("เรื่องราวของวิเศษของเทพเฮอร์เมสที่เป็นที่มาของสัญลักษณ์ทางการแพทย์ ของวิเศษนั้นคืออะไร?","หมวกมีปีกเพตตะซัส","เกือกติดปีกทะเลเรีย","ไม้ศักดิ์สิทธิ์กะดูเซียส","พิณไลร์","ไม้ศักดิ์สิทธิ์กะดูเซียส"));
        quizModalArrayList.add(new QuizModal("ตำนานของไพ่ลำดับที่ 11 (XI) Justice มีการพบนครแห่งหนึ่ง จึงมีการแข่งขันกันว่าใครเหมาะสมที่จะได้ครองนครนี้ ซึ่งเป็นการแข่งขันระหว่าง เทพโพไซดอนและเทพีอาธีนา ซึ่งใครบันดาลสิ่งมีประโยชน์ที่สุดก็จะชนะ ในเหตุการณ์ครังนี้เทพีอาธีนาได้บันดาลสิ่งใด?","ตาชั่ง","ม้า","ต้นทับทิม","ต้นมะกอก","ต้นมะกอก"));
        quizModalArrayList.add(new QuizModal("ข้อใดหมายถึง เทพีดีมิเตอร์ (Demeter) ตำนานเทพกรีกของหน้าไพ่ The Empress?","เทพีแห่งการเกษตรกรรม","เทพีแห่งความงามและความรัก","เทพีแห่งฤดูใบไม้ผลิ","เทพีแห่งปัญญา","เทพีแห่งการเกษตรกรรม"));
        quizModalArrayList.add(new QuizModal("ข้อใดหมายถึง เทพไดโอนีซัส (Dionysus) ตำนานเทพกรีกบนหน้าไพ่ The Fool?","เทพแห่งท้องฟ้า","เทพแห่งการสื่อสาร","เทพแห่งเหล้าองุ่นและความเป็นอิสระเสรี","เทพแห่งแสงสว่างและดวงอาทิตย์","เทพแห่งเหล้าองุ่นและความเป็นอิสระเสรี"));
        quizModalArrayList.add(new QuizModal("ข้อใดหมายถึง เทพีอาร์เทมิส (Artemis) ตำนานเทพกรีกบนหน้าไพ่ The Moon?","เทพแห่งการล่าสัตว์ป่า","เทพแห่งพรหมลิขิต","เทพแห่งฤดูเก็บเกี่ยว","เทพแห่งการสงคราม","เทพแห่งการล่าสัตว์ป่า"));
        quizModalArrayList.add(new QuizModal("ภาพในไพ่ลำดับที่ 6 The Lovers เรื่องราวของอดัมและอีฟในสวนอีเดนที่ถูกงูล่อลวงให้กินผลไม้ต้องห้ามที่พระเจ้าได้ห้ามไว้ ผลไม้นั้นคืออะไร?","ผลไม้แห่งความรัก","ผลไม้แห่งความงาม","ผลไม้แห่งความรู้","แอปเปิ้ลทองคำ","ผลไม้แห่งความรู้"));
        quizModalArrayList.add(new QuizModal("ข้อใดหมายถึง เทพีอินันนา (Inanna) ตำนานเทพกรีกของหน้าไพ่ The Star?","เทพีแห่งสายน้ำ","เทพแห่งความปรารถนา","เทพีแห่งสายรุ้ง","เทพแห่งสายลมตะวันตก","เทพีแห่งสายรุ้ง"));
        quizModalArrayList.add(new QuizModal("ตำนานของไพ่ลำดับที่ 2 (II) The High Priestess เทพีเพอร์เซโฟนีได้เสวยอะไรในยมโลก ทำให้นางต้องอยู่กับเทพฮาเดสในยมโลกเป็นเวลา 6 เดือน และกลับมาอยู่กับเทพีดีมิเตอร์เป็นเวลา 6 เดือน?","มะม่วงหิมพานต์","เมล็ดทับทิม","เมล็ดอัลมอนด์","ผลเสาวรส","เมล็ดทับทิม"));

        //Greek Roman Mythology question
        quizModalArrayList.add(new QuizModal("ใครที่ไม่ใช่ภรรยาของเฮราคลีส?","เทพีฮีบี","หญิงเดียไนร่า","เจ้าหญิงเฟดรา","เจ้าหญิงเมการ่า","เจ้าหญิงเฟดรา"));
        quizModalArrayList.add(new QuizModal("เทพีเฮสเทีย มีลักษณะนิสัยเป็นอย่างไร?","ร่าเริง สนุกสนาน","โหดเหี้ยม ทารุณ","รักสงบ ชอบความเรียบง่าย","เต็มไปด้วยไฟกิเลส ตัณหา","รักสงบ ชอบความเรียบง่าย"));
        quizModalArrayList.add(new QuizModal("ใครในข้อใดต่อไปนี้ ไม้ได้เป็นภรรยาของเทพอพอลโล?","แคลลิโอพี","แดฟนี่","โคโรนิส","เครอูซา","แดฟนี่"));
        quizModalArrayList.add(new QuizModal("เทพซุสตามจีบเทพีเฮรากี่ปีถึงทำสำเร็จ?","400 ปี","200 ปี","100 ปี","300 ปี","300 ปี"));
        quizModalArrayList.add(new QuizModal("ต้นโอ๊ก เป็นต้นไม้ประจำตัวของเทพเจ้าองค์ใด?","เทพเฮอร์เมส","เทพซุส","เทพโพไซดอน","เทพีเฮรา","เทพซุส"));
        quizModalArrayList.add(new QuizModal("วิหารพาร์เธนอน เป็นวิหารประจำตัวของเทพีองค์ใด?","เทพีอโฟรไดท์","เทพีไนกี้","เทพีอาธีนา","เทพีเฮรา","เทพีไนกี้"));
        quizModalArrayList.add(new QuizModal("สัตว์ชนิดใด ที่เทพเจ้าประทานพรให้ว่าไม่มีใครสามารถจับมันได้?","สุนัขเซอร์เบอรัส","จิ้งจอกเลออิแลป","สุนัขออร์ธัส","จิ้งจอกทิวเมสเซียน","จิ้งจอกทิวเมสเซียน"));
        quizModalArrayList.add(new QuizModal("ดีมอสและโฟบอส เป็นลูกของเทพเจ้าองค์ใด?","เทพซุส กับ เลเมีย","เอเรส กับ เรห์ ซิลเวีย","เอเรส กับ อโฟรไดท์","เอเรส กับ อีรีส","เอเรส กับ เรห์ ซิลเวีย"));
        quizModalArrayList.add(new QuizModal("เทพีอโฟรไดท์ กับ เทพเอเรส มีลูกด้วยกันสามคน ชื่อว่าอะไรบ้าง?","อีเนียส ไอออน พรอคเน","อีรอส แอนติรอส ฮาร์โมเนีย","ฟริกซัส เฮลลี เมลิเซอร์เทส","เฮอร์มาโฟรไดตุส ออโตไลคัส แพน","อีรอส แอนติรอส ฮาร์โมเนีย"));
        quizModalArrayList.add(new QuizModal("ใครในข้อใดต่อไปนี้ ไม่ได้อยู่ในราชวงศ์แห่งเอเทรียส?","เออาคัส","พีลอปส์","พิทธัส","เอทรา","เออาคัส"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใด ที่เป็นผู้จัดการกับอสุรกายไทฟอนได้สำเร็จ?","เทพีอาธีนา","เทพซุส","ไกอา","เทพโพไซดอน","เทพซุส"));
        quizModalArrayList.add(new QuizModal("หมอเทวดาแอสคาลิปิอัส เป็นบุตรของใคร?","เทพอพอลโล กับ โคโรนิส","เทพอพอลโล กับ แคลลิโอพี","เทพอพอลโล กับ ไคลมินี","เทพอพอลโล กับ เครอูซา","เทพอพอลโล กับ โคโรนิส"));
        quizModalArrayList.add(new QuizModal("นกฮูก เป็นสัตว์ประจำตัวของเทพีองค์ใด?","เทพีอโฟรไดท์","เทพีนิกซ์","เทพีเฮรา","เทพีอาธีนา","เทพีอาธีนา"));
        quizModalArrayList.add(new QuizModal("เทพเจ้าแห่งทะเลลึกยุคโบราณคือใคร?","โพไซดอน","โอเชียนัส","พอนทัส","นีรูส","พอนทัส"));
        quizModalArrayList.add(new QuizModal("เหล่าอสุรกายกอร์กอน เป็นลูกของใคร?","ไกอา กับ พอนทัส","ไกอา กับ ทาร์ทารัส","ซุส กับ เอจินา","ฟอร์ซีส กับ ซีโต","ฟอร์ซีส กับ ซีโต"));
        quizModalArrayList.add(new QuizModal("ท้าวไพรอัม กับ นางเฮกคิวบา มีลูกด้วยกันชื่อว่าอะไร?","แพนไดออน พรอคเน เทริอัส","อีเนียส ลีดา เฮเลน","แอนไคซีส คาสซันดรา เลือมมิดอน","เฮกเตอร์ เดอิโฟบัส ปารีส","เฮกเตอร์ เดอิโฟบัส ปารีส"));
        quizModalArrayList.add(new QuizModal("ในสงครามกรุงทรอย เทพ-เทพีองค์ใด ที่อยู่ฝ่ายทรอย?","ไนกี้ สติกซ์ คราทอส","อพอลโล อโฟรไดท์ แอรีส","เฮรา อธีนา โพไซดอน","เนเมซิส ไบอา ซีลุส","อพอลโล อโฟรไดท์ แอรีส"));
        quizModalArrayList.add(new QuizModal("ชื่อเก่าของเจ้าชายปารีสชื่อว่าอะไร?","อัสซาราคัส","ทินดาริอุส","แคปิส","อเล็กซานเดอร์","อเล็กซานเดอร์"));
        quizModalArrayList.add(new QuizModal("ท้าวแอทามัส กับ นางไอโน มีลูกด้วยกันชื่อว่าอะไร?","สเกนิอัส","เมลิเซอร์เทส","แอนทิโลคัส","เฟเรส","เมลิเซอร์เทส"));
        quizModalArrayList.add(new QuizModal("อะเอโรเพ กับ เอเทรียส มีลูกด้วยกันชื่อว่าอะไร?","เมเนซัส กับ เฮมอน","อกาเมมนอน กับ เมเนเลอัส","อิเล็กทริออน กับ อัลเซอัส","เอจิปทัส กับ ดานาอัส","อกาเมมนอน กับ เมเนเลอัส"));
        quizModalArrayList.add(new QuizModal("ข้อใดเรียงลำดับเทพผู้ปกครองโอลิมปัสได้ถูกต้อง (จากมาก่อนไปองค์สุดท้าย)?","อูรานอส > โครนอส > ซุส","โครนอส > ซุส > อูรานอส","โครนอส > อูรานอส > ซุส","ซุส > โครนอส > อูรานอส","อูรานอส > โครนอส > ซุส"));
        quizModalArrayList.add(new QuizModal("วงศ์เทพโอลิมเปียนที่กำเนิดจากโครนอสและรีอา มีเทพองค์ใดบ้าง?","เฮสเทีย ,ซุส ,เฮรา ,ฮาเดส ,โพไซดอน ,ดีมิเทอร์","ซุส, ฮาเดส, โพไซดอน, เฮรา, ไดโอนีซุส, เฮสเทีย","อาธีนา, อพอลโล , อาร์เทมิส , เอเรส , อโฟรไดท์, ไดโอนีซุส","อาร์เทมิส, อพอลโล, ซุส, เฮรา, เฮสเทีย, ดีมิเทอร์","เฮสเทีย ,ซุส ,เฮรา ,ฮาเดส ,โพไซดอน ,ดีมิเทอร์"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใด สละตำแหน่งสภาแห่งทวยเทพให้แก่ไดโอนีซุส?","ไอริส","เฮสเทีย","เพอร์เซโฟนี","เฮคาที","เฮสเทีย"));
        quizModalArrayList.add(new QuizModal("ข้อใดคือ 12 เทพแห่งโอลิมปัสหรือสภาแห่งทวยเทพทั้งหมด?","ฮีบี, อพอลโล, อาร์เทมิส","เฮรา, ไอริส, ออโรร่า","ฮาเดส, ซุส, โพไซดอน","เฮอร์เมส, เอเรส, เฮฟเฟตัส","เฮอร์เมส, เอเรส, เฮฟเฟตัส"));
        quizModalArrayList.add(new QuizModal("เพราะเหตุใด ซุสจึงได้เป็นเทพผู้ปกครองโอลิมปัส?","มีการต่อสู้แย่งชิงบัลลังก์กันระหว่างพี่น้อง และซุสเป็นผู้ชนะจึงได้เป็นผู้ปกครองโอลิมปัส","ซุสเป็นพี่ใหญ่สุดจึงได้เกียรติเป็นผู้ปกครองโอลิมปัส","ซุสได้ช่วยพี่ ๆ ออกมาจากท้องของโครนอส และโค่นบัลลังก์โครนอสได้ เหล่าพี่น้องจึงให้เกียรติแก่ซุส","ไม่มีข้อใดถูก","ซุสได้ช่วยพี่ ๆ ออกมาจากท้องของโครนอส และโค่นบัลลังก์โครนอสได้ เหล่าพี่น้องจึงให้เกียรติแก่ซุส"));
        quizModalArrayList.add(new QuizModal("โดยความจริงแล้ว เฮรามีศักดิ์เป็นอะไรกับซุส?","อา","น้องสาว","ลูก","พี่สาว","พี่สาว"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใดบ้างที่กำเนิดจากซุส กับ เฮรา?","เฮฟเฟตัส, ไดโอนีซุส, แอรีส, อธีนา, เฮอร์เมส","ฮีบี, อิลลิธธียา, เอเรส, อีริส, เฮฟเฟตัส","อโฟรไดท์, ฮีบี, เพอร์เซโฟนี, อพอลโล, อาร์เทมิส","ไดโอนีซุส, อีรอส, มิวส์, เฮฟเฟตัส, เกรซ","ฮีบี, อิลลิธธียา, เอเรส, อีริส, เฮฟเฟตัส"));
        quizModalArrayList.add(new QuizModal("บางตำนานกล่าวว่าเฮราได้อิจฉาซุสที่ได้กำเนิด อธีนา ด้วยตัวเอง เฮราจึงสร้างเทพองค์ใด ขึ้นด้วยตัวเองโดยไม่อาศัยซุส?","เอเรส","เฮลิออส","แพน","เฮฟเฟตัส","เอเรส"));
        quizModalArrayList.add(new QuizModal("เพราะเหตุใดเฮฟเฟตัสถึงถูกโยนลงมาจากโอลิมปัส?","ได้ก่อกบฏกับเทพโอลิมเปียน","มีหน้าตาที่น่าเกลียด อัปลักษณ์","มีความสามารถเกินกว่าเทพองค์อื่น","ได้ไปมีชู้กับนางไม้ของซุส","มีหน้าตาที่น่าเกลียด อัปลักษณ์"));
        quizModalArrayList.add(new QuizModal("เทพีองค์ใด ไม่ใช่เทพีพหรมจรรย์?","ดีมิเทอร์","อธีนา","เฮสเทีย","อาร์เทมิส","ดีมิเทอร์"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใด มีอานุภาพรองจากซุสเพียงองค์เดียวเท่านั้น?","ฮาเดส","ดีมิเตอร์","โพไซดอน","เฮรา","โพไซดอน"));
        quizModalArrayList.add(new QuizModal("เทพีองค์ใดเป็นธิดาโปรดของซุส?","อาธีนา","ฮีบี","อโฟรไดท์","เพอร์เซโฟนี","อาธีนา"));
        quizModalArrayList.add(new QuizModal("เทพีองค์ใดได้รับฉายาว่า 'สาวงามพาร์เธนอส'?","เพอร์เซโฟนี","อาธีนา","อโฟรไดท์","เฮรา","อาธีนา"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใดที่ชาวโรมันชื่นชอบมากกว่าที่ชาวกรีกชอบ?","อพอลโล","เอเรส","ไดโอนีซุส","เฮอร์เมส","เอเรส"));
        quizModalArrayList.add(new QuizModal("โดยบางตำนานกล่าวว่า มีเทพที่กำเนิดผุดจากฟองสมุทร คือเทพองค์ใด?","โพไซดอน","ไอริส","โพรทิอัส","อโฟรไดท์","อโฟรไดท์"));
        quizModalArrayList.add(new QuizModal("อนุเทพที่สำคัญที่สุดแห่งโอลิมปัส คือเทพองค์ใด?","ฮีบี","ไฮเมน","ไอริส","อีรอส","อีรอส"));
        quizModalArrayList.add(new QuizModal("เหล่าเทพีเกรซทั้ง 3 องค์ มีความหมายว่าอะไรบ้าง?","ความโกรธ, ความแค้น, ความพยาบาท","ความรัก, ความงาม, ความใคร่","ความชอบธรรม, ความยุติธรรม, ความโกรธที่ชอบธรรม","ความรุ่งโรจน์, ความร่าเริง, ความสนุกสนาน","ความรุ่งโรจน์, ความร่าเริง, ความสนุกสนาน"));
        quizModalArrayList.add(new QuizModal("เหล่าเทพีมิวส์มีกี่องค์?","8 องค์","9 องค์","7 องค์","10 องค์","9 องค์"));
        quizModalArrayList.add(new QuizModal("ข้อใดไม่ใช่ เหล่าเทพีมิวส์?","มิวส์แห่งนาฏศิลป์","มิวส์แห่งรัฐศาสตร์","มิวส์แห่งดาราศาสตร์","มิวส์แห่งประวัติศาสตร์","มิวส์แห่งรัฐศาสตร์"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใดบ้าง เป็นเทพผู้นำสารของปวงเทพ?","ฮีบี, เอริส","อัลลิธธิยา, อีรอส","ไอริส, เฮอร์เมส","อพอลโล, อาร์เทมิส","ไอริส, เฮอร์เมส"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใด บางครั้งก็มีหน้าที่เป็นผู้อัญเชิญจอกสำหรับปวงเทพ?","ฮีบี","มิวส์","ไอริส","ไดโอนีซุส","ฮีบี"));
        quizModalArrayList.add(new QuizModal("เทพองค์ใดบ้างเป็นเทพสูงสุดแห่ง 'พิภพ' และมีความสำคัญมากในปกรณัมกรีกและโรมัน?","ดีมิเทอร์ , ไดโอนีซุส","อพอลโล , อาร์เทมิส","ฮาเดส , เพอร์เซโฟนี","ซุส , เฮรา","ดีมิเทอร์ , ไดโอนีซุส"));
        quizModalArrayList.add(new QuizModal("ข้อใดคือความหมายของพระนามของเทพซุส?","ผู้มีความยุติธรรม","ความสว่างไสวของท้องฟ้า","ความร้อนแรงแห่งดวงอาทิตย์","ความโหดร้ายของธรรมชาติ","ความสว่างไสวของท้องฟ้า"));
        quizModalArrayList.add(new QuizModal("เหตุใดเทพีเฮราจึงเป็นที่รู้จักในแง่ของอารมณ์ดุร้าย?","ทรงมีเรื่องราวหึงหวงกับชายาต่าง ๆ ของเทพซุสบ่อยครั้ง","ทรงมีรูปอัปลักษณ์","ทรงเป็นเทพแห่งหญิงสาวและชีวิตสมรส","ทรงเป็นพระมเหสีของเทพซุส","ทรงมีเรื่องราวหึงหวงกับชายาต่าง ๆ ของเทพซุสบ่อยครั้ง"));
        quizModalArrayList.add(new QuizModal("เหตุใดเทพโพไซดอนจึงเคยคิดโค่นอำนาจของซุส?","เทพโพไซดอนเป็นพี่ของเทพเจ้าซุส","เทพซุสมีความประพฤติทางเพศที่เสื่อมเสีย","เทพซุสขาดความยุติธรรมในการตัดสินคดี","เทพโพไซดอนถูกเทพเฮราและอาธีนาหลอกลวง","เทพโพไซดอนถูกเทพเฮราและอาธีนาหลอกลวง"));
        quizModalArrayList.add(new QuizModal("การที่เทพเฮราทรงเป็นเทพีแห่งหญิงสาวแสดงว่าพระนางเป็นผู้ปกป้องสิ่งใด?","พรหมจรรย์ของหญิงสาว","สตรีที่แต่งงานแล้ว","ความอุดมสมบูรณ์ของพืชพรรณ","ความมั่นคงของบ้านเมือง","สตรีที่แต่งงานแล้ว"));
        quizModalArrayList.add(new QuizModal("เทพีอาร์เทมิส เทพีแห่งดวงจันทร์ทรงเป็นพี่น้องฝาแฝดกับเทพเจ้าองค์ใด?","เทพฮาเดส เทพแห่งโลกหลังความตาย","เทพีอาธีนา เทพีแห่งสงคราม","เทพอพอลโล เทพแห่งดวงอาทิตย์","เทพีอโฟรไดท์ เทพีแห่งความรัก","เทพอพอลโล เทพแห่งดวงอาทิตย์"));
        quizModalArrayList.add(new QuizModal("ถ้าคนหนุ่มสาวชาวกรีกต้องการสมหวังในความรักควรขอพรจากเทพองค์ใด?","เทพีอโฟรไดท์","เทพีเพอร์เซโฟนี","เทพซุส","เทพอพอลโล","เทพีอโฟรไดท์"));
        quizModalArrayList.add(new QuizModal("เหตุใดเทพีอาธีนาจึงได้รับการยกย่องและบูชามากกว่าเทพีเอริสทั้งที่เป็นเทพแห่งสงครามเหมือนกัน?","เทพีอาธีนามีรูปโฉมงดงามกวา่าเทพเอเรส","เทพเอเรสไม่นิยมการใช้กำลัง","เทพีอาธีนาใช้สติปัญญาและการวางแผนในการสู้รบ","เทพีอาธีนาเป็นบุตรของเทพเจ้าซุสและเทพเจ้าเฮรา","เทพีอาธีนาใช้สติปัญญาและการวางแผนในการสู้รบ"));
        quizModalArrayList.add(new QuizModal("ตามความเชื่อของชาวกรีก เทพเจ้าองค์ใดคือ ผู้ที่สอนให้ชาวกรีกรู้จักการปลูกพืชและมีอารยธรรมเกิดขึ้น?","เทพเฮียเรอ","เทพอพอลโล","เทพีอาธีนา","เทพีดีมิเทอร์","เทพีดีมิเทอร์"));

    }


}











