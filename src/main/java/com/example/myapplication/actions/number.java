package com.example.myapplication.actions;

public class number {
    public static String number (String ev, Integer num, Boolean finished)
    {
        if (finished || ev.equals("Math Error"))
        {
            ev = "";
            ev += Integer.toString(num);
        }
        else ev += Integer.toString(num);
        return ev;
    }
}
