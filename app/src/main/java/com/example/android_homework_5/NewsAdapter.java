package com.example.android_homework_5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android_homework_5.databinding.ActivityListItemBinding;

public class NewsAdapter extends ArrayAdapter<News_data> {
    private final News_data[] data;

    public NewsAdapter(@NonNull Context context, News_data[] data) {
        super(context, R.layout.activity_list_item);
        this.data = data;
    }

    public int getCount() {
        return data.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News_data news = data[position];
        @SuppressLint("ViewHolder") ActivityListItemBinding binding = ActivityListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        binding.postText.setText(news.getText());
        binding.countLikes.setText(String.valueOf(news.getLikes()));
        binding.countComments.setText(String.valueOf(news.getComments()));
        binding.countReposts.setText(String.valueOf(news.getReposts()));
        binding.postPhoto.setImageResource(news.getImageResourceId());
        binding.like.setImageResource(news.isLiked() ? R.drawable.good_like_icon : R.drawable.like_icon);

        binding.like.setOnClickListener(view ->{
            news.like();
            notifyDataSetInvalidated();
        });
        binding.comment.setOnClickListener(view -> {
            getContext().startActivity(new Intent(getContext(), Comment.class));
        });
        binding.repost.setOnClickListener(view -> {
            Toast.makeText(getContext(), "Reposted ;)", Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}
