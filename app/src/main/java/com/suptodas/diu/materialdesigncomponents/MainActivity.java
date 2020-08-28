package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertDialog = findViewById(R.id.alertDialog);

        alertDialog.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.alertDialog){
            Intent intent = new Intent(MainActivity.this, AlertDialogsActivity.class);
            startActivity(intent);
        }

    }
}
