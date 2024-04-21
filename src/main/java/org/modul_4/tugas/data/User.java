package org.modul_4.tugas.data;

import org.modul_4.tugas.books.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    protected static ArrayList<Book> bookList = new ArrayList<>();

    public void displayBook(){
        System.out.println("Daftar Buku:");
        System.out.println("================================================================");
        System.out.println("|| No. || Id Buku || Judul Buku || Pengarang || Kategori || Stok ||");
        int indeks = 0;
        for (Book buku : bookList) {
            System.out.println("|| " + indeks + "  || " + buku.getBookId() + " || " + buku.getTitle() + " || " + buku.getAuthor() + " || " + buku.getCategory() + "  || " + buku.getStock() + " ||");
            indeks++;
        }
        System.out.println("================================================================");
    }

    public void inputBook(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih kategori buku:");
        System.out.println("1. Buku Cerita");
        System.out.println("2. Buku Sejarah");
        System.out.println("3. Buku Teks");
        System.out.print("Masukkan pilihan (1-3): ");
        String pilihanKategori = scanner.nextLine();

        String kategori;
        switch (pilihanKategori) {
            case "1":
                kategori = "Buku Cerita";
                break;
            case "2":
                kategori = "Buku Sejarah";
                break;
            case "3":
                kategori = "Buku Teks";
                break;
            default:
                System.out.println("Pilihan tidak valid. Default ke Buku Cerita.");
                kategori = "Buku Cerita";
                break;
        }
        System.out.println("Masukkan detail buku:");
        System.out.print("Masukkan ID buku: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang buku: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan stok buku: ");
        int stok = Integer.parseInt(scanner.nextLine());

        Book bukuBaru = new Book(id, judul, pengarang, kategori, stok);
        bookList.add(bukuBaru);
        System.out.println("Buku berhasil ditambahkan ke perpustakaan.");
    }
}
