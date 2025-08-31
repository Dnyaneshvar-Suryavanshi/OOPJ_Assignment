class Book{
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
	
	Book(String libraryName) {
        this.libraryName = libraryName;
    }

    int getBookId() {
        return bookId;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String libraryName;
    static int totalBooks = 0;

    void Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book b) {
        totalBooks++;
        System.out.println("Book Added: ID=" + b.getBookId() + ", Title=" + b.getTitle() + ", Author=" + b.getAuthor());
    }

    public void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }

    public static void main(String[] args) {
        Book lib = new Book("City Library");

        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Book b2 = new Book(102, "Python Essentials", "Guido van Rossum");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
