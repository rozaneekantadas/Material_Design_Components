package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.chip.ChipGroup;

public class ChipsActivity extends AppCompatActivity {

    ChipGroup chipGroup, chipGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips);

        chipGroup = findViewById(R.id.chipGroup1);
        chipGroup2 = findViewById(R.id.chipGroupId);

        chipGroup2.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                group.check(checkedId);
            }
        });
    }
}
