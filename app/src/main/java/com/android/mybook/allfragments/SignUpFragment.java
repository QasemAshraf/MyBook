package com.android.mybook.allfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.mybook.R;
import com.android.mybook.network.models.SignUp;
import com.android.mybook.network.service.SignUpInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUpFragment extends Fragment {


    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up,container,false);
//        initUISignUp(view);
        return view;


    }

//     public void initUISignUp(View view){
//        EditText name = view.findViewById(R.id.singUpName);
//        EditText phone = view.findViewById(R.id.singUpPhone);
//        EditText email = view.findViewById(R.id.singUp_Email);
//        EditText address = view.findViewById(R.id.singUp_Address);
//        EditText password = view.findViewById(R.id.singUp_Password);
//        Button createAccount = view.findViewById(R.id.singUpCreateAccountButton);
//
//        createAccount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SignUp signUp = new SignUp(
//                        name.getText().toString(),
//                        phone.getText().toString(),
//                        email.getText().toString(),
//                        address.getText().toString(),
//                        password.getText().toString()
//                );
//                sendNetworkRequest(signUp);
//            }
//        });
//    }
//
//     private void sendNetworkRequest(SignUp signUp){
//        //Create Retrofit Instance
//        Retrofit.Builder builder = new Retrofit.Builder()
//                .baseUrl("https://node-book-store.herokuapp.com/api/users/register")
//                .addConverterFactory(GsonConverterFactory.create());
//        Retrofit retrofit = builder.build();
//        //get SignUpInterface & Call Object for the request
//        SignUpInterface signUpInterface = retrofit.create(SignUpInterface.class);
//        Call<SignUp> call = signUpInterface.createAccount(signUp);
//        call.enqueue(new Callback<SignUp>() {
//            @Override
//            public void onResponse(Call<SignUp> call, Response<SignUp> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<SignUp> call, Throwable t) {
//
//            }
//        });
//
//    }
}
