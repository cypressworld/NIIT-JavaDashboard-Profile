package com.niit.app;
import java.util.regex.*;

public class AuthValidator{
    //Requires: 8 chars, 1 Uppercase, 1 Digit, 1 Special Char
    private static final String PWD_REGEX =
     "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

     public static boolean validator(String password){
        Pattern pattern = Pattern.compile(PWD_REGEX);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
     }
}