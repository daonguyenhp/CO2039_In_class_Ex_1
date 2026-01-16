#include <iostream>
#include <string>
#include <vector>
using namespace std;

// 1. Class Book
class Book {
private:
    string title;
    string author;
    string ISBN;
    double price;
    int stock;

public:
    Book(string t, string a, string i, double p, int s) 
        : title(t), author(a), ISBN(i), price(p), stock(s) {}

    string getTitle() { return title; }
    string getAuthor() { return author; }
    
    bool borrow() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    void display() {
        cout << "Title: " << title << " | Author: " << author << " | Stock: " << stock << endl;
    }
};

// 2. Class Library
class Library {
private:
    vector<Book> books;

public:
    // a. Add new books
    void addBook(Book b) {
        books.push_back(b);
        cout << "-> Added: " + b.getTitle() << endl;
    }

    // b. Search
    void searchBook(string keyword) {
        bool found = false;
        for (auto &b : books) {
            if (b.getTitle() == keyword || b.getAuthor() == keyword) {
                b.display();
                found = true;
            }
        }
        if (!found) cout << "No book found." << endl;
    }

    // c. Borrow
    void borrowBook(string title) {
        for (auto &b : books) {
            if (b.getTitle() == title) {
                if (b.borrow()) {
                    cout << "Success! You borrowed" << endl;
                } else {
                    cout << "Failed! Out of stock." << endl;
                }
                return;
            }
        }
        cout << "Book not found." << endl;
    }
};

// 3. Main
int main() {
    Library myLib;

    myLib.addBook(Book("Harry Potter", "J.K. Rowling", "12345", 20.0, 3));
    myLib.addBook(Book("The Hobbit", "Tolkien", "67890", 15.0, 0)); // Hết hàng

    myLib.searchBook("Harry Potter");

    myLib.borrowBook("Harry Potter"); // OK
    myLib.borrowBook("The Hobbit");   // Fail (Stock = 0)

    return 0;
}