package com.example.myapplication.actions;
import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;


public class result {
    private static String check_0(double ev)
    {
        Integer u = 0;
        if (ev % 1 == 0)
            u = (int) ev;
        if (u != 0)
            return String.valueOf(u);
        else return String.valueOf(ev);

    }

    public static String get_result (String ev)
    {
        Calculable calc = null;
        try {
            calc = new ExpressionBuilder(ev).build();
            double result = calc.calculate();

            ev = check_0(result);
            //Log.d(TAG, "onClick: ");
        } catch (Exception e) {
            ev = "Math Error";
        }
        return ev;
    }
}