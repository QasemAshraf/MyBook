package com.android.mybook.network.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SignIn implements Serializable {

    @SerializedName("email")
    @Expose private String yourEmail;

    @SerializedName("password")
    @Expose private String yourPassword;

    public SignIn(String yourEmail, String yourPassword) {
        this.yourEmail = yourEmail;
        this.yourPassword = yourPassword;
    }

    //setter
    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }
    public void setYourPassword(String yourPassword) {
        this.yourPassword = yourPassword;
    }

    //getter
    public String getYourEmail() {
        return yourEmail;
    }
    public String getYourPassword() {
        return yourPassword;
    }
}
