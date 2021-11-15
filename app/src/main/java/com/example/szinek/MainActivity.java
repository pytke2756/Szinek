package com.example.szinek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rltvLayout;
    private TextView txtView;
    private Random rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        rltvLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                rltvLayout.setBackgroundColor(Color.rgb(red, green, blue));
                txtView.setText(String.format("%d, %d, %d",red, green, blue));
                if (red < 150 && green < 150 && blue < 150) {
                    txtView.setTextColor(Color.WHITE);
                }else{
                    txtView.setTextColor(Color.BLACK);
                }
            }
        });
    }

    private void init(){
        rltvLayout = findViewById(R.id.rltv_layout);
        txtView = findViewById(R.id.txt_view);
        rnd = new Random();
    }
}