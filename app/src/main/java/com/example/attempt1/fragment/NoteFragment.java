package com.example.attempt1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.attempt1.Note;
import com.example.attempt1.R;
import com.example.attempt1.adapter.NoteAdapter;

import java.util.ArrayList;


public class NoteFragment extends Fragment {

    Note note;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //find view by id
        //recycler view instance
        //Adapter object
        //

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(view.getContext());

        NoteAdapter adapterNote = new NoteAdapter();
        RecyclerView noteList = view.findViewById(R.id.notesList);
        noteList.setLayoutManager(mLayoutManager);
        noteList.setAdapter(adapterNote);
        ArrayList<Note> inputNotes = generateNoteList();
        adapterNote.swapAll(inputNotes);


    }

    ArrayList<Note> generateNoteList() {
        ArrayList<Note> notes = new ArrayList<>();
        while (notes.size() < 50) {
            notes.add(new Note("TITLE of Note", "CONTENT of Note"));
        }
        return notes;
    }
}
