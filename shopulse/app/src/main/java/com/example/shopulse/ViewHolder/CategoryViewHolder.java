package com.example.shopulse.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopulse.Interface.ItemClickListener;
import com.example.shopulse.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener

{
    public TextView t1;
    public ImageView i1;
    private ItemClickListener itemClickListener;

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);

        t1 = (TextView)itemView.findViewById(R.id.name);
        i1 = (ImageView)itemView.findViewById(R.id.image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }


    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }
}
