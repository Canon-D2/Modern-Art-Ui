package com.example.modernartui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Đường dẫn facebook đặt trong hôp thoại **/
    static private final String URL = "https://www.facebook.com/dcbaosgu";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** NÚT 1: MỞ ACTIVITY LINEAR LAYOUT **/
        button = (Button) findViewById(R.id.buttonL);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinearLayout();
            }
        });

        /** NÚT 1: MỞ ACTIVITY RELATIVE LAYOUT **/
        button = (Button) findViewById(R.id.buttonR);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRelativeLayout();
            }
        });

        /** NÚT 1: MỞ ACTIVITY TABLE LAYOUT **/
        button = (Button) findViewById(R.id.buttonT);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTableLayout();
            }
        });
    }
    public void openLinearLayout() {
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }
    public void openRelativeLayout() {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
    public void openTableLayout() {
        Intent intent = new Intent(this, TableLayout.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        /** THÊM MỤC VÀO MENU 3 CHẤM BÊN GÓC PHẢI**/
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_more_info) {

            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);

            /** TẠO HỘP THOẠI  **/
            TextView dialog_title = new TextView(this);
            dialog_title.setText(R.string.dialog_title);
            dialog_title.setGravity(Gravity.CENTER_HORIZONTAL);
            dialog_title.setPadding(100,30,100,30);
            dialog_title.setTextSize(20);
            builder.setCustomTitle(dialog_title);

            builder.setMessage(R.string.dialog_message);

            builder.setPositiveButton(R.string.not_now, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    /** THAO TÁC THOÁT KHỎI HỘP THOẠI **/
                }
            });
            builder.setNegativeButton(R.string.visit_sgu, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                    /** CHUYỂN HƯỚNG ĐẾN URL TA ĐÃ ĐẶT **/
                    Intent sguIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                    startActivity(sguIntent);
                }
            });

            AlertDialog dialog = builder.show();

            TextView dialog_msg = (TextView) dialog.findViewById(android.R.id.message);

            dialog_msg.setGravity(Gravity.CENTER_HORIZONTAL);
            dialog_msg.setTextSize(14);
            dialog_msg.setPadding(10,60,10,0);
        }
        return super.onOptionsItemSelected(item);
    }
}