package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.foodorderapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityDetailBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            int image = getIntent().getIntExtra("image",0);
            int price = getIntent().getIntExtra("price",0);
            String name = getIntent().getStringExtra("name");
            String desc = getIntent().getStringExtra("desc");


            binding.detailImage.setImageResource(image);
            binding.detailItemName.setText(name);
            binding.detailPrice.setText(String.format("%d",price));
            binding.detailDescription.setText(desc);


    }
}