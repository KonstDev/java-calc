package com.example.myapplication.actions;

public class dot {
    public static String dot (String ev)
    {
        if (ev.length() > 0)
        {
            char check = ev.charAt(ev.length() - 1);
            if (check != '.')
                ev += '.';
        }
        return ev;
    }
}
