package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        toolbar = findViewById(R.id.toolbarId);

        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tabLayoutId);

        TabLayout.Tab notification = tabLayout.getTabAt(2);
        BadgeDrawable badgeDrawable = notification.getOrCreateBadge();
        badgeDrawable.setNumber(12);

        TabLayout.Tab chat = tabLayout.getTabAt(0);

        BadgeDrawable chatBardge = chat.getOrCreateBadge();
        chatBardge.setNumber(3);

    }
}
