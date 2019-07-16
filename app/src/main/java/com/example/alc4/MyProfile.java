package com.example.alc4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyProfile extends AppCompatActivity {
    public static Button MyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView ( R.layout.activity_my_profile );
    }
    public void startAboutALC(View view) {
        Intent MyProfile = new Intent (this, MyProfile.class);
        startActivity (MyProfile);
    }
}
