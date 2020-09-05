package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class SnackbarsActivity extends AppCompatActivity {

    Button snackBars;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbars);

        snackBars = findViewById(R.id.snackbarShow);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);

        snackBars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(coordinatorLayout, "This is a SnackBar", Snackbar.LENGTH_LONG);
                snackbar.setAction("Okay", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                snackbar.show();

            }
        });
    }
}
