package com.example.attempt1;

import java.io.Serializable;


public class Reminder  implements Serializable {

public String titleOfReminder;
public String itemOfReminder;
    public Reminder(){

    }

    public Reminder(String title, String item){

        titleOfReminder = title;
        itemOfReminder = item;
    }


}