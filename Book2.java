class Book2{
	
    String title, author;
	boolean issued;

    static int totalIssuedBooks = 0;
	
	Book2(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if (issued){
			totalIssuedBooks++;
		}
	}
	
	void getdata1(){
		return title;
		return author;
	}
	void getdata2(){
		return author;
	}
	void getdata3(){
		return issued;
	}
	
		
	void setdata1(String title, String author){
		this.title = title;
		this.author = author;
	}
	void setdata2(String author){
		this.author = author;
	}
	void setdata3(boolean issued){
		if(!this.issued && issued){
			totalIssuedBooks++;
		}
		else if (this.issued && !issued){
			totalIssuedBooks--;
		}
		this.issued = issued;
	}
	
	static void Show(){
		System.out.println("Total books issued count: "+totalIssuedBooks);
	}
}

	class main{
	
		public static void main(String[] args) {
			//Book b1 = new Book("Dune", "Frank Herbert", true);
           // Book b2 = new Book("The God of Small Things", "Arundhati Roy", false);
           // Book b3 = new Book("The Inheritance of Loss", "Kiran Desai", true);

            System.out.println("Book1 issued? " + b1.isissued());
            System.out.println("Book2 issued? " + b2.isissued());
            System.out.println("Book3 issued? " + b3.isissued());
			
            Book2 b4 = new Book2();
			show();	
    }
}


