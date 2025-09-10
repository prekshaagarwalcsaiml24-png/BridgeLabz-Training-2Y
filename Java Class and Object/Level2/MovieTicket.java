package Level2;
import java.util.*;
public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked: Seat " + seatNumber + ", Price " + price);
    }
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        MovieTicket ticket = new MovieTicket(movieName, "", 0);
        ticket.bookTicket(seatNumber, price);
        ticket.displayDetails();
        sc.close();
    }
}
