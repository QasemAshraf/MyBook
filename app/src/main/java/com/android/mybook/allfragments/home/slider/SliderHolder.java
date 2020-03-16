package com.android.mybook.allfragments.home.slider;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mybook.R;
import com.squareup.picasso.Picasso;

public class SliderHolder extends RecyclerView.ViewHolder {

    private ImageView sliderImageView;

    public SliderHolder(@NonNull View itemView) {
        super(itemView);
        sliderImageView = itemView.findViewById(R.id.slider1ImageView);
    }
    void bindView(String sliderImage){
        Picasso.get()
                .load(sliderImage)
                .placeholder(R.drawable.app_icon)
                .error(R.drawable.app_icon)
                .into(sliderImageView);
    }

}
