//Create a class Book with constructor that initializes title and author.

public class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String args[]) {
        Book b = new Book("Harry Potter", "J.K. Rowling");
        
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
    }
}