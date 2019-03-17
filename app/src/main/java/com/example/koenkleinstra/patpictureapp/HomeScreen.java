package com.example.koenkleinstra.patpictureapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final TextView txt;
        final Button btn;
        final TextView txt2;
        final ImageView image;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        txt=(TextView) findViewById(R.id.textView1);
        txt2=(TextView) findViewById(R.id.textView2);
        btn=(Button) findViewById(R.id.button1);
        image=(ImageView) findViewById(R.id.imageView1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt.setText("This is my cool profile picture!");
               txt2.setText("Become my friend on instagram @icomefromspace");
               image.setVisibility(View.VISIBLE);
            }
        });

    }



}
