package com.android.mybook.network.service;

import com.android.mybook.network.api.APIConstant;
import com.android.mybook.network.models.SignIn;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface SignInInterface {

//    @GET(APIConstant.SERVICE_LOGIN)
//    Call<SignIn> getLogIn();

    @GET(APIConstant.SERVICE_LOGIN)
    Call<SignIn> logIn (@Body SignIn signIn);
}
