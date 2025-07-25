package library.books;

public class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public String getTitle() {  
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
}
