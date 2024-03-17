public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.displayUnoccupiedSeats();

        flight.reserveSeat(3);
        flight.reserveSeat(6);

        flight.cancelReservation(3);

        flight.displayUnoccupiedSeats();
    }
}