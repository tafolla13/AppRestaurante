package com.example.restaurantappcustom.Inicio.ui.main_dishes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.restaurantappcustom.R;

public class MainDishesFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_dishes, container, false);

        return root;
    }
}