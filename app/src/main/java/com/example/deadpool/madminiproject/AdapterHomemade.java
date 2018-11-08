package com.example.deadpool.madminiproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

public class AdapterHomemade extends RecyclerView.Adapter<AdapterHomemade.MyViewHolder>{

    Context context;
    ArrayList<ModelHomemade> modelHomemadeArrayList = new ArrayList<>();
    RequestManager glide;

    public AdapterHomemade(Context context, ArrayList<ModelHomemade> modelHomemadeArrayList) {
        this.context = context;
        this.modelHomemadeArrayList = modelHomemadeArrayList;
        glide = Glide.with(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_homemade, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        final ModelHomemade modelHomemade = modelHomemadeArrayList.get(i);
        myViewHolder.textView.setText(modelHomemade.getMname());
        myViewHolder.textView2.setText(modelHomemade.getDzo_mname());

        glide.load(modelHomemade.getPicture()).into(myViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return modelHomemadeArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView, textView2;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_mush);
            textView = (TextView) itemView.findViewById(R.id.tv_eng);
            textView2 = (TextView) itemView.findViewById(R.id.tv_eng);
        }
    }
}
