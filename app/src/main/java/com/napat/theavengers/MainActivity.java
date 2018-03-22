package com.napat.theavengers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
        Button  button;

        Random  r;

        Integer[] image = {
        R.drawable.im_1,
        R.drawable.im_2,
        R.drawable.im_3,
        R.drawable.im_4,
        R.drawable.im_5,
        R.drawable.im_6,
        R.drawable.im_7,
        R.drawable.im_8,
        R.drawable.im_9,
        R.drawable.im_10,
        R.drawable.im_11,
        R.drawable.im_12,
        R.drawable.im_13

        };

        int pickedImage = 0 , lastPicked= 0;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.button);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

        do{
        pickedImage = r.nextInt(image.length);
        }while(pickedImage == lastPicked);

        lastPicked = pickedImage;

        imageView.setImageResource(image[r.nextInt(image.length)]);


        }
        });
        }
        }
