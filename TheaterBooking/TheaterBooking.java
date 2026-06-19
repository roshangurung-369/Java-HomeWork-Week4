class Seat {
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void bookSeat() {
        System.out.println("Seat " + seatNumber + " booked.");
    }
}

class RegularSeat extends Seat {

    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("=== Regular Seat Booking ===");
        System.out.println("Seat " + getSeatNumber() + " booked anytime.");
    }
}

class PremiumSeat extends Seat {

    private double luxuryTax = 150;

    public PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("=== Premium Seat Booking ===");
        System.out.println("Seat " + getSeatNumber() + " booked with premium service.");
        System.out.println("Includes free snacks.");
        System.out.println("Luxury Tax: " + luxuryTax);
    }
}

public class TheaterBooking {
    public static void main(String[] args) {

        Seat[] seats = {
                new RegularSeat("R101"),
                new PremiumSeat("P202"),
                new RegularSeat("R103")
        };

        for (Seat s : seats) {
            s.bookSeat();
            System.out.println();
        }
    }
}