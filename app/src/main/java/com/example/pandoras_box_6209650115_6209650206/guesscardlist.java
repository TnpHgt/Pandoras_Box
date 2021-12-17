//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class guesscardlist extends AppCompatActivity {

    private int pic;
    private String namehistorytarotcard;
    private String historyguesstarotcard;

    public  guesscardlist(){
    }

    public guesscardlist(int pic, String namehistorytarotcard, String historyguesstarotcard) {
        this.pic = pic;
        this.namehistorytarotcard = namehistorytarotcard;
        this.historyguesstarotcard = historyguesstarotcard;
    }

    public int getPic() {

        return pic;
    }

    public void setPic(int pic) {

        this.pic = pic;
    }

    public String getNamehistorytarotcard() {

        return namehistorytarotcard;
    }

    public void setNamehistorytarotcard(String namehistorytarotcard) {

        this.namehistorytarotcard = namehistorytarotcard;
    }

    public String getHistoryguesstarotcard() {

        return historyguesstarotcard;
    }

    public void setHistoryguesstarotcard(String historyguesstarotcard) {

        this.historyguesstarotcard = historyguesstarotcard;
    }
}