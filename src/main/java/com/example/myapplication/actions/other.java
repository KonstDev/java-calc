package com.example.myapplication.actions;

public class other {
    public static Boolean checkSymb (String ev)
    {
        char toCheck = ev.charAt(ev.length() - 1);
        return ((toCheck == '-' || toCheck == '+' || toCheck == '*' || toCheck == '/'));
    }
    public static Boolean checkDot(String ev)
    {
        Boolean isDot = false;
        for (int i = 0; i < ev.length(); i++)
        {
            if (ev.charAt(i) == '.')
                isDot = true;
        }
        return isDot;
    }
}
