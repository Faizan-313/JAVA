import library.books.*;
import library.members.*;
import library.transactions.*;

public class Main {
    public static void main(String[] args) {
        Issue issueManager = new Issue();

        // Create books
        TextBook tb1 = new TextBook("Java Programming", "James Gosling", "ISBN123");
        ReferenceBook rb1 = new ReferenceBook("Design Patterns", "Erich Gamma", "ISBN456");

        // Add books
        issueManager.addBook(tb1);
        issueManager.addBook(rb1);

        // Create members
        Student student = new Student("Alice", "STU01");
        Faculty faculty = new Faculty("Dr. Bob", "FAC01");

        // Issue books
        issueManager.issueBook(student.getId(), "ISBN123");
        issueManager.issueBook(faculty.getId(), "ISBN456");

        // Display issued books
        issueManager.displayIssuedBooks();
    }
}
