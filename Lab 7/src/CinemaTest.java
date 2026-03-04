
public class CinemaTest {

    public static void main(String[] args) {

        // Initialization: rowsxcols cinema seating grid
        boolean[][] theaterSeats = new boolean[5][5];

        // Create Cinema object
        Cinema c=new Cinema();

        // Display initial seating
        c.displaySeats(theaterSeats);

        System.out.println("\nBooking some seats...\n");

        //Booking seats:
        c.bookSeat(theaterSeats,5,6);  // seat 5,6
        c.bookSeat(theaterSeats,1,2);  // seat 1,2
        c.bookSeat(theaterSeats,3,4);  // seat 3,4
        c.bookSeat(theaterSeats,0,0);  // seat 0,0
        c.bookSeat(theaterSeats,1,2);  // seat 1,2

        System.out.println("\nUpdated Seating Plan:\n");
        c.displaySeats(theaterSeats);

        // Display occupancy rate
        double occupancy = c.getOccupancyRate(theaterSeats);
        System.out.printf("\nOccupancy Rate: %.2f%%\n", occupancy);
    }
}
