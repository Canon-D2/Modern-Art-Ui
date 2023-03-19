package com.example.modernartui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;

import java.util.Random;

public class RelativeLayout extends Activity {

    /** TẠO THANH KÉO TRƯỢT **/
    SeekBar sb;

    /** TẠO TEXTVIEW HÌNH KHỐI (CUBE) NHIỀU MÀU SẮC **/
    TextView cube1, cube2, cube3, cube4, cube5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        sb = findViewById(R.id.seekBarR);
        sb.setMax(100);
        cube1 = findViewById(R.id.cube1);
        cube2 = findViewById(R.id.cube2);
        cube3 = findViewById(R.id.cube3);
        cube4 = findViewById(R.id.cube4);
        cube5 = findViewById(R.id.cube5);

        /** ĐIỀU KHIỂN THANH KÉO ĐỂ TRƯỢT **/
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                /** MÀU SẮC BAN ĐẦU MẶC ĐỊNH CỦA CÁC TEXT VIEW - BOX **/
                if (progress == 0) {
                    cube1.setBackgroundColor(Color.parseColor("#6977b6"));
                    cube2.setBackgroundColor(Color.parseColor("#d74f97"));
                    cube3.setBackgroundColor(Color.parseColor("#a41d21"));
                    cube4.setBackgroundColor(Color.parseColor("#e6e6e6"));
                    cube5.setBackgroundColor(Color.parseColor("#273a98"));
                } else {
                    /** ĐỊNH DẠNG MÃ RGB BAN ĐẦU VÀ KHỞI TẠO HÀM RANDOM **/
                    Random r = new Random();
                    int red = r.nextInt(255);
                    int green = r.nextInt(255);
                    int blue = r.nextInt(255);

                    /** THAY ĐỔI MÀU SẮC CỦA CÁC BOX BẰNG CÁCH THAY ĐỔI MÃ MÀU RGB CỦA CHÚNG MỘT CÁCH NGẪU NHIÊN**/
                    cube1.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    cube2.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    cube3.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    cube4.setBackgroundColor(Color.rgb(red, green, blue));
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    cube5.setBackgroundColor(Color.rgb(red, green, blue));
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
