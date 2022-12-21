package com.example.android_homework_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_homework_5.databinding.ActivityCommentBinding;

public class Comment extends AppCompatActivity {
    private ActivityCommentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
    }
    private void setupUI(){
        binding.backButton.setOnClickListener(view ->
                finish());
    }
}