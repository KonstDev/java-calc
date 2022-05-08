package com.example.myapplication.actions;
import static java.math.BigDecimal.ROUND_DOWN;
import java.math.BigDecimal;
import java.math.*;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;


public class result {
    BigDecimal I;
    public static String get_result (String ev)
    {
        Calculable calc = null;
        try {
            calc = new ExpressionBuilder(ev).build();
            BigDecimal result = new BigDecimal(calc.calculate());
            ev = (result.setScale(10, ROUND_DOWN)).toString();
            if (com.example.myapplication.actions.other.checkZeros(ev))
            {
                ev = (result.setScale(0, ROUND_DOWN)).toString();
            }
            //Log.d(TAG, "onClick: ");
        } catch (Exception e) {
            ev = "Math Error";
        }
        return ev;
    }
}
