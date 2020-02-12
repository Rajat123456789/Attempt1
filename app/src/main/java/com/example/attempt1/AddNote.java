package com.example.attempt1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class AddNote extends AppCompatActivity {

    AppCompatButton mDone;
    AppCompatEditText mTitle;
    AppCompatEditText mContent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_note);

        mDone = findViewById(R.id.addNoteDone);
        mTitle = findViewById(R.id.addNoteTitle);
        mContent = findViewById(R.id.addNoteContent);

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Note note = new Note(mTitle,mContent);
                

            }
        });





    }
}
