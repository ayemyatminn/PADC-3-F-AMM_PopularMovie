package com.padcmyanmar.movieshelf.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.movieshelf.R;
import com.padcmyanmar.movieshelf.viewholder.ItemMoviesViewHolder;

/**
 * Created by PC on 12/8/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter {
    public MovieAdapter(){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View moviewItemView=inflater.inflate(R.layout.movie_item,parent,false);

        ItemMoviesViewHolder itemMoviesViewHolder=new ItemMoviesViewHolder(moviewItemView);

        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
