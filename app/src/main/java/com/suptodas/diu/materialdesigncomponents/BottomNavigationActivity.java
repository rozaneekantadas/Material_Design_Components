package com.suptodas.diu.materialdesigncomponents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        toolbar = findViewById(R.id.toolbarCustom);

        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.navigationView);

        BadgeDrawable badgeDrawable = navigationView.getOrCreateBadge(R.id.notificationNav);

        badgeDrawable.setNumber(2);
        badgeDrawable.setVisible(true);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                if(item.getItemId() == R.id.favourite){
                    fragment = new FavouriteFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentLayout, fragment);
                    fragmentTransaction.commit();
                }

                if(item.getItemId() == R.id.stared){
                    fragment = new StaredFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentLayout, fragment);
                    fragmentTransaction.commit();
                }

                if(item.getItemId() == R.id.notificationNav){
                    fragment = new NotificationFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentLayout, fragment);
                    fragmentTransaction.commit();
                }

                return true;
            }
        });

    }
}
