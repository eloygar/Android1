package com.example.contextualmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActionMode mActionMode;
    private ActionMode.Callback mActionModeCallback = new
            ActionMode.Callback() {
                @Override
                public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                    mode.getMenuInflater().inflate(R.menu.menu, menu);
                    return true;
                }
                @Override
                public boolean onPrepareActionMode(ActionMode mode, Menu menu)
                {
                    return false;
                }
                @Override
                public boolean onActionItemClicked(ActionMode mode, MenuItem item)
                {
                    if (item.getItemId()==R.id.menu_cast){
                        Toast.makeText(MainActivity.this, "Cast", Toast.LENGTH_SHORT).show();
                        mode.finish();
                        return true;
                    }else if (item.getItemId()==R.id.menu_print){
                        Toast.makeText(MainActivity.this, "Print", Toast.LENGTH_SHORT).show();
                        mode.finish();
                        return true;
                    }else return false;
                }

                @Override
                public void onDestroyActionMode(ActionMode mode) {
                    mActionMode = null;
                }
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                if(mActionMode!= null) return false;
                mActionMode = startActionMode(mActionModeCallback);
                return true;
            }
        });
    }

}