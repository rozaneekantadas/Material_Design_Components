package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button alertDialog, fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertDialog = findViewById(R.id.alertDialog);
        fabButton = findViewById(R.id.fabButton);

        alertDialog.setOnClickListener(this);
        fabButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.alertDialog){
            Intent intent = new Intent(MainActivity.this, AlertDialogsActivity.class);
            startActivity(intent);
        }

        if (view.getId() == R.id.fabButton){
            Intent intent = new Intent(MainActivity.this, FloatingActionButtoonActivity.class);
            startActivity(intent);
        }


    }
}
