package com.example.myapplication.actions;

public class multiply {
    public static String multiply (String ev)
    {
        if (ev.length() != 0)
        {
            int len = ev.length();
            if (ev.length() > 1) {
                char c1, c2;
                c1 = ev.charAt(len - 1);
                if (!(c1 == '*'))
                    ev += '*';
            }
            else if (len == 1)
            {
                ev += '*';
            }
        }
        return ev;
     }
}

