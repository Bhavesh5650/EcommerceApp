package com.example.ecommerceapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.activity.MainActivity;
import com.example.ecommerceapp.databinding.ActivityProductDetailBinding;
import com.example.ecommerceapp.model.ProductModel;

public class ProductDetailActivity extends AppCompatActivity {

    ActivityProductDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int img = getIntent().getIntExtra("image",0);
        String name = getIntent().getStringExtra("pro_name");
        String pro_price = getIntent().getStringExtra("pro_price");
        String feature = getIntent().getStringExtra("feature");

        binding.pdSetImage.setImageResource(img);
        binding.pdSetName.setText(name);
        binding.pdSetPrice.setText(pro_price);
        binding.pdSetDescription.setText(feature);

        binding.pdBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        binding.btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.cartList.add(new ProductModel(img,name,pro_price,feature));
                Toast.makeText(ProductDetailActivity.this, "Cart Added Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}