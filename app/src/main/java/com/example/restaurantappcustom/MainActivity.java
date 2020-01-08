package com.example.restaurantappcustom;



import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import androidx.drawerlayout.widget.DrawerLayout;



import android.os.Bundle;



public class MainActivity extends AppCompatActivity {



  @Override

  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_login);





    Toolbar toolbar = findViewById(R.id.toolbar);

    setSupportActionBar(toolbar);



    DrawerLayout drawer = findViewById(R.id.drawer_layout);

    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(

            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);



    drawer.setDrawerListener(toggle);

    toggle.syncState();

  }

}