package com.aaa.homeworks._03static;
import java.util.*;
public class Book {
    /*
    1)	Given a database table “Book” with columns
     (id, isbn, name, author, publish date),
     define a java class that matches this table and then
      use a static block to initialize this table with some records
     */
    private String id, isbn, name, author, publishDate;
    public Book(){};
    public Book(String id, String isbn, String name, String author, String publishDate){
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
    public static Set<Book> bookSet = new HashSet<>();
    static {
        bookSet.add(new Book("id123","isbna1","name123","au123","pd123"));
        bookSet.add(new Book("id456","isbna2","name456","au456","pd456"));
    }
    public void printInfo(){
        System.out.println("There are " + bookSet.size() + " books.");
        int i = 1;
        for (Book b : bookSet){
            System.out.println("book" + i + ":");
            System.out.println("id " + b.id);
            System.out.println("isbn " + b.isbn);
            System.out.println("name " + b.name);
            System.out.println("author " + b.author);
            System.out.println("publishDate " + b.publishDate);
            i++;
        }
    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.printInfo();

    }
}
