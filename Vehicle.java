// Inheritance
class VehicleBase {
    void vehi() {
        System.out.println("vehicle");
    }
}

class Bike extends VehicleBase {
    void bi() {
        System.out.println("It is a bike");
    }
}

class Car extends VehicleBase {
    void ca() {
        System.out.println("It is a car");
    }
}

// Encapsulation
class VehicleDetails {
    private String name;
    private String vehicle_r;
    private int amt;

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle_r(String vehicle_r) {
        this.vehicle_r = vehicle_r;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public String getVehicle_r() {
        return vehicle_r;
    }

    public int getAmt() {
        return amt;
    }
}

// Overloading
class VehicleRentals {
    void rent(int x) {
        System.out.println("Renting a two-wheeler vehicle");
    }

    void rent(int a, int b) {
        System.out.println("Renting a two-wheeler and a four-wheeler vehicle");
    }

    void rent(double c) {
        System.out.println("Renting a four-wheeler vehicle");
    }
}

// Overriding
class VehicleRentalBase {
    void tworents() {
        System.out.println("Two-wheeler rent");
    }

    void threerents() {
        System.out.println("Three-wheeler rent");
    }
}

class Example extends VehicleRentalBase {
    @Override
    void tworents() {
        System.out.println("Two-wheeler (overridden)");
    }
}

// Thread for performing vehicle actions
class VehicleActionsThread extends Thread {
    private String vehicleType;

    VehicleActionsThread(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void run() {
        try {
            System.out.println("Performing actions for: " + vehicleType);
            // Simulating some action delay
            Thread.sleep(1000);
            if (vehicleType.equals("Car")) {
                System.out.println("Renting Car...");
            } else if (vehicleType.equals("Bike")) {
                System.out.println("Renting Bike...");
            } else {
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Main method
public class Vehicle {
    public static void main(String args[]) {
        // Inheritance demonstration
        Bike b = new Bike();
        Car c = new Car();
        b.bi();
        b.vehi();
        c.ca();
        c.vehi();

        // Encapsulation demonstration
        VehicleDetails v = new VehicleDetails();
        v.setName("Ravi");
        v.setVehicle_r("Car");
        v.setAmt(1000);
        System.out.println(v.getName());
        System.out.println(v.getVehicle_r());
        System.out.println(v.getAmt());

        // Overloading demonstration
        VehicleRentals s = new VehicleRentals();
        s.rent(1000);
        s.rent(1001, 1002);
        s.rent(1400.0);

        // Overriding demonstration
        VehicleRentalBase l = new VehicleRentalBase();
        l.tworents();
        l.threerents();
        Example r = new Example();
        r.tworents();

        // Multithreading demonstration
        System.out.println("Starting threads...");
        VehicleActionsThread carThread = new VehicleActionsThread("Car");
        VehicleActionsThread bikeThread = new VehicleActionsThread("Bike");
        carThread.start();
        bikeThread.start();

        // Exception Handling in Main method
        try {
            // Simulate some action that could throw an exception
            String[] vehicles = {"Car", "Bike", "Truck"};
            for (int i = 0; i <= vehicles.length; i++) {
                System.out.println(vehicles[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Simulate dividing by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
