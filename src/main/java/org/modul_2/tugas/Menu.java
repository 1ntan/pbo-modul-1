package org.modul_2.tugas;

import java.util.Scanner;

public class Menu {
    String nimUser;
    static Scanner objInput = new Scanner(System.in);
    void inputNim(){
        System.out.println("Enter your NIM: ");
        nimUser = objInput.nextLine();
        if (nimUser.equals("99")){
            System.out.println("User exit");
        } else {
            System.out.println("NIM diterima");
        }
    }
    public void menuAdmin(){
        String pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Menu: ");
            System.out.println("1. Tambahkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilihan Anda: ");
            pilihan = objInput.nextLine();

            Admin admin = new Admin();

            switch (pilihan){
                case "1":
                    admin.addStudent();
                    break;
                case "2":
                    admin.displayStudent();
                    break;
                case "3":
                    System.out.println("adios");
                    ulang = false;
                    break;
                default:
                    System.out.println("inputan tidak valid");
                    break;
            }
        }
    }

    public static void main(String[] args){

        String choose;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Library system: ");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            choose = objInput.nextLine();

            Menu menu = new Menu();

            switch (choose) {
                case "1":
                    menu.inputNim();
                    break;
                case "2":
                    Admin admin = new Admin();

                    System.out.println("Enter your username: ");
                    String userName = objInput.nextLine();
                    System.out.println("Enter your password: ");
                    String passWord = objInput.nextLine();
                    if (userName.equals(admin.adminUsername) && passWord.equals(admin.adminPassword)) {
                        System.out.println("Succesful login as Admin");
                        menu.menuAdmin();
                    } else {
                        System.out.println("Admin User Not Found");
                    }
                    break;
                case "3":
                    System.out.println("thank you. exiting program");
                    ulang = false;
                    break;
                default:
                    System.out.println("inputan tidak valid");
                    break;
            }
        }
    }
}