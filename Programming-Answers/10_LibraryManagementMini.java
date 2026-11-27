import java.util.*;
class Book {
    final int id;
    final String title;
    boolean issued;
    Book(int id, String title) { this.id = id; this.title = title; }
}
class Library {
    private final Map<Integer, Book> books = new LinkedHashMap<>();
    void addBook(Book book) { books.put(book.id, book); }
    void issueBook(int id) {
        Book book = books.get(id);
        if (book == null) System.out.println("Book not found");
        else if (book.issued) System.out.println("Already issued");
        else { book.issued = true; System.out.println("Issued: " + book.title); }
    }
    void returnBook(int id) {
        Book book = books.get(id);
        if (book == null || !book.issued) System.out.println("Invalid return");
        else { book.issued = false; System.out.println("Returned: " + book.title); }
    }
    void displayBooks() {
        for (Book b : books.values())
            System.out.println(b.id + " | " + b.title + " | " + (b.issued ? "Issued" : "Available"));
    }
}
class LibraryManagementMini {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Effective Java"));
        library.addBook(new Book(2, "Clean Code"));
        library.issueBook(1);
        library.displayBooks();
        library.returnBook(1);
    }
}
