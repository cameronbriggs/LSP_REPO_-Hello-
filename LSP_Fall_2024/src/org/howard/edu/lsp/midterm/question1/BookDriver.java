package org.howard.edu.lsp.midterm.question1;

/**
 * The BookDriver class demonstrates the usage of the Book class.
 * It creates Book objects, compares them for equality, and prints their details.
 */
public class BookDriver {

    /**
     * The main method is the entry point of the program. It creates three Book objects,
     * compares them using the equals method, and prints their details using the toString method.
     */
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        System.out.println(book1.equals(book2)); 

        System.out.println(book1.equals(book3)); 

  
        System.out.println(book1); 
    }
}
