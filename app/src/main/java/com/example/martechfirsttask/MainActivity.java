package com.example.martechfirsttask;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvHelloMessage;
    Button btnChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final Button btnStartWork = findViewById(R.id.btnStartWork);
        final Button btnChangeColor = findViewById(R.id.btnChangeColor);
        tvHelloMessage = findViewById(R.id.tvHelloMessage);

        btnStartWork.setOnClickListener(v -> tvHelloMessage.setText("Work Started"));

        btnChangeColor.setOnClickListener(v -> tvHelloMessage.setTextColor(Color.RED));

    }
}