package com.epam.rd.autotasks.validations;

import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        String str = "^\\w+\\_\\w+@epam\\.com$";
        final Pattern EMAIL_REGEX = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
        if (email == null || email.isEmpty() || !EMAIL_REGEX.matcher(email).matches()) {
            return false;
        }
        return EMAIL_REGEX.matcher(email).matches();
    }
}





