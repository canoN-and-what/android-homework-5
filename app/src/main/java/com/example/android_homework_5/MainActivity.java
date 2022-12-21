package com.example.android_homework_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_homework_5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final News_data[] data = new News_data[7];
    private ActivityMainBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
        initData();
    }
    private void setupUI(){
        binding.list.setAdapter(new NewsAdapter(this, data));
    }
    private void initData(){
        String[] stringArray = getResources().getStringArray(R.array.post_texts);
        data[0] = new News_data(stringArray[0], 19, 21, 1, R.drawable.post_1);
        data[1] = new News_data(stringArray[1], 6, 23, 3, R.drawable.post_2);
        data[2] = new News_data(stringArray[2], 210, 9, 5, R.drawable.post_3);
        data[3] = new News_data(stringArray[3], 10, 44, 8, R.drawable.post_4);
        data[4] = new News_data(stringArray[4], 57, 1, 11, R.drawable.post_5);
        data[5] = new News_data(stringArray[5], 103, 19, 18, R.drawable.post_6);
        data[6] = new News_data(stringArray[6], 621, 32, 21, R.drawable.post_7);
    }
}