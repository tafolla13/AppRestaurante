package com.example.restaurantappcustom.SignIn;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.restaurantappcustom.Inicio.ActivityMenu;
import com.example.restaurantappcustom.LoginBD.Usuario;
import com.example.restaurantappcustom.LoginBD.daoUsuario;
import com.example.restaurantappcustom.R;
import com.example.restaurantappcustom.SignUp.SignUp_Activity;

public class Sign_in_Fragment extends Fragment implements View.OnClickListener {
TextView signup;
EditText user, pass;
Button btnEntrar;
daoUsuario dao;

    public Sign_in_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_sign_in, container, false);
        user=(EditText)rootView.findViewById(R.id.email);
        pass=(EditText)rootView.findViewById(R.id.pass);
        btnEntrar=(Button)rootView.findViewById(R.id.btnEnt);
        signup=(TextView)rootView.findViewById(R.id.txtRegistrar);

        btnEntrar.setOnClickListener(this);
        signup.setOnClickListener(this);
        dao=new daoUsuario(getActivity());
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEnt:
                String u=user.getText().toString();
                String p=pass.getText().toString();
                if(u.equals("")&&p.equals("")){
                    Toast.makeText(getActivity(),"Error! Hay campos vacios", Toast.LENGTH_LONG).show();
                }else if(dao.login(u,p)==1){
                    Usuario ux=dao.getUsuario(u,p);
                    Toast.makeText(getActivity(),"Datos correctos", Toast.LENGTH_LONG).show();
                    Intent i2=new Intent(v.getContext(), ActivityMenu.class);
                   i2.putExtra("Id", ux.getId());
                   startActivity(i2);
                }else{
                    Toast.makeText(getActivity(),"Email or Password Incorrectos", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.txtRegistrar:
                Intent i=new Intent(v.getContext(), SignUp_Activity.class);
                startActivity(i);
                break;

        }
    }
}