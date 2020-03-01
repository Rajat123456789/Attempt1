package com.example.attempt1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt1.Missed;
import com.example.attempt1.R;

import java.util.ArrayList;

public class MissedAdapter extends RecyclerView.Adapter<MissedAdapter.MissedViewHolder> {
    private ArrayList<Missed> Misseds = new ArrayList<>();

    @NonNull
    @Override
    public MissedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.missed_preview,parent,false);

        return new MissedViewHolder(itemView);
    }
    public void onBindViewHolder(@NonNull MissedViewHolder holder, int position) {
        holder.updateData(Misseds.get(position));
    }
    public int getItemCount() {
        return Misseds.size();
    }

    class MissedViewHolder extends RecyclerView.ViewHolder{
        AppCompatTextView mtitle;
        AppCompatTextView mcontent;

        public MissedViewHolder(View itemView){
            super(itemView);
            mtitle = itemView.findViewById(R.id.noteTitle);
            mcontent = itemView.findViewById(R.id.noteContent);
        }

        void updateData(Missed Missed){
            mtitle.setText(Missed.ntitle);
            mcontent.setText(Missed.ncontent);
        }

    }

    public void swapAll(ArrayList<Missed> Misseds){
        this.Misseds.clear();
        this.Misseds.addAll(Misseds);
    }
}

