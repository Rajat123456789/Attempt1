package com.example.attempt1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt1.adapter.NoteAdapter;
import com.example.attempt1.adapter.ReminderItemAdapter;

public class AddReminder extends AppCompatActivity implements Serializable,DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    ReminderItemAdapter reminderItemAdapter = new ReminderItemAdapter();

    AppCompatButton doneAddReminder;
    AppCompatButton datePicker;
    AppCompatButton timePicker;
    AppCompatButton addButton;

    AppCompatTextView dateDisplay;
    AppCompatTextView timeDisplay;

    AppCompatEditText remTitle;
    AppCompatEditText remItem;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_reminder);
        datePicker = findViewById(R.id.addReminderDate);
        timePicker = findViewById(R.id.addReminderTime);
        dateDisplay = findViewById(R.id.addReminderDateSelected);
        timeDisplay = findViewById(R.id.addReminderTimeSelected);
        doneAddReminder = findViewById(R.id.addReminderDone);
        addButton = findViewById(R.id.addReminderItemButton);

        remTitle= findViewById(R.id.addReminderTitle);
        remItem = findViewById(R.id.addReminderItemText);

        RecyclerView.LayoutManager itemListLayoutManager = new LinearLayoutManager(this);
        RecyclerView reminderItemList = findViewById(R.id.reminderItemList);
        reminderItemList.setLayoutManager(itemListLayoutManager);
        reminderItemList.setAdapter(reminderItemAdapter);

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialog();
            }
        });

        doneAddReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddReminder.this, "A reminder will be added on Main Screen", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AddReminder.this, MainActivity.class));
            }
        });

////////////////////////////////////////////////////////////////////////////////////////////
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddReminder.this, "A new item in reminder will be added", Toast.LENGTH_SHORT).show();
                //remItem = null;

                reminderItemAdapter.add(remItem.getText().toString());
                remItem.setText(" ");

            }
        });


        }



    public void showTimePickerDialog(){
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY),
                Calendar.getInstance().get(Calendar.MINUTE),
                true

        );
        timePickerDialog.show();
    }



    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }



    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month = month+1;
        String date = dayOfMonth+ " / " + month + " / " + year;
        displayDate(date);
        dateDisplay.setText(date);
    }

    public String displayDate(String date)
    {
        return date;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String time = hourOfDay + " : "+ minute+"  ";
        displayTime(time);
        timeDisplay.setText(time);
    }

    public String displayTime(String time){
        return time;
    }


}