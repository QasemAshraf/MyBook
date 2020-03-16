package com.android.mybook.network.service;

import com.android.mybook.network.api.APIConstant;
import com.android.mybook.network.models.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BooksInterface {

    @GET(APIConstant.SERVICE_BOOKS)
    Call<List<Book>> getBooks();
}
