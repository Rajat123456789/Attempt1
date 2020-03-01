package com.example.attempt1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.attempt1.Note;
import com.example.attempt1.R;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private ArrayList<Note> notes = new ArrayList<>();

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_preview,parent,false);

        return new NoteViewHolder(itemView);
    }
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.updateData(notes.get(position));
    }
    public int getItemCount() {
        return notes.size();
    }

    class NoteViewHolder extends RecyclerView.ViewHolder{
        AppCompatTextView mtitle;
        AppCompatTextView mcontent;

        public NoteViewHolder(View itemView){
            super(itemView);
            mtitle = itemView.findViewById(R.id.noteTitle);
            mcontent = itemView.findViewById(R.id.noteContent);
        }

        void updateData(Note note){
            mtitle.setText(note.ntitle);
            mcontent.setText(note.ncontent);
        }

    }

    public void swapAll(ArrayList<Note> notes){
        this.notes.clear();
        this.notes.addAll(notes);
    }
}