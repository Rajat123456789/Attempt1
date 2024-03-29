package com.example.attempt1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class AddNote extends AppCompatActivity {

    AppCompatButton mDone;
    AppCompatEditText mTitle;
    AppCompatEditText mContent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_note);
        mDone = findViewById(R.id.addReminderDone);
        mTitle = findViewById(R.id.addNoteTitle);
        mContent = findViewById(R.id.addNoteContent);
        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Note note = new Note(mTitle,mContent);
                startActivity(new Intent(AddNote.this,MainActivity.class));

//                Intent i= new Intent(AddNote.this,MainActivity.class);
//                i.putExtra("note",note);
//                startActivity(i);


            }
        });

    }
}
