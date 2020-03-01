package com.example.attempt1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt1.R;
import com.example.attempt1.Reminder;

import java.util.ArrayList;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ReminderViewHolder> {
    private ArrayList<Reminder> Reminders = new ArrayList<>();

    @NonNull
    @Override
    public ReminderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_preview,parent,false);

        return new ReminderViewHolder(itemView);
    }
    public void onBindViewHolder(@NonNull ReminderViewHolder holder, int position) {
        holder.updateData(Reminders.get(position));
    }
    public int getItemCount() {
        return Reminders.size();
    }

    class ReminderViewHolder extends RecyclerView.ViewHolder{
        AppCompatTextView mtitle;
        AppCompatTextView mcontent;

        public ReminderViewHolder(View itemView){
            super(itemView);
            mtitle = itemView.findViewById(R.id.noteTitle);
            mcontent = itemView.findViewById(R.id.noteContent);
        }

        void updateData(Reminder Reminder){
            mtitle.setText(Reminder.titleOfReminder);
            mcontent.setText(Reminder.itemOfReminder);
        }

    }

    public void swapAll(ArrayList<Reminder> Reminders){
        this.Reminders.clear();
        this.Reminders.addAll(Reminders);
        notifyDataSetChanged();
    }

//    void add(Reminder reminder )
//    {
//        this.Reminders.add(reminder);
//        notifyDataSetChanged();
//    }

}

