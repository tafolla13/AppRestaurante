package com.example.restaurantappcustom.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.restaurantappcustom.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Login");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Fragment fragment = new LoginFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.commit();


    }
}
