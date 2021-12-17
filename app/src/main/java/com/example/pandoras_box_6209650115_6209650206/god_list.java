//Natchaya Wichayapinyo 6209650115
//Thanaporn Hongthong 6209650206

package com.example.pandoras_box_6209650115_6209650206;

import androidx.appcompat.app.AppCompatActivity;

public class god_list extends AppCompatActivity {
    private int picture;
    private String nameGod;
    private String hisGod;

    public god_list()
    {}

    public god_list(int pic, String nameGod, String hisGod) {
        picture = pic;
        this.nameGod = nameGod;
        this.hisGod = hisGod;
    }

    public int getPic() {
        return picture;
    }

    public void setPic(int pic) {
        picture = pic;
    }

    public String getNameGod() {
        return nameGod;
    }

    public void setNameGod(String nameGod) {
        this.nameGod = nameGod;
    }

    public String getHisGod() {
        return hisGod;
    }

    public void setHisGod(String hisGod) {
        this.hisGod = hisGod;
    }
}
