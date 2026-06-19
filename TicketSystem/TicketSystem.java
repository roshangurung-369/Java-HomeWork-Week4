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