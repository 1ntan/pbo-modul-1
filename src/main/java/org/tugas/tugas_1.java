package org.tugas;

import java.util.Scanner;
import java.util.Arrays;
public class tugas_1 {
    public static void main(String[] args){
        String[] nimData = {
                "202310370311183",
                "202210370311203",
        };
        String nimUser;
        String usernameData = "admin";
        String passwordData = "adm1n";
        String usernameUser;
        String passwordUser;
        String option;
        Scanner objInput = new Scanner(System.in);
        boolean ulang = true;

        while(ulang) {
            System.out.println("Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3): ");
            option = objInput.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter your NIM: ");
                    nimUser = objInput.nextLine();
                    if (Arrays.asList(nimData).contains(nimUser)) {
                        System.out.println("Succesful login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case "2":
                    System.out.print("Enter your username (admin): ");
                    usernameUser = objInput.nextLine();
                    System.out.print("Enter your password (admin): ");
                    passwordUser = objInput.nextLine();
                    if (usernameUser.equals(usernameData) && passwordUser.equals(passwordData)) {
                        System.out.println("Succesful login as Admin");
                    } else {
                        System.out.println("Admin User Not Found");
                    }
                    break;
                case "3":
                    System.out.println("adios");
                    ulang = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
