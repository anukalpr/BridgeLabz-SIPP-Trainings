package day7_ProgrammingElements;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Alice Johnson", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();

        System.out.println("\nCopy of Custom Booking:");
        copyBooking.displayBookingDetails();
    }
}

