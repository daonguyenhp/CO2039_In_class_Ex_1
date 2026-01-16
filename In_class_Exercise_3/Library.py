class Book:
    def __init__(self, title, author, ISBN, price, stock):
        self.title = title
        self.author = author
        self.ISBN = ISBN
        self.price = price
        self.stock = stock

    def getTitle(self):
        return self.title

    def getAuthor(self):
        return self.author
    
    def borrow(self):
        if self.stock > 0:
            self.stock -= 1
            return True
        else:
            return False
        
class Library:
    def __init__(self):
        self.books = []
    
    def addBook(self, book):
        self.books.append(book)
    
    def searchBook(self, keyword):
        found = False
        for b in self.books:
            if b.getTitle() == keyword or b.getAuthor() == keyword:
                print(f"Found: {b.getTitle()} by {b.getAuthor()}")
                found = True
        if not found:
            print("No matching books found.")

    def borrowBook(self, title):
        for b in self.books:
            if b.getTitle() == title:
                if b.borrow():
                    print("Success! You borrowed")
                else:
                    print("Failed! Out of stock.")
                return
        print("Book not found in the library.")

# Main function
if __name__ == "__main__":
    library = Library()
    
    # Adding books
    book1 = Book("1984", "George Orwell", "1234567890", 9.99, 3)
    book2 = Book("To Kill a Mockingbird", "Harper Lee", "0987654321", 12.99, 2)
    library.addBook(book1)
    library.addBook(book2)
    
    # Searching for a book
    library.searchBook("1984")
    library.searchBook("J.K. Rowling")
    
    # Borrowing books
    library.borrowBook("1984")
    library.borrowBook("1984")
    library.borrowBook("1984")
    library.borrowBook("1984")  # This should indicate out of stock
    library.borrowBook("The Great Gatsby")  # This should indicate book not found