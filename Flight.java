public class Flight {
    private Seat[] seats;

    public Flight() {
        seats = new Seat[10]; // 10 seats in the airplane
        for (int i = 0; i < 10; i++) {
            seats[i] = new Seat();
        }
    }

    public void displayUnoccupiedSeats() {
        System.out.println("Unoccupied seats:");
        for (int i = 0; i < 10; i++) {
            if (!seats[i].isOccupied()) {
                System.out.println("Seat " + (i + 1));
            }
        }
    }

    public void reserveSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number.");
        } else {
            seats[seatNumber - 1].reserve();
        }
    }

    public void cancelReservation(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number.");
        } else {
            seats[seatNumber - 1].cancelReservation();
        }
    }
}

