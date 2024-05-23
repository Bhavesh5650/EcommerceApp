package com.example.ecommerceapp.activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.activity.MainActivity;
import com.example.ecommerceapp.adapter.CartAdapter;
import com.example.ecommerceapp.databinding.ActivityCartBinding;
import com.example.ecommerceapp.model.ProductModel;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    ActivityCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CartAdapter cartAdapter = new CartAdapter(MainActivity.cartList);
        binding.cartRecycleView.setAdapter(cartAdapter);

        binding.cartBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}