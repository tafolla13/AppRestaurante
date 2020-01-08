package com.example.restaurantappcustom.login;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.restaurantappcustom.LoginBD.daoUsuario;
import com.example.restaurantappcustom.R;
import com.example.restaurantappcustom.SignIn.Sign_In_Activity;
import com.example.restaurantappcustom.SignUp.SignUp_Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
Button signup, login;
daoUsuario dao;
    public LoginFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        dao=new daoUsuario(getActivity());
        Login(rootView);
        SignUp(rootView);
        return rootView;
    }

    public void Login(View view){
        login=view.findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i=new Intent(view.getContext(), Sign_In_Activity.class);
               startActivity(i);
            }
        });
    }

    public void SignUp(View view){
        signup=view.findViewById(R.id.signup_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(view.getContext(), SignUp_Activity.class);
                startActivity(i);
            }
        });
    }

}
