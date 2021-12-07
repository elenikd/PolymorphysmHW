package com.syntax.utils;

public class MathUtil {
    //Math.change(value:    )
    // Math.round(value:    ) 33.333333 it will round the decimal  to 33.33
    public static double change(double value, int decimalpoint) {

        // Using the pow()method
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);

        System.out.println(value);

        return value;


    }
        public static double round(double v, int i) {
            return v;
        }
}



