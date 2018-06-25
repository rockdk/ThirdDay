package com.champ.web.thirdday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        //to setup user interface
         editText = findViewById(R.id.Edittext2);
         checkBox = findViewById(R.id.checkbox);
        //event handling for checkbox
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked==true) {
                    editText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

            }
        });


    }
}
