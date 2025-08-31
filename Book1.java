class Book1 {
    String title;
    String author;
    boolean issued;

    static int totalIssuedBooks = 0;

    Book1(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
        if (issued) {
            totalIssuedBooks++;
        }
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    boolean isIssued() {
        return issued;
    }

    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setIssued(boolean issued) {
        if (!this.issued && issued) {
            totalIssuedBooks++;
        } else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
    }

    static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

class LibraryTracker {
    public static void main(String[] args) {

        Book1 book1 = new Book1("Harry Potter", "J.K. Rowling", true);
        Book1 book2 = new Book1("Five Point Someone", "Chetan Bhagat", false);
        Book1 book3 = new Book1("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        Book1.showTotalIssued();
    }
}
