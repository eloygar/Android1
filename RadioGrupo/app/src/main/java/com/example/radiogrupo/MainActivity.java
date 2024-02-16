package com.example.radiogrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioGroup ;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup= findViewById(R.id.pica);
        radioGroup.setOnCheckedChangeListener((radioGroup,i)->onCheckedChanged(radioGroup,i));
        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> onCheckedChanged(buttonView,isChecked));
    }
    public void onCheckedChanged(CompoundButton c, boolean b) {

        TextView textView = findViewById(R.id.tv_text_dos);
        if(b){
            textView.setText("te gusta el furbohhhh");
        }else {
            textView.setText("tonto");
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Toast.makeText(this,"has picado"+checkedId, Toast.LENGTH_SHORT).show();
        TextView t = (TextView) findViewById(R.id.tv_text_dos);
        if (checkedId== R.id.radioButton){
            t.setText("texto");
        } else if (checkedId== R.id.radioButton2) {
            t.setText("texto2");
        } else if(checkedId==R.id.radioButton3){
            t.setText("texto3");
        }

        /*switch (checkedId){
            case R.id.radioButton:
                t.setText("texto");
                break;
            case R.id.radioButton2:
                t.setText("texto");
                break;
            case R.id.radioButton3:
                t.setText("texto");
                break;
            default:
                t.setText("");
                break;
        }*/

    }


}