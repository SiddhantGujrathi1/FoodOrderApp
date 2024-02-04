package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.OrdersAdapter;
import com.example.foodorderapp.Models.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.chhole_bhature,"Chhole Bhature","12FF234","2300"));
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","12GAH4","1300"));
        list.add(new OrdersModel(R.drawable.butter_garlic_naan,"Butter Garlic Naan","12FAGB12","400"));
        list.add(new OrdersModel(R.drawable.chhole_bhature,"Chhole Bhature","12FF234","2300"));
        list.add(new OrdersModel(R.drawable.chhole_bhature,"Chhole Bhature","12FF234","2300"));

        OrdersAdapter ordersAdapter = new OrdersAdapter(list,getApplicationContext());
        binding.orderRecyclerView.setAdapter(ordersAdapter);

        binding.orderRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}