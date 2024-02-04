package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel>list = new ArrayList<>();

        list.add(new MainModel(R.drawable.pizza,"Pizza","150","Very fresh food veg"));
        list.add(new MainModel(R.drawable.butter_garlic_naan,"Butter Garlic Naan","250","It’s made with flour, yeast, salt, sugar, and yogurt. Once the dough has been baked in a hot tandoor oven, the golden naan is taken out and brushed with butter or ghee, then topped with minced garlic."));
        list.add(new MainModel(R.drawable.chhole_bhature,"Chhole Bhature","200","At its core, chole bhature is a combination of two dishes: chole - a spicy chickpea curry, and bhature - a type of fried bread made with maida flour."));
        list.add(new MainModel(R.drawable.masala_dosa,"Masala dosa","50","A traditional southern Indian dish known as masala dosa is popular throughout the country, made from a batter of soaked rice and lentils that is baked into a thin pancake and usually stuffed with potatoes, onions, and mustard seeds. The dish is often garnished with grated coconut and chopped coriander."));
        list.add(new MainModel(R.drawable.dal_tadka,"Dal Tadka","350","Dal tadka or tadkewali dal is a traditional lentil-based dish originating from the northern parts of India. Although there are variations, the dish is usually prepared with toor dal (split yellow pigeon peas), garlic, ginger, onions, tomatoes, garam masala, chili peppers, ghee, cumin, coriander, turmeric, red chili powder, and fenugreek leaves."));
        list.add(new MainModel(R.drawable.pizza,"Pizza","150","Very fresh food veg"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }
}