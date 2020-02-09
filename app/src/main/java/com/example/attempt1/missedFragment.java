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


public class missedFragment extends Fragment {
     RecyclerView missedList;
    private RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext().getApplicationContext());


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_missed, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        MissedAdapter adapterMissed = new MissedAdapter();
        missedList = getActivity().findViewById(R.id.missedList);
        missedList.setLayoutManager(mLayoutManager);
        missedList.setAdapter(adapterMissed);
        ArrayList<Missed> inputMissed = generateMissedList();
        adapterMissed.swapAll(inputMissed);
    }

    ArrayList<Missed> generateMissedList(){
        ArrayList<Missed> missed = new ArrayList<>();
        while (missed.size()<50){
            missed.add(new Missed("TITLE of Missed","CONTENT of Missed"));
        }
        return missed;
    }
}
