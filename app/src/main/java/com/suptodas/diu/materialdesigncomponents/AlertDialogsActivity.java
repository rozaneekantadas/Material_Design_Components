package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class AlertDialogsActivity extends AppCompatActivity {

    Button buttonAlert;
    Button buttonAlert2;
    Button buttonAlert3;
    CharSequence[] mItemList, mItemList2;
    boolean[] mSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialogs);

        mItemList = new CharSequence[]{
                "Movies",
                "Songs",
                "Cartoon",
                "All"
        };

        mItemList2 = new CharSequence[]{
                "Movies",
                "Songs",
                "Cartoon",
        };

        mSelectedItem = new boolean[]{
                false,
                true,
                true
        };

        buttonAlert = findViewById(R.id.button1);
        buttonAlert2 = findViewById(R.id.button2);
        buttonAlert3 =  findViewById(R.id.button3);

        buttonAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(AlertDialogsActivity.this);
                builder.setBackground(getDrawable(R.drawable.dialog_bg));
                builder.setIcon(getDrawable(R.drawable.icon_dialog));
                builder.setTitle("Alert Dialog");
                builder.setMessage("This is alert Dialog");
                builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.show();
            }
        });

        buttonAlert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(AlertDialogsActivity.this);
                builder.setBackground(getDrawable(R.drawable.dialog_bg));
                builder.setTitle("View Option");
                builder.setSingleChoiceItems(mItemList, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Snackbar.make(buttonAlert2, "You are selected: "+mItemList[i], Snackbar.LENGTH_LONG).show();
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });

        buttonAlert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(AlertDialogsActivity.this);
                builder.setBackground(getDrawable(R.drawable.dialog_bg));
                builder.setTitle("View Option");
                builder.setMultiChoiceItems(mItemList2, mSelectedItem, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                    }
                });

                builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton("Dismass", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.show();
            }
        });
    }
}
