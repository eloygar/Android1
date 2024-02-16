package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(v -> {
            onClickButton(v);
        });

    }
    private PopupMenu.OnMenuItemClickListener mOnMenuItemClickListener
            = new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            int num = item.getItemId();
            if (num== R.id.menu_reply){
                Toast.makeText(MainActivity.this, "Reply", Toast.LENGTH_SHORT).show();
                return true ;
            }else if (num== R.id.menu_reply_all){
                Toast.makeText(MainActivity.this, "Reply all", Toast.LENGTH_SHORT).show();
                return true ;
            }else if(num== R.id.menu_forward){
                Toast.makeText(MainActivity.this, "forward", Toast.LENGTH_SHORT).show();
                return true ;
            }
            return false;
        }
    };
    void onClickButton(View view){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this , view);
        popupMenu.inflate(R.menu.menu_popup);
        popupMenu.setOnMenuItemClickListener(mOnMenuItemClickListener);
        popupMenu.show();
    }
}