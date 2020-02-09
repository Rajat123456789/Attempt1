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


public class noteFragment extends Fragment{

    private RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext().getApplicationContext());


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //find view by id
        //recycler view instance
        //Adapter object
        //


        NoteAdapter adapterNote = new NoteAdapter();
        RecyclerView noteList = getActivity().findViewById(R.id.notesList);
        noteList.setLayoutManager(mLayoutManager);
        noteList.setAdapter(adapterNote);
        ArrayList<Note> inputNotes = generateNoteList();
        adapterNote.swapAll(inputNotes);



    }

    ArrayList<Note> generateNoteList(){
        ArrayList<Note> notes = new ArrayList<>();
        while (notes.size()<50){
            notes.add(new Note("TITLE of Note","CONTENT of Note"));
        }
        return notes;
    }
}
