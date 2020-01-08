package com.example.restaurantappcustom.SignUp;


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

import com.example.restaurantappcustom.LoginBD.Usuario;
import com.example.restaurantappcustom.LoginBD.daoUsuario;
import com.example.restaurantappcustom.R;
import com.example.restaurantappcustom.SignIn.Sign_In_Activity;

public class SignUp_Fragment extends Fragment implements View.OnClickListener {
TextView singin;
EditText us, pas, nom;
Button reg;
daoUsuario dao;

    public SignUp_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_signup, container, false);
        us=(EditText)rootView.findViewById(R.id.edtemail);
        pas=(EditText)rootView.findViewById(R.id.edtpass);
        nom=(EditText)rootView.findViewById(R.id.edtnom);
        reg=(Button)rootView.findViewById(R.id.crearcuenta);
        singin=(TextView)rootView.findViewById(R.id.txttengocuenta);

        reg.setOnClickListener(this);
        singin.setOnClickListener(this);
        dao=new daoUsuario (getActivity());
        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.crearcuenta:
                Usuario u=new Usuario();
                u.setUsuario(us.getText().toString());
                u.setPassword(pas.getText().toString());
                u.setNombre(nom.getText().toString());
                if(!u.isNull()){
                    Toast.makeText(getActivity(),"Hay campos vacios",Toast.LENGTH_LONG).show();
                }else if(dao.insertUsuario(u)){
                    Toast.makeText(getActivity(),"Registro exitoso!", Toast.LENGTH_LONG).show();
                    Intent i2=new Intent(view.getContext(), Sign_In_Activity.class);
                    startActivity(i2);
                   getActivity().finish();
                }else{
                    Toast.makeText(getActivity(),"Usuario ya registrado", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.txttengocuenta:
                Intent i=new Intent(view.getContext(), Sign_In_Activity.class);
                startActivity(i);
                getActivity().finish();
                break;
        }
    }

}
