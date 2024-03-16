package org.modul_2.tugas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    String adminUsername = "admin";
    String adminPassword = "admin";
    static List<Student> studentList = new ArrayList<>();

    void displayStudent(){
        System.out.println("Data mahasiswa: ");
        System.out.println("Universitas Muhammadiyah Malang");
        for (Student mahasiswa : studentList) {
            System.out.println(mahasiswa.tampilDataMahasiswa());
        }
    }

    void addStudent(){
        Scanner objInput = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Masukkan nama mahasiswa: ");
        student.nama = objInput.nextLine();

        System.out.println("Masukkan NIM mahasiswa: ");
        String nim = objInput.nextLine();
        while (nim.length() != 15) {
            System.out.println("Nim harus 15 digit");
            System.out.println("Masukkan NIM mahasiswa: ");
            nim = objInput.nextLine();
        }
        student.nim = nim;

        System.out.println("Masukkan jurusan mahasiswa: ");
        student.programStudi = objInput.nextLine();

        System.out.println("Masukkan fakultas mahasiswa: ");
        student.fakultas = objInput.nextLine();

        studentList.add(student);
    }
}
