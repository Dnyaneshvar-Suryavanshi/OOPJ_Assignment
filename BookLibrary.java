public class BookLibrary {
    String title, author;
    boolean issued;
    static int totalIssued = 0;

    BookLibrary(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
        if (issued) totalIssued++;
    }

    boolean isIssued() { return issued; }

    void setIssued(boolean issued) {
        if (!this.issued && issued) totalIssued++;
        else if (this.issued && !issued) totalIssued--;
        this.issued = issued;
    }

    static void showTotal() {
        System.out.println("Total issued: " + totalIssued);
    }

    public static void main(String[] args) {
        BookLibrary b1 = new BookLibrary("Harry Potter", "J.K. Rowling", true);
        BookLibrary b2 = new BookLibrary("Five Point Someone", "Chetan Bhagat", false);
        BookLibrary b3 = new BookLibrary("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + b1.isIssued());
        System.out.println("Book2 issued? " + b2.isIssued());
        System.out.println("Book3 issued? " + b3.isIssued());

        BookLibrary.showTotal();
    }
}
