package Com.inheritance.vehicle;

class vehicledemo {
    public static void main(String[] args) {

        vehicle[] vehicles = new vehicle[3];

        vehicles[0] = new car(180, "Petrol", 5);
        vehicles[1] = new truck(120, "Diesel", 10.5);
        for (vehicle v : vehicles) {
            v.displayInfo();  // dynamic method call
        }
    }
}
