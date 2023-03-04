package com.example.mad_labactivity_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Tv;
    MaterialButton btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tv = findViewById(R.id.text_view);

        assignId(btn1, R.id.btn_cat);
        assignId(btn2, R.id.bt_dog);
        assignId(btn3, R.id.btn_horse);
        assignId(btn4, R.id.btn_fish);



    }
    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();
        Tv.setText(buttonText);

    }
}