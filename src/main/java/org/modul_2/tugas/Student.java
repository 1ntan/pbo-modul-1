package org.modul_2.tugas;

public class Student {
    String nama;
    String nim;
    String programStudi;
    String fakultas;
    String tampilDataMahasiswa() {
        return "Nama: " + nama + ", Nim: " + nim + ", Jurusan: " + programStudi + ", Fakultas: " + fakultas;
    }
}