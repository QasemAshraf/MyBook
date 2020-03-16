package com.android.mybook.allfragments.home.book;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mybook.R;
import com.android.mybook.network.models.Book;

public class BookHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView tvBookName;
    private TextView tvBookAuthor;
    private RatingBar ratingBar;
    private TextView tvCostBook;

    public BookHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    void initView(View view){
        imageView = view.findViewById(R.id.itemBookImageView);
        tvBookName = view.findViewById(R.id.itemBookNameTextView);
        tvBookAuthor = view.findViewById(R.id.itemBookAuthorNameTextView);
        ratingBar = view.findViewById(R.id.itemBookRatingBar);
        tvCostBook = view.findViewById(R.id.itemBookCostTextView);
    }

    void bindView(Book book){
        book.loadImage(imageView);
        tvBookName.setText(book.getBookName());
        tvBookAuthor.setText(book.getAuthorName());
        ratingBar.setRating(book.getRating());
        tvCostBook.setText((int) book.getCost());
    }
}
