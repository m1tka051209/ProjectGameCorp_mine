package com.example.projectgamecorp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectgamecorp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btnStartJoke = binding.btnStartJoke;
        Button btnStart = binding.btnStart;
        Button btnOk = binding.btnOk;


        btnStart.setEnabled(false);
        btnStartJoke.setEnabled(false);

        btnStart.setBackgroundColor(Color.parseColor("#BBBBBB"));
        btnStartJoke.setBackgroundColor(Color.parseColor("#BBBBBB"));


        btnOk.setOnClickListener(v -> {
            String currentUsername = binding.username.getText().toString();

            if (currentUsername.trim().isEmpty()) {
                Toast.makeText(MainActivity.this, "Не надо хитрить, введите имя!", Toast.LENGTH_SHORT).show();
                count++;
            } else {

                btnStart.setEnabled(true);
                btnStartJoke.setEnabled(true);
                btnStart.setBackgroundColor(Color.parseColor("#009688"));
                btnStartJoke.setBackgroundColor(Color.parseColor("#009688"));
            }
        });

        btnStartJoke.setOnClickListener(v -> {
            String username = binding.username.getText().toString();
            Toast.makeText(MainActivity.this, username + ", подумайте хорошенько...", Toast.LENGTH_SHORT).show();
            count++;

        });

        btnStart.setOnClickListener(v -> {
            String username = binding.username.getText().toString();
            Intent intent = new Intent(MainActivity.this, Story1.class);
            intent.putExtra("username", username);

            if (count == 0) {
                Toast.makeText(MainActivity.this, "Супер, переходим...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Ну вот и ладненько, договорились!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}