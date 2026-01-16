package In_class_Exercise_3;

import java.util.ArrayList;

// 1. Class Book
class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;
    private int stock;

    // Constructor
    public Book(String title, String author, String ISBN, double price, int stock) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getStock() { return stock; }

    public boolean borrow() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | Stock: " + stock;
    }
}

// 2. Class Library
class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // a. Add new books
    public void addBook(Book newBook) {
        books.add(newBook);
        System.out.println("-> Added: " + newBook.getTitle());
    }

    // b. Search for books by title or author
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(keyword) || b.getAuthor().equalsIgnoreCase(keyword)) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No book found matching your query.");
    }

    // c. Borrow books (reduce stock)
    public void borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.borrow()) {
                    System.out.println("Success! You borrowed " + title);
                    System.out.println("Remaining stock: " + b.getStock());
                } else {
                    System.out.println("Failed! " + title + " is out of stock.");
                }
                return;
            }
        }
        System.out.println("Book not found in library.");
    }
}

// 3. Main Function
public class LibrarySystem {
    public static void main(String[] args) {
        Library myLib = new Library();

        myLib.addBook(new Book("Harry Potter", "J.K. Rowling", "12345", 20.0, 5));
        myLib.addBook(new Book("Lord of the Rings", "Tolkien", "67890", 25.0, 1)); 
        myLib.addBook(new Book("Java Programming", "Author X", "11223", 50.0, 10));

        myLib.searchBook("Harry Potter");
        myLib.searchBook("Tolkien");

        myLib.borrowBook("Harry Potter");       
        myLib.borrowBook("Lord of the Rings");  // Out of stock after this
        myLib.borrowBook("Lord of the Rings");  
    }
}