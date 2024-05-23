package com.example.ecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.ProductInterface;
import com.example.ecommerceapp.R;
import com.example.ecommerceapp.databinding.ActivityMainBinding;
import com.example.ecommerceapp.databinding.ProductShowSampleBinding;
import com.example.ecommerceapp.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    List<ProductModel> productModelList = new ArrayList<>();
    Context context;
    ProductInterface productInterface;

    public ProductAdapter(Context context,List<ProductModel> productModelList,ProductInterface productInterface) {

        this.productModelList = productModelList;
        this.productInterface = productInterface;
        this.context = context;
    }
    public void searching(List<ProductModel> filterList)
    {
        productModelList = filterList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_show_sample,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.binding.productImgSet.setImageResource(productModelList.get(position).image);
        holder.binding.productNameSet.setText(productModelList.get(position).pro_name);
        holder.binding.productPriceSet.setText(productModelList.get(position).price);

        holder.binding.sampleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productInterface.OnClick(productModelList.get(position),position);
            }
        });

    }

    @Override
    public int getItemCount() {

        return productModelList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        ProductShowSampleBinding binding;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ProductShowSampleBinding.bind(itemView);
        }
    }
}
