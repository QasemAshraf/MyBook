package com.android.mybook.network.service;

import com.android.mybook.network.api.APIConstant;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SliderInterface {

    @GET(APIConstant.SERVICE_SLIDER)
    Call<List<String>> getSlider();

}

