package com.alfansyah.android.rv_warung;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridWarunkAdapter extends RecyclerView.Adapter<GridWarunkAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<Warunk> listWarunk;

    private ArrayList<Warunk> getListWarunk(){
        return listWarunk;
    }

    public void setListWarunk(ArrayList<Warunk> listWarunk) {
        this.listWarunk = listWarunk;
    }

    public GridWarunkAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public GridWarunkAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_warunk,parent,false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridWarunkAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListWarunk().get(position).getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListWarunk().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
