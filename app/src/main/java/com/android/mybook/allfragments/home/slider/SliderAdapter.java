package com.android.mybook.allfragments.home.slider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mybook.R;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderHolder> {
    private List<String> listSliderImg;

    public SliderAdapter(List<String> listSliderImg) {
        this.listSliderImg = listSliderImg;
    }

    @NonNull
    @Override
    public SliderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slider, parent, false);
        return new SliderHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderHolder holder, int position) {
        String sliderImage = listSliderImg.get(position);
        holder.bindView(sliderImage);

    }

    @Override
    public int getItemCount() {
        return listSliderImg.size();
    }
}
