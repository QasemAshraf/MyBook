package com.android.mybook.network.models;

import android.widget.ImageView;

import com.android.mybook.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class Book implements Serializable {

    @SerializedName("image")
    @Expose
    private String imgBook;
    @SerializedName("bookName")
    @Expose
    private String bookName;
    @SerializedName("author")
    @Expose
    private String authorName;
    @SerializedName("rating")
    @Expose
    private float rating;
    @SerializedName("cost")
    @Expose
    private float cost;

    public Book(String imgBook, String bookName, String authorName, float rating, float cost){
        this.imgBook = imgBook;
        this.bookName = bookName;
        this.authorName = authorName;
        this.rating = rating;
        this.cost =cost;
    }

    //Setter

    public void setImgBook(String imgBook) {
        this.imgBook = imgBook;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    //Getter

    public String getImgBook() {
        return imgBook;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public float getRating() {
        return rating;
    }
    public float getCost() {
        return cost;
    }

    public void loadImage(ImageView imageView){
        Picasso.get()
                .load(getImgBook())
                .placeholder(R.drawable.img_logo)
                .error(R.drawable.img_logo)
                .into(imageView);
    }

}
