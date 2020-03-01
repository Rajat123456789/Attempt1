package com.example.attempt1;

import androidx.appcompat.widget.AppCompatEditText;


import java.io.Serializable;

public class Note implements Serializable {
    public String ntitle;
    public String ncontent;
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
