//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class card_tarot extends AppCompatActivity {
    private List<guesscardlist> cardList;
    private int currentguessCard = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_tarot);

        String sum = getIntent().getStringExtra("sum");

        cardList=cardtarot.getCard(sum);
        final ImageView pic=findViewById(R.id.pictarotcad);
        final TextView namehistorytarotcard=findViewById(R.id.namehistorytarotcard);
        final TextView historyguesstarotcard=findViewById(R.id.historyguesstarotcard);

        final ImageButton backForetell = findViewById(R.id.backForetell);
        final AppCompatButton reforetell = findViewById(R.id.reforetell);

        pic.setImageResource(cardList.get(0).getPic());
        namehistorytarotcard.setText(cardList.get(0).getNamehistorytarotcard());
        historyguesstarotcard.setText(cardList.get(0).getHistoryguesstarotcard());

        backForetell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(card_tarot.this, MainActivity9.class));
                finish();
            }
        });

        reforetell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(card_tarot.this, MainActivity9.class));
                finish();
            }
        });

    }
}