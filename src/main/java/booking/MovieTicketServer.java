package booking;

import java.io.IOException;

/**
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class MovieTicketServer {

  protected int availableSeats;
  protected String movieName;

  /**
   * Makes an instance of the MovieTicketServer class.
   * @param movieName the name of the movie.
   * @param availableSeats the number of available seats.
   */
  public MovieTicketServer(String movieName, int availableSeats) {
    this.availableSeats = 10;
    this.movieName = "Wakanda Forever";
  }

  /**
   * Checks for availability, and deduct to number of wanted tickets from availability.
   * @param customerName the name of the customer.
   * @param numberOfWantedSeats the number of wanted seats.
   * @return
   */
  public String bookTicket(String customerName, int numberOfWantedSeats) {
    String message;
    checkIfObjectIsBelowZero(numberOfWantedSeats, "number of wanted seats");
    System.out.println("Hi, " + customerName + " we have " + availableSeats + " seats available for " + movieName);
    if (availableSeats > numberOfWantedSeats) {
      message = "Hi, " + customerName + " we do have " + numberOfWantedSeats + " seats available for " + movieName;
      deductTickets(numberOfWantedSeats);
    } else {
      message = "Sorry, " + customerName + ". We don\t have " + numberOfWantedSeats + " seats available for " + movieName;
    }
    System.out.println("We now have " + availableSeats + " left. ");
    return message;
  }

  public void deductTickets(int numberOfWantedSeats) {
    this.availableSeats -= numberOfWantedSeats;
  }


  /**
   * Checks if an object is less than zero.
   *
   * @param object the object you want to check.
   * @param error  the error message the exception should have.
   * @throws IllegalArgumentException gets thrown if the object is less than zero.
   */
  private void checkIfObjectIsBelowZero(int object, String error) {
    if (object < 0) {
      throw new IllegalArgumentException("The " + error + " cannot be less than zero.");
    }
  }

}
