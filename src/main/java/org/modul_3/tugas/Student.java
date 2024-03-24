package org.modul_3.tugas;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private String name;
    private String nim;
    private String faculty;
    private String programStudi;
    private static List<Book> borrowedBooks = new ArrayList<>();
    public Student(String name, String nim, String faculty, String programStudi){
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudi = programStudi;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }
    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }
    public String getProgramStudi(){
        return programStudi;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        Student.borrowedBooks = borrowedBooks;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }


    public void displayInfo(){
        System.out.println("Nama: " + name + ", Nim: " + nim + ", Jurusan: " + programStudi + ", Fakultas: " + faculty);
    }
    public void showBorrowedBooks(){}
    public void displayBook(){}
    public void logout(){}
    public void returnBook(){}

    String displayStudents() {
        return "Nama: " + name + ", Nim: " + nim + ", Jurusan: " + programStudi + ", Fakultas: " + faculty;
    }
}