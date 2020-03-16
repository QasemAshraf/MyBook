package com.android.mybook.allfragments.home.book;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mybook.R;
import com.android.mybook.allfragments.home.BookItemClick;
import com.android.mybook.network.models.Book;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {

    private List<Book> books;

    public BookAdapter(List<Book> books) {
        this.books = books;

    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_books,parent,false);
        return new BookHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, final int position) {
        Book book = books.get(position);
        holder.bindView(book);
    }



    @Override
    public int getItemCount() {
        return books.size();
    }
}
