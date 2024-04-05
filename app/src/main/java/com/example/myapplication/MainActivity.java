package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumElements;
    private Button buttonGenerateVector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumElements = findViewById(R.id.editTextNumElements);
        buttonGenerateVector = findViewById(R.id.buttonGenerateVector);

        buttonGenerateVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numElements = Integer.parseInt(editTextNumElements.getText().toString());
                Intent intent = new Intent(MainActivity.this, VectorSumActivity.class);
                intent.putExtra("numElements", numElements);
                startActivity(intent);
            }
        });
    }
}
