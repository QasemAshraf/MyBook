package com.android.mybook.allfragments.home.book;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.mybook.R;
import com.android.mybook.network.api.APIClient;
import com.android.mybook.network.models.Book;
import com.android.mybook.network.service.BooksInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BooksFragment extends Fragment {

    private RecyclerView recyclerViewBook;

    public BooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_books, container, false);
        initUi(view);
        return view;
    }

    void initUi(View view){
        recyclerViewBook = view.findViewById(R.id.book_recyclerView);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBooks();
    }

    void getBooks(){
        BooksInterface booksInterface = APIClient.getClient().create(BooksInterface.class);
        booksInterface.getBooks().enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                if (response.isSuccessful()){
                    List<Book> list = response.body();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),
                            LinearLayoutManager.VERTICAL, false );
                    recyclerViewBook.setLayoutManager(linearLayoutManager);
                    BookAdapter bookAdapter = new BookAdapter(list);
                    recyclerViewBook.setAdapter(bookAdapter);
                }else Toast.makeText(getActivity(),"Fail", Toast.LENGTH_SHORT).show();

            }

            @Override

            public void onFailure(Call<List<Book>> call, Throwable t) {
                Toast.makeText(getActivity(), "onFailure" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.v("Error",t.toString());
            }
        });
    }
}
