package TIcketBooking;

class PremiumBooking extends Booking {

    public PremiumBooking(int bookingId, String movieName,
                           int numberOfSeats, double pricePerSeat) {
        super(bookingId, movieName, UserType.PREMIUM, numberOfSeats, pricePerSeat);
    }

    @Override
    public void book() throws SeatLimitExceededException {
        if (getSeatCount() > 10) {
            throw new SeatLimitExceededException("PREMIUM users can book max 10 seats");
        }
        calculateTotal(10); // 10% discount
    }
}

