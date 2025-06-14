import java.util.Scanner;

class PracLibraryThree
{
    private String title, author, isbn;
    private boolean borrowed;

    public PracLibraryThree(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Borrowed: " + (borrowed ? "Yes" : "No"));
    }
}


    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many books are you working with: ");
        int num = s.nextInt();
        s.nextLine(); // Consume the newline

        PracLibraryThree[] Buku = new PracLibraryThree[num];
        for (int x = 0; x < num; x++) {
            System.out.print("Enter the Title of Book: ");
            String title = s.nextLine();
            System.out.print("Enter the Author: ");
            String author = s.nextLine();
            System.out.print("Enter the ISBN: ");
            String isbn = s.nextLine();

            Buku[x] = new PracLibraryThree(title, author, isbn);
        }

        // Example of interacting with the books
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display all books");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            int choice = s.nextInt();
            s.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    for (PracLibraryThree book : Buku) {
                        book.displayBook();
                    }
                    break;
                case 2:
                    System.out.print("Enter the Title of book to search: ");
                    String searchTitle = s.nextLine();
                    boolean found = false;
                    for (PracLibraryThree book : Buku) {
                        if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                            book.displayBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Title of book to borrow: ");
                    String borrowTitle = s.nextLine();
                    found = false;
                    for (PracLibraryThree book : Buku) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            if (!book.isBorrowed()) {
                                book.borrow();
                                System.out.println("You have borrowed the book: " + borrowTitle);
                            } else {
                                System.out.println("Book is already borrowed.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the Title of book to return: ");
                    String returnTitle = s.nextLine();
                    found = false;
                    for (PracLibraryThree book : Buku) {
                        if (book.getTitle().equalsIgnoreCase(returnTitle)) {
                            if (book.isBorrowed()) {
                                book.returnBook();
                                System.out.println("You have returned the book: " + returnTitle);
                            } else {
                                System.out.println("Book was not borrowed.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
