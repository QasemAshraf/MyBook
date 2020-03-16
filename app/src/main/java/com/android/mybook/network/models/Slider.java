package com.android.mybook.network.models;
import android.widget.ImageView;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Slider implements Serializable {

    @SerializedName("image1")
    @Expose
    private ImageView sliderImg1;


    public Slider(ImageView sliderImg1) {
        this.sliderImg1 = sliderImg1;

    }

    //Getter
    public ImageView getSliderImg1() {
        return sliderImg1;
    }


    //Setter

    public void setSliderImg1(ImageView sliderImg1) {
        this.sliderImg1 = sliderImg1;
    }

////    public void loadImage(ImageView imageView){
////        Picasso.get()
////                .load(getSliderImg1(),getSliderImg2(),getSliderImg3(),getSliderImg4())
////                .placeholder(R.drawable.app_icon)
////                .error(R.drawable.app_icon)
////                .into(imageView);
//    }
}
