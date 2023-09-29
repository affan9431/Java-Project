import java.util.Scanner;

// Library Class.
class MyLibrary {
    Scanner sc = new Scanner(System.in);
    String[] student = new String[100];
    String[] issueBook = new String[100];
    String[] library = { "Rich Dad Poor Dad", "Digital Marketing", "Let Us Know C", "React js", "Physics", "English",
            "Python", "Science", "Next js", "Maths", "Rust", "C++", "PHP", "SST", "Go", "R" };
    int n;

    // Method to show all the available books in library.
    public void showAvailableBook() {
        System.out.println("Avaliable books are-");
        for (int i = 0; i < library.length; i++) {
            System.out.println("--> " + library[i]);
        }
    }

    // Method which ask the user to enter the no. of books.
    public void BookCount() {
        System.out.print("Enter the no. of books you want to issued:: ");
        n = sc.nextInt();

    }

    // Method which ask the user to enter book name.
    public void userInput() {
        BookCount();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the books you want to issued:: ");
            student[i] = sc.next();

        }

    }

    // Method to show the books which enter by user.
    public void showUserBook() {
        for (int i = 0; i < n; i++) {
            System.out.println("You want to add " + "'" + student[i] + "'" + " book\n" + "please give me sometimes\n"
                    + "to check it out this book is available or not\n\n");
        }
    }

    // Method which check the avaibility of books in library.
    public void checkAvailableBook() {
        System.out.println("Checking book availability...\n");
        for (int i = 0; i < n; i++) {
            String bookToCheck = student[i];
            boolean bookFound = false;
            for (String availableBook : library) {
                if (availableBook.equalsIgnoreCase(bookToCheck)) {
                    System.out.println("'" + bookToCheck + "' is available.");
                    bookFound = true;
                    break; // No need to continue searching
                }
            }

            if (!bookFound) {
                System.out.println("'" + bookToCheck + "' is not available.");
            }
        }
    }

    // Method which issued the book if books are available.
    public void issuedBook() {
        System.out.println("Now you can issued the book...");
        System.out.println("You entered total " + n + " no. " + "books.");
        for (int i = 0; i < n; i++) {
            issueBook[i] = student[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + issueBook[i] + " are issued");
        }
    }

    // Method which allow us to return the book
    public void returnedBook() {
        System.out.println("Returning books...");

        for (int i = 0; i < n; i++) {
            String bookToReturn = student[i];
            boolean bookFound = false;
            for (int j = 0; j < issueBook.length; j++) {
                if (issueBook[j] != null && issueBook[j].equalsIgnoreCase(bookToReturn)) {
                    issueBook[j] = null; // Mark the book as returned
                    bookFound = true;
                    break;
                }
            }

            if (bookFound) {
                System.out.println("'" + bookToReturn + "' has been returned.");
            } else {
                System.out.println("'" + bookToReturn + "' was not issued or has already been returned.");
            }
        }
    }

}

public class Library_Mangement {
    public static void main(String[] args) {
        MyLibrary library = new MyLibrary();
        library.showAvailableBook();
        library.userInput();
        library.showUserBook();
        library.checkAvailableBook();
        library.issuedBook();
        int a;
        System.out.println("01--> If you want to return the book pls enter 1");
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a) {
            case 1:
                library.returnedBook();
                break;
            default:
                System.out.println("Something wrong");
                break;
        }

    }

}
