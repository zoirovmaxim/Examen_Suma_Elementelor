package com.example.myapplication;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class VectorSumActivity extends AppCompatActivity {

    private TextView textViewVectorSum;
    private Button buttonBackToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_sum);

        textViewVectorSum = findViewById(R.id.textViewVectorSum);
        buttonBackToMain = findViewById(R.id.buttonBackToMain);

        Intent intent = getIntent();
        int numElements = intent.getIntExtra("numElements", 0);

        Random random = new Random();
        int[] vector = new int[numElements];
        int sum = 0;
        StringBuilder vectorString = new StringBuilder("Vector: ");

        for (int i = 0; i < numElements; i++) {
            vector[i] = random.nextInt(100);
            vectorString.append(vector[i]).append(" ");
            sum += vector[i];
        }

        textViewVectorSum.setText(vectorString.toString() + "\nSuma: " + sum);

        buttonBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
