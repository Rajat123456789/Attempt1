package com.example.attempt1;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class Note {
    String ntitle;
    String ncontent;
    AppCompatEditText stringTitle;
    AppCompatEditText stringContent;

    public Note(String title, String content){
        ntitle = title;
        ncontent = content;
    }
    public Note(AppCompatEditText title, AppCompatEditText content){
        stringTitle = title;
        stringContent = content;
    }

}
