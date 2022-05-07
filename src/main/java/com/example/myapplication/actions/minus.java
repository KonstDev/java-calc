package com.example.myapplication.actions;

public class minus {
    public static String minus (String ev)
    {
        if (ev.equals("Math Error"))
            ev = "";
        else {
            if (ev.length() > 1)
            {
                int len = ev.length();
                if (ev.length() > 1) {
                    char c1 = ev.charAt(len - 1);
                    char сc = ev.charAt(len - 2);
                    if (!((c1 == '-') && (ev.charAt(len - 2) == '-')))
                        ev += '-';
                }

            }
            else if (ev.length() == 0)
            {
                ev += '-';
            }
            else if (ev.length() == 1)
            {
                ev += '-';
            }
        }
        return ev;
    }
}

