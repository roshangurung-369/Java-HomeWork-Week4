class Ticket {
    private String ticketNumber;
    private double price;

    public Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void generateTicket() {
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Price: " + price);
    }
}

class BusTicket extends Ticket {

    private int seatNumber;

    public BusTicket(String ticketNumber, double price, int seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket() {
        System.out.println("=== BUS TICKET ===");
        super.generateTicket();
        System.out.println("Seat Number: " + seatNumber);
    }
}

class TrainTicket extends Ticket {

    private String coachType;

    public TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    public void generateTicket() {
        System.out.println("=== TRAIN TICKET ===");
        super.generateTicket();
        System.out.println("Coach Type: " + coachType);
    }
}

class FlightTicket extends Ticket {

    private String boardingGate;

    public FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket() {
        System.out.println("=== FLIGHT TICKET ===");
        super.generateTicket();
        System.out.println("Boarding Gate: " + boardingGate);
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Ticket[] tickets = {
                new BusTicket("BUS101", 500, 12),
                new TrainTicket("TRN202", 1200, "AC Sleeper"),
                new FlightTicket("FLY303", 5500, "G12")
        };

        for (Ticket t : tickets) {
            t.generateTicket();
            System.out.println();
        }
    }
}