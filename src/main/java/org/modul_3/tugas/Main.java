package org.modul_3.tugas;

import java.util.Scanner;

public class Main {
    private String nimUser;
    static Scanner objInput = new Scanner(System.in);
    private static Main menu = new Main();
    private Admin admin = new Admin();
    public Student studentSekarang;

    public void menu(){
        String choose;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Library system: ");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            choose = objInput.nextLine();

            switch (choose) {
                case "1":
                    menu.inputNim();
                    break;
                case "2":
                    System.out.println("Enter your username: ");
                    String userName = objInput.nextLine();
                    System.out.println("Enter your password: ");
                    String passWord = objInput.nextLine();
                    if (userName.equals(admin.getAdminUsername()) && passWord.equals(admin.getAdminPassword())) {
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

    public void inputNim(){
        System.out.println("Enter your NIM (input 99 untuk back): ");
        nimUser = objInput.nextLine();
        if (nimUser.equals("99")) {
            System.out.println("User exit");
        } else {
            System.out.println("NIM diterima");
            studentSekarang = menu.checkNim();
            if (studentSekarang == null) {
                System.out.println("NIM tidak ditemukan");
            } else {
                menu.menuStudent();
            }
        }
    }
    public Student checkNim(){
        for (Student student : Admin.getStudentList()) {
            if (nimUser.equals(student.getNim())){
                return student;
            }
        }
        return null;
    }
    public void menuStudent(){
        String pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Student menu: ");
            System.out.println("0. Tampil info student");
            System.out.println("1. Buku terpinjam");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Kembalikan buku");
            System.out.println("4. Pinjam buku atau Logout");

            System.out.print("Pilihan Anda: ");
            pilihan = objInput.nextLine();

            switch (pilihan){
                case "0":
                    System.out.println("Info student");
                    studentSekarang.displayInfo();
                    break;
                case "1":
                    System.out.println("Buku terpinjam");
                    break;
                case "2":
                    System.out.println("Pinjam buku");
                    break;
                case "3":
                    System.out.println("Kembalikan buku");
                    break;
                case "4":
                    System.out.println("Pinjam buku atau Logout");
                    ulang = false;
                    break;
                default:
                    System.out.println("inputan tidak valid");
                    break;
            }
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
        menu.menu();
    }
    public void addTempStudent(){}
    public void addTempBooks(){}
}