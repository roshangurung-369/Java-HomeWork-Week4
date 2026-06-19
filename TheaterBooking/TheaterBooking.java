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