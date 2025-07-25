package library.transactions;

import library.books.Book;
import java.util.*;

public class Issue {
    private List<Book> books = new ArrayList<>();
    private Map<String, List<Book>> issuedBooks = new HashMap<>(); // key = member ID

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());

    }

    public void issueBook(String memberId, String isbn) {
        Book foundBook = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                foundBook = b;
                break;
            }
        }

        if (foundBook != null) {
            issuedBooks.computeIfAbsent(memberId, k -> new ArrayList<>()).add(foundBook);
            books.remove(foundBook);
            System.out.println("Issued book '" + foundBook.getTitle() + "' to member ID: " + memberId);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found or already issued.");
        }
    }

    public void displayIssuedBooks() {
        System.out.println("Issued Books:");
        for (Map.Entry<String, List<Book>> entry : issuedBooks.entrySet()) {
            String memberId = entry.getKey();
            List<Book> bookList = entry.getValue();
            System.out.println("Member ID: " + memberId);
            for (Book book : bookList) {
                book.display();
            }
        }
    }
}
