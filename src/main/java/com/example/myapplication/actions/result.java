package com.example.myapplication.actions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.*;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
//TODO: fix big integers

public class result {
    BigDecimal I;
    private static String check_0(double ev)
    {
        Integer u = 0;
        if (ev % 1 == 0)
            u = (int) ev;
        if (u != 0)
            return String.valueOf(u);
        else if (u == 0.0)
            return "0";
        else return String.valueOf(ev);

    }
    public static String get_result (String ev)
    {
        Calculable calc = null;
        try {
            calc = new ExpressionBuilder(ev).build();
            BigDecimal result = new BigDecimal(calc.calculate());
            ev = result.toString();
            //Log.d(TAG, "onClick: ");
        } catch (Exception e) {
            ev = "Math Error";
        }
        return ev;
    }
}
