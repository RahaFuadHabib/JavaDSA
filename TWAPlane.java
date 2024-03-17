import javax.swing.JOptionPane;

public class TWAPlane {

    private boolean seatList[];

    public TWAPlane() {
        seatList = new boolean[10];
        // Initialize all seats as unoccupied
        for (int i = 0; i < seatList.length; i++) {
            seatList[i] = false;
        }
    }

    public void reserveSeat() {
        String input = JOptionPane.showInputDialog(null, "Enter the seat number (0-9):");
        try {
            int seatNumber = Integer.parseInt(input);
            if (seatNumber >= 0 && seatNumber < seatList.length) {
                if (!seatList[seatNumber]) {
                    seatList[seatNumber] = true;
                    JOptionPane.showMessageDialog(null, "Seat " + seatNumber + " has been reserved.");
                } else {
                    JOptionPane.showMessageDialog(null, "Seat " + seatNumber + " is already reserved.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid seat number. Please enter a number between 0 and 9.");
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    public void cancelReservation() {
        String input = JOptionPane.showInputDialog(null, "Enter the seat number to cancel reservation (0-9):");
        try {
            int seatNumber = Integer.parseInt(input);
            if (seatNumber >= 0 && seatNumber < seatList.length) {
                if (seatList[seatNumber]) {
                    seatList[seatNumber] = false;
                    JOptionPane.showMessageDialog(null, "Reservation for seat " + seatNumber + " is not reserved.");
                } else {
                    JOptionPane.showMessageDialog(null, "Seat " + seatNumber + " has been canceled.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid seat number. Please enter a number between 0 and 9.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    public void displayOccupiedSeats() {
        StringBuilder occupiedSeats = new StringBuilder("Occupied seats: all seats are occupied\n");
        for (int i = 0; i < seatList.length; i++) {
            if (seatList[i]) {
                occupiedSeats.append("Seat ").append(i).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, occupiedSeats.toString());
    }

    public static void main(String[] args) {
        TWAPlane plane = new TWAPlane();
        
        // Main menu
        String[] options = {"Reserve Seat", "Cancel Reservation", "Display Occupied Seats", "Exit"};
        while (true) {
            String choice = (String) JOptionPane.showInputDialog(null, "Choose an option:", "Main Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (choice == null || choice.equals("Exit")) {
                break;
            } else if (choice.equals("Reserve Seat")) {
                plane.reserveSeat();
            } else if (choice.equals("Cancel Reservation")) {
                plane.cancelReservation();
            } else if (choice.equals("Display Occupied Seats")) {
                plane.displayOccupiedSeats();
            }
        }
    }
}