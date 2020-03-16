package com.android.mybook.network.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class SignUp implements Serializable {

    @SerializedName("your name")
    @Expose private String yourName;

    @SerializedName("mobile")
    @Expose private String yourPhone;

    @SerializedName("your email")
    @Expose private String yourEmail;

    @SerializedName("your address")
    @Expose private String yourAddress;

    @SerializedName("your password")
    @Expose private String yourPassword;

    public SignUp(String yourName, String yourPhone, String yourEmail, String yourAddress, String yourPassword) {
        this.yourName = yourName;
        this.yourPhone = yourPhone;
        this.yourEmail = yourEmail;
        this.yourAddress = yourAddress;
        this.yourPassword = yourPassword;
    }

    //Setter
    public void setYourName(String yourName) {
        this.yourName = yourName;
    }
    public void setYourPhone(String yourPhone) {
        this.yourPhone = yourPhone;
    }
    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }
    public void setYourAddress(String yourAddress) {
        this.yourAddress = yourAddress;
    }
    public void setYourPassword(String yourPassword) {
        this.yourPassword = yourPassword;
    }

    //Getter
    public String getYourName() {
        return yourName;
    }
    public String getYourPhone() {
        return yourPhone;
    }
    public String getYourEmail() {
        return yourEmail;
    }
    public String getYourAddress() {
        return yourAddress;
    }
    public String getYourPassword() {
        return yourPassword;
    }
}
