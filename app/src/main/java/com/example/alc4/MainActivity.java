package com.example.alc4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import static com.example.alc4.R.id.button3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button aboutALC = findViewById ( R.id.button3 );
        Button myProfile = findViewById ( R.id.button4 );

        aboutALC.setOnClickListener ( new OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                onAboutALCClicked();
            }
        });

        myProfile.setOnClickListener ( new OnClickListener ( ) {

            @Override
            public void onClick(View view) {
                onMyProfileClicked();
            }
        });
    }

    private void onMyProfileClicked() {
        Intent intent = new Intent (this, MyProfile.class);
        startActivity ( intent );
    }

    private void onAboutALCClicked() {
        Intent intent = new Intent ( this, AboutALC.class);
        startActivity ( intent );


    }


    public void loadwebView ( View view ) {
    }
}
