package com.tms.lesson13_hw.run;

import com.tms.lesson13_hw.service.DoRegistration;

import java.util.Scanner;

public class Run1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter login: ");
        String login = scanner.nextLine();
        System.out.print("enter password: ");
        String password = scanner.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        System.out.println(DoRegistration.registration(login,password,confirmPassword));



    }
}
