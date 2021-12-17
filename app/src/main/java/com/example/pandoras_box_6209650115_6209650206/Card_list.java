//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

public class Card_list extends AppCompatActivity {

    private int picture;
    private String nameCard;
    private String hisCard;

    public Card_list()
    {}

    public Card_list(int pic, String nameCard, String hisCard) {
        picture = pic;
        this.nameCard = nameCard;
        this.hisCard = hisCard;
    }

    public int getPic() {

        return picture;
    }

    public void setPic(int pic) {

        picture = pic;
    }

    public String getNameCard() {

        return nameCard;
    }

    public void setNameCard(String nameCard) {

        this.nameCard = nameCard;
    }

    public String getHisCard() {

        return hisCard;
    }

    public void setHisCard(String hisCard) {

        this.hisCard = hisCard;
    }
}
