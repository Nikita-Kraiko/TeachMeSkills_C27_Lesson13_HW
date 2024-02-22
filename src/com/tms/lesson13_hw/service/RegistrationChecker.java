package com.tms.lesson13_hw.service;

import com.tms.lesson13_hw.exception.WrongLoginException;
import com.tms.lesson13_hw.exception.WrongPasswordException;

public class RegistrationChecker {
    public static boolean passwordVerification(String password, String confirmPassword) {
        try {
            PasswordChecker.checkPasswordLength(password);
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password length");
            return false;
        }
        try {
            PasswordChecker.checkPasswordSpace(password);
        } catch (WrongPasswordException e) {
            System.out.println("there are spaces in the password");
            return false;
        }
        try {
            PasswordChecker.checkPasswordNumbers(password);
        } catch (WrongPasswordException e) {
            System.out.println("there are no numbers in the password");
            return false;
        }
        try {
            PasswordChecker.checkConfirmPassword(confirmPassword, password);
        } catch (WrongPasswordException e) {
            System.out.println("Password mismatch");
            return false;
        }
        return true;
    }

    public static boolean passwordVerification(char[] charPassword, char[] charConfirmPassword) {
        try {
            PasswordChecker.checkPasswordLength(charPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password length");
            return false;
        }
        try {
            PasswordChecker.checkPasswordSpace(charPassword);
        } catch (WrongPasswordException e) {
            System.out.println("there are spaces in the password");
            return false;
        }
        try {
            PasswordChecker.checkPasswordNumbers(charPassword);
        } catch (WrongPasswordException e) {
            System.out.println("there are no numbers in the password");
            return false;
        }
        try {
            PasswordChecker.checkConfirmPassword(charConfirmPassword, charPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Password mismatch");
            return false;
        }
        return true;
    }

    public static boolean loginVerification(String login) {
        try {
            LoginChecker.checkLoginLength(login);
        } catch (WrongLoginException e){
            System.out.println("Wrong login length");
            return false;
        }
        try {
            LoginChecker.checkLoginSpace(login);
        } catch (WrongLoginException e){
            System.out.println("there are spaces in the login");
            return false;
        }
        return true;

    }
    public static boolean loginVerification(char[] charLogin) {
        try {
            LoginChecker.checkLoginLength(charLogin);
        } catch (WrongLoginException e){
            System.out.println("Wrong login length");
            return false;
        }
        try {
            LoginChecker.checkLoginSpace(charLogin);
        } catch (WrongLoginException e){
            System.out.println("there are spaces in the login");
            return false;
        }
        return true;

    }

}
