package com.example.attempt1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class reminderFragment extends Fragment {
    private RecyclerView reminderList;
    private RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext().getApplicationContext());




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reminder, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        ReminderAdapter adapterNote = new ReminderAdapter();
        reminderList = getActivity().findViewById(R.id.reminderList);
        reminderList.setLayoutManager(mLayoutManager);
        reminderList.setAdapter(adapterNote);
        ArrayList<Reminder> inputReminders = generateReminderList();
        adapterNote.swapAll(inputReminders);




    }


    ArrayList<Reminder> generateReminderList(){
        ArrayList<Reminder> reminder = new ArrayList<>();
        while (reminder.size()<50){
            reminder.add(new Reminder("TITLE of Reminder","CONTENT of Reminder"));
        }
        return reminder;
    }
}
