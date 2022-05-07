package com.example.myapplication.actions;

public class dot {
    public static String dot (String ev)
    {
        if (ev.length() > 0 && !com.example.myapplication.actions.other.checkSymb(ev)  && !com.example.myapplication.actions.other.checkDot(ev))
        {
            char check = ev.charAt(ev.length() - 1);
            if (check != '.')
                ev += '.';
        }
        return ev;
    }
}
