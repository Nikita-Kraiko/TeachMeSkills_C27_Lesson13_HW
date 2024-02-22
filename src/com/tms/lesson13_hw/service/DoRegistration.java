package com.tms.lesson13_hw.service;

public class DoRegistration {
    public static boolean registration(String login, String password, String confirmPassword){
        return RegistrationChecker.loginVerification(login)
                && RegistrationChecker.passwordVerification(password, confirmPassword);
    }
    public static boolean registration(char[] login, char[] password, char[] confirmPassword){
        return RegistrationChecker.loginVerification(login)
                && RegistrationChecker.passwordVerification(password, confirmPassword);
    }
}
