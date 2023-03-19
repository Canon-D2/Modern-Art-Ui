package com.example.modernartui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Random;

public class TableLayout extends Activity {

    /** TẠO THANH KÉO TRƯỢT **/
    SeekBar sb;

    /** TẠO TEXTVIEW HÌNH KHỐI (BRICK) NHIỀU MÀU SẮC **/
    TextView brick1, brick2, brick3, brick4, brick5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
        sb = findViewById(R.id.seekBarT);
        sb.setMax(100);
        brick1 = findViewById(R.id.brick1);
        brick2 = findViewById(R.id.brick2);
        brick3 = findViewById(R.id.brick3);
        brick4 = findViewById(R.id.brick4);
        brick5 = findViewById(R.id.brick5);

        /** ĐIỀU KHIỂN THANH KÉO ĐỂ TRƯỢT **/
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /** MÀU SẮC BAN ĐẦU MẶC ĐỊNH CỦA CÁC TEXT VIEW - BOX **/
                if (progress == 0) {
                    brick1.setBackgroundColor(Color.parseColor("#6977b6"));
                    brick2.setBackgroundColor(Color.parseColor("#d74f97"));
                    brick3.setBackgroundColor(Color.parseColor("#a41d21"));
                    brick4.setBackgroundColor(Color.parseColor("#e6e6e6"));
                    brick5.setBackgroundColor(Color.parseColor("#273a98"));
                } else {
                    /** ĐỊNH DẠNG MÃ RGB BAN ĐẦU VÀ KHỞI TẠO HÀM RANDOM **/
                    Random r = new Random();
                    int red = r.nextInt(255);
                    int green = r.nextInt(255);
                    int blue = r.nextInt(255);

                    /** THAY ĐỔI MÀU SẮC CỦA CÁC BOX BẰNG CÁCH THAY ĐỔI MÃ MÀU RGB CỦA CHÚNG MỘT CÁCH NGẪU NHIÊN**/
                    brick1.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    brick2.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    brick3.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    brick4.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    brick5.setBackgroundColor(Color.rgb(red, green, blue));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //nothing
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //nothing
            }
        });
    }
}