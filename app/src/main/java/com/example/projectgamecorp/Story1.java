//package com.example.projectgamecorp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import com.example.projectgamecorp.databinding.ActivityStory1Binding;
//
//public class Story1 extends AppCompatActivity {
//
//    public ActivityStory1Binding binding;
//    public static final int REQUEST_CODE = 1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        binding = ActivityStory1Binding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        Intent intent = getIntent();
//        String username = intent.getStringExtra("username");
//
//        binding.text.setText(username);
//    }
//}


package com.example.projectgamecorp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projectgamecorp.databinding.ActivityStory1Binding;

public class Story1 extends AppCompatActivity {

    public ActivityStory1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityStory1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        binding.text.setText("Привет, " + username + "!");

    }
}