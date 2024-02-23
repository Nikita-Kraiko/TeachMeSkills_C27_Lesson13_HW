package com.tms.lesson13_hw.service;

import com.tms.lesson13_hw.constant.Constant;
import com.tms.lesson13_hw.exception.WrongLoginException;

public class LoginChecker {
    public static void checkLoginLength(String login)
            throws WrongLoginException {
        if (login.length() < Constant.LOGIN_LENGTH_CONST && login.length() != 0) {
            System.out.println("Correct login length");
        } else {
            throw new WrongLoginException("Invalid login length (must be less than twenty and greater than zero)");
        }
    }

    public static void checkLoginLength(char[] charLogin)
            throws WrongLoginException {
        if (charLogin.length < Constant.LOGIN_LENGTH_CONST && charLogin.length != 0) {
            System.out.println("Correct login length");
        } else {
            throw new WrongLoginException("Invalid login length (must be less than twenty and greater than zero)");
        }
    }

    public static void checkLoginSpace(String login)
            throws WrongLoginException {
        if (!login.contains(" ")) {
            System.out.println("correct password spelling");
        } else {
            throw new WrongLoginException("The presence of a space in the login is unacceptable");
        }
    }
    public static void checkLoginSpace(char[] charLogin)
            throws WrongLoginException {
        for (char c: charLogin) {
            if (c == 32) {
                throw new WrongLoginException("The presence of a space in the login is unacceptable");
            }
        }
        System.out.println("correct password spelling");
    }

}
