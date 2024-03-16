package org.modul_1.codelab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab_1 {
    public static void main(String[] args) {
        String nama;
        String jk, jenisKelamin;
        String tanggalLahir;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        jk = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        tanggalLahir = objInput.nextLine();

        switch (jk){
            case "L", "l":
                jenisKelamin = "Laki-laki";
                break;
            case "P", "p":
                jenisKelamin = "Perempuan";
                break;
            default:
                jenisKelamin = "Tidak ada";
                break;
        }
        LocalDate tanggalLahirFormat = LocalDate.parse(tanggalLahir);
        LocalDate tanggalSekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahirFormat, tanggalSekarang);

        System.out.print("\n");

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin :" + jenisKelamin);
        System.out.printf("Umur anda: %d Tahun %d Bulan", umur.getYears(), umur.getMonths());
    }
}