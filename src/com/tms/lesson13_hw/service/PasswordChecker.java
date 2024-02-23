package com.tms.lesson13_hw.service;

import com.tms.lesson13_hw.constant.Constant;
import com.tms.lesson13_hw.exception.WrongLoginException;
import com.tms.lesson13_hw.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void checkPasswordLength(String password) throws WrongPasswordException {
        if (password.length() < Constant.PASSWORD_LENGTH_CONST && password.length() != 0) {
            System.out.println("Correct password length");
        } else {
            throw new WrongPasswordException("Error password length");
        }
    }

    public static void checkPasswordLength(char[] charPassword) throws WrongPasswordException {
        if (charPassword.length < Constant.PASSWORD_LENGTH_CONST && charPassword.length != 0) {
            System.out.println("Correct password length");
        } else {
            throw new WrongPasswordException("Error password length");
        }
    }

    public static void checkPasswordSpace(String password) throws WrongPasswordException {
        if (!password.contains(" ")) {
            System.out.println("Correct password spelling");
        } else {
            throw new WrongPasswordException("Invalid password (spaces)");
        }
    }

    public static void checkPasswordSpace(char[] charPassword) throws WrongPasswordException {
        for (char c : charPassword) {
            if (c == 32) {
                throw new WrongPasswordException("Invalid password (spaces)");
            }
        }
        System.out.println("Correct password spelling");
    }

    public static void checkPasswordNumbers(String password) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("[1-9]");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            System.out.println("password contains number(s)");
        } else {
            throw new WrongPasswordException("password does not contain number(s)");
        }
    }

    public static void checkPasswordNumbers(char[] charPassword) throws WrongPasswordException {
        for (char c : charPassword) {
            if (Character.isDigit(c)) {
                System.out.println("password contains number(s)");
                break;
            }
        }
        throw new WrongPasswordException("password does not contain number(s)");
    }

    public static void checkConfirmPassword(String confirmPassword, String password)
            throws WrongPasswordException {
        if (confirmPassword.equals(password)) {
            System.out.println("password confirmed");
        } else {
            throw new WrongPasswordException("password not confirmed");
        }
    }

    public static void checkConfirmPassword(char[] confirmPassword, char[] password)
            throws WrongPasswordException {
        if (confirmPassword.length != password.length) {
            throw new WrongPasswordException("password lengths do not match");
        } else {
            for (int i = 0; i < password.length; i++){
                if (confirmPassword[i] != password[i]){
                    throw new WrongPasswordException("password not confirmed");
                }
            }
        }
        System.out.println("password confirmed");
    }

}
