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

public class GodActivity extends AppCompatActivity {

    private List<god_list> godList;
    private int currentGod = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_god2);

        final String topic = getIntent().getStringExtra("หัวข้อ");
        godList = god.getGod(topic);

        final ImageView pic = findViewById(R.id.pic1);
        final TextView nameGod = findViewById(R.id.nameCard);
        final TextView historyGod = findViewById(R.id.historyCard);

        final ImageButton backgod = findViewById(R.id.reforetell);
        final ImageButton homegod = findViewById(R.id.homeMenuQuiz);

        pic.setImageResource(godList.get(0).getPic());
        nameGod.setText(godList.get(0).getNameGod());
        historyGod.setText(godList.get(0).getHisGod());

        backgod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(GodActivity.this, MainActivity8.class));
                finish();

                }
            });

        homegod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GodActivity.this, MainActivity2.class));
                finish();
            }
        });

    }
}
