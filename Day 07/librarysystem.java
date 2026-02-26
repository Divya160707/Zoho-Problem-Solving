class Book {
    int bookId;
    String title;
    boolean isAvailable = true;

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}

class Member {
    int memberId;
    String name;

    void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
    }
}

class Library {
    void issueBook(Book b) {
        if (b.isAvailable) {
            b.isAvailable = false;
            System.out.println("Book issued");
        } else {
            System.out.println("Book not available");
        }
    }

    void returnBook(Book b) {
        b.isAvailable = true;
        System.out.println("Book returned");
    }
}

class librarysystem {
    public static void main(String[] args) {
        Book b = new Book();
        b.bookId = 1;
        b.title = "Java Basics";

        Member m = new Member();
        m.memberId = 101;
        m.name = "Jamuna";

        Library l = new Library();

        b.display();
        m.display();

        l.issueBook(b);
        l.returnBook(b);
    }
}
