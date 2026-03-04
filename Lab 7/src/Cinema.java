public class Cinema {

    public Cinema(){
    }

    // Method to display seating layout
    public void displaySeats(boolean[][] seats) {
        System.out.println("Cinema Seating Plan (O = Available, X = Booked)");
        for(int i = 0; i < seats.length; i++){
            for(int j = 0; j < seats[i].length; j++){
                if(seats[i][j]){
                    System.out.print("X ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }

    }

    // Method to book a seat
    public void bookSeat(boolean[][] seats, int row, int col) {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length ) {
            if(!seats[row][col]){
                seats[row][col] = true;
                System.out.println("Seat booked successfully at Row "+row+", Column "+col);
            }
            else{
                System.out.println("Seat already booked");
            }
        }
        else{
            System.out.println("Invalid seat position!");
        }
    }

    // Method to calculate occupancy rate using enhanced for-loop
    public double getOccupancyRate(boolean[][] seats) {
        int totalSeats = 0;
        int bookedSeats = 0;
        for(int i = 0; i < seats.length; i++){
            for(int j = 0; j < seats[i].length; j++){
                if(seats[i][j]){
                    bookedSeats++;
                }
                totalSeats++;
            }
        }
        return(((double)bookedSeats/totalSeats)*100);
    }
}
