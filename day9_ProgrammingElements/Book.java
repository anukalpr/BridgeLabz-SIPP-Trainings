package day9_ProgrammingElements;

import java.util.ArrayList;
import java.util.List;

class BookDetail {
    private String title;
    private String author;

    public BookDetail(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private List<BookDetail> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(BookDetail book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("\nLibrary: " + name);
        System.out.println("Books in this library:");
        for (BookDetail book : books) {
            book.displayBook();
        }
    }
}

public class Book {
    public static void main(String[] args) {
        BookDetail book1 = new BookDetail("Java Basics", "James Gosling");
        BookDetail book2 = new BookDetail("Python Programming", "Guido van Rossum");
        BookDetail book3 = new BookDetail("Effective Java", "Joshua Bloch");

        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        library1.displayLibrary();
        library2.displayLibrary();
    }
}
