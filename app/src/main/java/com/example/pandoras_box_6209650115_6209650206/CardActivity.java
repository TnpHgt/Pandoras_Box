//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardActivity extends AppCompatActivity {

    private List<Card_list> cardList;
    private int currentCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        final String topic = getIntent().getStringExtra("หัวข้อ");
        cardList = Card.getCard(topic);

        final ImageView pic1 = findViewById(R.id.pic1);
        final TextView nameCard = findViewById(R.id.nameCard);
        final TextView historyCard = findViewById(R.id.historyCard);

        final ImageButton backcard = findViewById(R.id.reforetell);
        final ImageButton homecard = findViewById(R.id.homeMenuQuiz);

        pic1.setImageResource(cardList.get(0).getPic());
        nameCard.setText(cardList.get(0).getNameCard());
        historyCard.setText(cardList.get(0).getHisCard());

        backcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(CardActivity.this, MainActivity6.class));
                finish();

            }
        });

        homecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CardActivity.this, MainActivity2.class));
                finish();
            }
        });

    }
}