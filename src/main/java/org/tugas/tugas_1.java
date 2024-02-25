package org.tugas;

import java.util.Scanner;
public class tugas_1 {
    public static void main(String[] args){
        String[] nimData;
        String nimUser;
        String usernameData;
        String passwordData;
        String usernameUser;
        String passwordUser;
        String option;
        Scanner objInput = new Scanner(System.in);

        System.out.println("Library System");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");

        System.out.println("Choose option (1-3): ");
        option = objInput.nextLine();

        switch (option) {
            case "1":
                System.out.println("Enter your NIM: ");
                break;
            case "2":
                System.out.println("Enter your username (admin): ");
                System.out.println("Enter your password (admin): ");
                break;
            case "3":
                System.out.println("adios");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
