package org.modul_2.codelab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Mahasiswa> kumpulanMahasiswa = new ArrayList<Mahasiswa>();
        String pilihan;
        boolean ulang = true;

        Scanner objInput = new Scanner(System.in);

        while (ulang) {
            System.out.println("Menu: ");
            System.out.println("1. Tambahkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilihan Anda: ");
            pilihan = objInput.nextLine();

            switch (pilihan){
                case "1":
                    Mahasiswa mahasiswa = new Mahasiswa();
                    System.out.println("Masukkan nama mahasiswa: ");
                    mahasiswa.nama = objInput.nextLine();

                    System.out.println("Masukkan NIM mahasiswa: ");
                    String nim = objInput.nextLine();
                    while (nim.length() != 15) {
                        System.out.println("Nim harus 15 digit");
                        System.out.println("Masukkan NIM mahasiswa: ");
                        nim = objInput.nextLine(); 
                    }
                    mahasiswa.nim = nim;

                    System.out.println("Masukkan jurusan mahasiswa: ");
                    mahasiswa.jurusan = objInput.nextLine();

                    kumpulanMahasiswa.add(mahasiswa);

                    break;
                case "2":
                    System.out.println("Data mahasiswa: ");
                    System.out.println(kumpulanMahasiswa.get(0).tampilUniversitas());
                    for (int i = 0; i < kumpulanMahasiswa.size(); i++) {
                        System.out.println(kumpulanMahasiswa.get(i).tampilDataMahasiswa());
                    }
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
