package com.example.routines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class eng_vie extends AppCompatActivity {
    Button home, tra,xoa;
    ImageView hinhanh;
    TextView phatam, vni;
    EditText input;
    public static ArrayList<String> arrayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_vie);
        Anhxa();
        String [] mangENG = getResources().getStringArray(R.array.list_en);

        String [] mangVNI = getResources().getStringArray(R.array.list_vie);

        String [] mangIMG = getResources().getStringArray(R.array.list_img);
        String [] mangAm = getResources().getStringArray(R.array.list_AM);
        arrayImg = new ArrayList<>(Arrays.asList(mangIMG));
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });
        tra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i= 0; i< mangENG.length; i++){
                    if(input.getText().toString().equals(mangENG[i])){
                        phatam.setText(mangAm[i]);
                        vni.setText(mangVNI[i]);
                        int idHinh = getResources().getIdentifier(eng_vie.arrayImg.get(i), "drawable", getPackageName());
                        hinhanh.setImageResource(idHinh);
                        break;

                    }
                }
            }
        });

    }
    public void Anhxa(){
        xoa = (Button)findViewById(R.id.xoa) ;
        home = (Button) findViewById(R.id.home);
        tra = (Button) findViewById(R.id.tra);
        phatam= (TextView) findViewById(R.id.phatam);
        vni = (TextView) findViewById(R.id.vni);
        hinhanh= (ImageView) findViewById(R.id.imageView);
        input= (EditText) findViewById(R.id.input);
    }
}