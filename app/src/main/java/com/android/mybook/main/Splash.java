package com.android.mybook.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.android.mybook.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(this::navigate,3000);
    }

    void navigate(){
        startActivity(new Intent(this, MainActivity.class));
    }
//    void setGoToSignUp(View view){
//    Button goToSignUp = view.findViewById(R.id.signInSignUpButton);
//    goToSignUp.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//        }
//    });
//   }
}
