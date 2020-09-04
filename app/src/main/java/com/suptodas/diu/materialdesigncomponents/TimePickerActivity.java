package com.suptodas.diu.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity {

    TextView selectedTime;
    int hour, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        selectedTime = findViewById(R.id.selectedTime);

        selectedTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(TimePickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        hour = i;
                        min = i1;

                        Calendar calendar = Calendar.getInstance();

                        calendar.set(0,0,0,hour,min);

                        selectedTime.setText(DateFormat.format("hh:mm aa", calendar));
                    }
                },12,0,false
                );

                timePickerDialog.updateTime(hour, min);
                timePickerDialog.show();
            }
        });

    }
}
