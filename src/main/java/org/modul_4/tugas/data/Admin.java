package org.modul_4.tugas.data;

import org.modul_4.tugas.util.iMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends User implements iMenu {
    private String adminUsername = "admin";
    public String getAdminUsername(){
        return adminUsername;
    }
    private String adminPassword = "admin";
    public String getAdminPassword(){
        return adminPassword;
    }
    private static List<Student> studentList = new ArrayList<>();
    public static List<Student> getStudentList() {
        return studentList;
    }
    public static void setStudentList(List<Student> studentList) {
        Admin.studentList = studentList;
    }

    public void addStudent(){
        Scanner objInput = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa: ");
        String name = objInput.nextLine();

        System.out.println("Masukkan NIM mahasiswa: ");
        String nim = objInput.nextLine();
        while (nim.length() != 15) {
            System.out.println("Nim harus 15 digit");
            System.out.println("Masukkan NIM mahasiswa: ");
            nim = objInput.nextLine();
        }

        System.out.println("Masukkan jurusan mahasiswa: ");
        String programStudi = objInput.nextLine();

        System.out.println("Masukkan fakultas mahasiswa: ");
        String faculty = objInput.nextLine();

        Student student = new Student(name, nim, faculty, programStudi);

        studentList.add(student);
    }
    public void inputBook(){}

    public void displayBook(){}

    public void displayStudent(){
        System.out.println("Data mahasiswa: ");
        System.out.println("Universitas Muhammadiyah Malang");
        for (Student mahasiswa : studentList) {
            System.out.println(mahasiswa.displayStudents());
        }
    }

    public boolean isAdmin(){
        return false;
    }

    public String generateId(){
        return "";
    }

    @Override
    public void menu() {
        String pilihan;
        boolean ulang = true;
        Scanner objInput = new Scanner(System.in);

        while (ulang) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambahkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilihan Anda: ");
            pilihan = objInput.nextLine();

            switch (pilihan){
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayStudent();
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
}
