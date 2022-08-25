package com.aaa.homeworks._03static;

import java.util.HashSet;
import java.util.Set;

public class BookSeller {
    //2)	Define a Java class “BookSeller”
    // and then define a static inner class “Book”,
    // and use a static method “sellBooks” to initialize several books,
    // and in the main method display all the books by calling the “sellBooks” method

    public static class Book {
        private String id, isbn, name, author, publishDate;

        public Book() {}

        public Book(String id, String isbn, String name, String author, String publishDate) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        public static Set<Book> bookSet = new HashSet<>();

        public void printInfo() {
            System.out.println("There are " + bookSet.size() + " books.");
            int i = 1;
            for (BookSeller.Book b : bookSet) {
                System.out.println("book" + i + ":");
                System.out.println("id " + b.id);
                System.out.println("isbn " + b.isbn);
                System.out.println("name " + b.name);
                System.out.println("author " + b.author);
                System.out.println("publishDate " + b.publishDate);
                i++;
            }
        }
    }

    public static void sellbooks(){
        Book.bookSet.add(new BookSeller.Book("id123", "isbna1", "name123", "au123", "pd123"));
        Book.bookSet.add(new BookSeller.Book("id456", "isbna2", "name456", "au456", "pd456"));
        System.out.println("There are " + Book.bookSet.size() + " books.");
        int i = 1;
        for (Book b : Book.bookSet) {
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
        BookSeller.sellbooks();
    }

}



