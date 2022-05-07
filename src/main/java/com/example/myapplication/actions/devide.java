package com.example.myapplication.actions;

public class devide {
    public static String devide (String ev)
    {
        if (ev.length() > 0)
        {
            char check = ev.charAt(ev.length() - 1);
            if (check != '/')
                ev += '/';
        }
        return ev;
    }
}
