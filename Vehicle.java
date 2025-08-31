class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 0;
	
	static{
		System.out.println("Welcome to CDAC Vehicle Registration Portal");
		System.out.println("-------------------------------------------");
	}

    Vehicle(String ownerName, String vehicleType) {
        vehicleCount++; 
        this.regNo = "MH-2025-" + vehicleCount; 
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public void displayDetails() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul Sharma", "Car");
        Vehicle v2 = new Vehicle("Sneha Patil", "Bike");

        v1.displayDetails();
        v2.displayDetails();

        System.out.println("Total Vehicles Registered: " + Vehicle.getVehicleCount());
    }
}
