 import java.util.*;
public class Seat {
	public static void main(String[] args) {
    private boolean occupied;

    public Seat() {
        this.occupied = false; // Initially, all seats are unoccupied
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void reserve() {
        if (!occupied) {
            occupied = true;
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Seat is already occupied.");
        }
    }

    public void cancelReservation() {
        if (occupied) {
            occupied = false;
            System.out.println("Reservation canceled successfully.");
        }
        else {
            System.out.println("No reservation to cancel. Seat is already unoccupied.");
        }
    }
}

 