package com.android.mybook.allfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.mybook.R;
import com.android.mybook.network.api.APIClient;
import com.android.mybook.network.api.APIConstant;
import com.android.mybook.network.models.SignIn;
import com.android.mybook.network.service.SignInInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignInFragment extends Fragment {


    public SignInFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_sign_in, container, false);
       initUISignIn(view);
       return view;
    }



    void initUISignIn(View view){
        EditText email = view.findViewById(R.id.signInEmailEditText);
        EditText password = view.findViewById(R.id.signInPasswordEditText);
        Button logIn = view.findViewById(R.id.signInButton);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn signIn = new SignIn(
                        email.getText().toString(),
                        password.getText().toString()
                );
                sendNetworkRequest(signIn);
            }
        });
    }
    private void sendNetworkRequest(SignIn signIn){

        //Create Retrofit Instance
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(APIConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        //Get SignInInterface & Call Object For The Request
        SignInInterface signInInterface = retrofit.create(SignInInterface.class);
        Call<SignIn> call = signInInterface.logIn(signIn);
        call.enqueue(new Callback<SignIn>() {
            @Override
            public void onResponse(Call<SignIn> call, Response<SignIn> response) {
                Toast.makeText(getActivity(), "ok", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<SignIn> call, Throwable t) {
                Toast.makeText(getActivity(), "fail", Toast.LENGTH_LONG).show();
                Log.v("Error",t.toString());

            }
        });

    }
}
