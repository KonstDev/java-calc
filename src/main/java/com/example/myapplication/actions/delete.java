package com.example.myapplication.actions;

public class delete {
    private static String removeLastChar(String s) {
                s =  (s.substring(0, s.length() - 1));
                return s;
    }
    public static String del (String ev)
    {
        if (ev.length() > 0)
        {
            ev = removeLastChar(ev);
        }
        return ev;
    }
}
