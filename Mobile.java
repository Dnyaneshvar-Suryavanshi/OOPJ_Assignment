class Mobile{
	
    String model;

    static int totalMobiles = 0;

    Mobile(String model) {
        this.model = model;
        totalMobiles++; 
    }

    String getMobile(){
        return model;
    }

    static void showTotalMobiles() {
        System.out.println("Total cups prepared: " + totalMobiles);
	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner();

	    Mobile m1 = new Mobile("Samsung Galaxy S22 ultra");
        Mobile m2 = new Mobile("One Plus");

        System.out.println("Mobile1 model1: " + m1.getMobile());
        System.out.println("Mobile2 model: " + m2.getMobile());

        Mobile.showTotalMobiles();	
    }
}


