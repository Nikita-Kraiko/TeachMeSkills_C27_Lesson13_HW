package com.tms.lesson13_hw.run;

import com.tms.lesson13_hw.service.DoRegistration;

import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter login: ");
        String login = scanner.nextLine();
        System.out.print("enter password: ");
        String password = scanner.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        char[] charLogin = login.toCharArray();
        char[] charPassword = password.toCharArray();
        char[] charConfirmPassword = confirmPassword.toCharArray();
        System.out.println(DoRegistration.registration(charLogin, charPassword, charConfirmPassword));
    }
}
