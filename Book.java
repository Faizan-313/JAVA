class Book {
    String title;
    String author;
    double price;

    // Constructor 1: No parameters (default book)
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Constructor 2: Title and Author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor 3: Title, Author, and Price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Create different book objects using different constructors
        Book defaultBook = new Book();
        Book bookWithAuthor = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book fullBook = new Book("1984", "George Orwell", 399.99);

        defaultBook.displayInfo();
        bookWithAuthor.displayInfo();
        fullBook.displayInfo();
    }
}
