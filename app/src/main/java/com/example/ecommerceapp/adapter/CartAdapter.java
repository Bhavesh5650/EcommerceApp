package com.example.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.databinding.CartSampleBinding;
import com.example.ecommerceapp.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    List<ProductModel> cartList = new ArrayList<>();

    public CartAdapter(List<ProductModel> cartList) {

        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_sample,parent,false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

        holder.cartBinding.cartSetImage.setImageResource(cartList.get(position).image);
        holder.cartBinding.cartSetName.setText(cartList.get(position).pro_name);
        holder.cartBinding.cartSetPrice.setText(cartList.get(position).price);
        holder.cartBinding.cartDeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartList.remove(position);
                notifyDataSetChanged();
            }
        });
        holder.cartBinding.cartAddQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(holder.cartBinding.cartSetQuantity.getText().toString());

                count++;
                holder.cartBinding.cartSetQuantity.setText(String.valueOf(count));
            }
        });
        holder.cartBinding.cartRemoveQuantity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count = Integer.parseInt(holder.cartBinding.cartSetQuantity.getText().toString());

                count--;
                holder.cartBinding.cartSetQuantity.setText(String.valueOf(Integer.parseInt(holder.cartBinding.cartSetQuantity.getText().toString())-1));

                if(count<=0)
                {
                    cartList.remove(position);
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder{

        CartSampleBinding cartBinding;
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            cartBinding = CartSampleBinding.bind(itemView);
        }
    }
}
