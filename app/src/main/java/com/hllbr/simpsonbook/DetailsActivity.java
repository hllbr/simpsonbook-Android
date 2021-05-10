package com.hllbr.simpsonbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView nameText,jobText,ageText;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        nameText = findViewById(R.id.nameText);
        jobText = findViewById(R.id.jobText);
        ageText = findViewById(R.id.ageText);
        imageView = findViewById(R.id.imageView);
        /*
        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bart);
        imageView.setImageBitmap(bitmap);

         */
        Intent intent = getIntent();
        Simpson selectedsimpson =(Simpson) intent.getSerializableExtra("selectedSimpson");
        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedsimpson.getPictureId());
        imageView.setImageBitmap(bitmap);

        nameText.setText(selectedsimpson.getName());
        jobText.setText(selectedsimpson.getJob());
        ageText.setText(selectedsimpson.getAge());

    }
}