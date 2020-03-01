package com.example.attempt1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt1.R;

import java.util.ArrayList;

public class ReminderItemAdapter extends RecyclerView.Adapter<ReminderItemAdapter.ReminderItemViewHolder> {
    public ArrayList<String> item = new ArrayList<>();

    @NonNull
    @Override
    public ReminderItemAdapter.ReminderItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_new_item_recycler,parent,false);
        return new ReminderItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReminderItemViewHolder holder, int position) {
        holder.mText.setText(item.get(position));

    }

    public void add(String reminderItem )
    {
        item.add(reminderItem);
        notifyDataSetChanged();
    }

    @Override



    public int getItemCount() {
        return item.size();
    }

    public class ReminderItemViewHolder extends RecyclerView.ViewHolder{

        AppCompatCheckBox mCheckBox;
        AppCompatTextView mText;


        public ReminderItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mCheckBox = itemView.findViewById(R.id.reminderCheckBox);
            mText = itemView.findViewById(R.id.reminderText);

        }


    }
}
