package org.modul_2.codelab;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    String tampilUniversitas() {
        return "Universitas Muhammadiyah Malang";
    }

    String tampilDataMahasiswa() {
        return "Nama: " + nama + ", Nim: " + nim + ", Jurusan: " + jurusan;
    }
}
