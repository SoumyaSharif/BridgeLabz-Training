package javaConstructors;

public class HotelBookingSystem {

    // Create a static class HotelBooking
    static class HotelBooking {

    	//Creating attributes 
        String guestName;
        String roomType;
        int numberOfNights;

        // Create default constructor
        public HotelBooking() {
        	
        }

        // Create parameterized constructor
        public HotelBooking(String name, String roomType, int nights) {
            this.guestName = name;
            this.roomType = roomType;
            this.numberOfNights = nights;
        }

        // Clone constructor
        public HotelBooking(HotelBooking dupe) {
            this.guestName = dupe.guestName;
            this.roomType = dupe.roomType;
            this.numberOfNights = dupe.numberOfNights;
        }
    }

    public static void main(String[] args) {

    	//Display the results 
        HotelBooking day1 = new HotelBooking("Rahul", "Suite", 4);
        HotelBooking day2 = new HotelBooking(day1); // cloned object

        //
        System.out.println(
            "Guest: " + day2.guestName +
            ", Room: " + day2.roomType +
            ", Nights: " + day2.numberOfNights
        );
    }
}
