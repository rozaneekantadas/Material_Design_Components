package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

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

    }
}
