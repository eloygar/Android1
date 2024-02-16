package com.example.menuruntime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private final int MENU_DOWNLOAD =1;
    private final int MENU_SETTING =2;
    private boolean showDownload =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggleButton = findViewById(R.id.toblerone);
        toggleButton.setOnClickListener(v->tooggleMenu(v));
    }
    public void tooggleMenu(View view){
        showDownload = !showDownload;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,MENU_DOWNLOAD,0,R.string.menu_download);
        menu.add(0,MENU_SETTING,0,R.string.menu_settings);
        return  true ;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.findItem(MENU_DOWNLOAD);
        menuItem.setVisible(showDownload);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case MENU_DOWNLOAD :
                Toast.makeText(this, R.string.menu_download, Toast.LENGTH_SHORT).show();
                break;
            case MENU_SETTING:
                Toast.makeText(this, R.string.menu_settings, Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onContextItemSelected(item);
        }
        return  true ;
    }
}