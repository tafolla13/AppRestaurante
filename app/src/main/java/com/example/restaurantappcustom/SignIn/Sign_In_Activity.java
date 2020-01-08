package com.example.restaurantappcustom.SignIn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.restaurantappcustom.R;
import android.os.Bundle;

public class Sign_In_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);


        Fragment fragment = new Sign_in_Fragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame2, fragment);
        fragmentTransaction.commit();
    }
}
