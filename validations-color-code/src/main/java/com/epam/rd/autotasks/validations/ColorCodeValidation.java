package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {


        char[] symbols = color.toCharArray();
        if (symbols.length < 3 || symbols.length > 15) return false;

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        for (char c : symbols) {
            if (validationString.indexOf(c) == -1) return true;
        }


        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(color);
        return m.matches();



    }
}





