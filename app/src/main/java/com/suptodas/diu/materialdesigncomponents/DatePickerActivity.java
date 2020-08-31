package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class DatePickerActivity extends AppCompatActivity {

    Button mDatePicker;
    TextView selectedDateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        mDatePicker = findViewById(R.id.datepickerid);
        selectedDateText = findViewById(R.id.selectedDate);

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("SELECT A DATE");

        final MaterialDatePicker materialDatePicker = builder.build();


        mDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");
            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {

                selectedDateText.setText("Selected Date: " + materialDatePicker.getHeaderText());
            }
        });
    }
}
