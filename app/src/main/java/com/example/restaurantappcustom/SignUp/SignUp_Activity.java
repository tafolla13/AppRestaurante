package com.example.restaurantappcustom.SignUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.restaurantappcustom.R;
import com.example.restaurantappcustom.login.LoginFragment;

public class SignUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        Fragment fragment = new SignUp_Fragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame3, fragment);
        fragmentTransaction.commit();
    }
}
