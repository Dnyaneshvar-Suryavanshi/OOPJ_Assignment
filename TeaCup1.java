class TeaCup1{
	
    String teaType;

    static int totalCups = 0;

    TeaCup1(String teaType) {
        this.teaType = teaType;
        totalCups++; 
    }

    String getTeaType() {
        return teaType;
    }

    static void showTotalCups() {
        System.out.println("Total cups prepared: " + totalCups);
	}
		
		public static void main(String[] args) {
        TeaCup1 cup1 = new TeaCup1("Masala Tea");
        TeaCup1 cup2 = new TeaCup1("Green Tea");
        TeaCup1 cup3 = new TeaCup1("Ginger Tea");

        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());

        TeaCup1.showTotalCups();
		
    }
}


