package booking;

/**
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class MovieTicketServer {

  protected int availableSeats;
  protected String movieName;

  /**
   * Makes an instance of the MovieTicketServer class.
   */
  public MovieTicketServer() {
    this.availableSeats = 0;
    this.movieName = "";
  }

  public String bookTicket(String customerName, int numberOfWantedSeats) {
    String message;
    System.out.println("Hi, " + customerName + " we have " + availableSeats + " seats available for " + movieName);
    if (availableSeats > numberOfWantedSeats) {
      message = "Hi, " + customerName + " we do have " + numberOfWantedSeats + " seats available for " + movieName;
      availableSeats =- numberOfWantedSeats;
    } else {
      message = "Sorry, " + customerName + ". We don\t have " + numberOfWantedSeats + " seats available for " + movieName;
    }
    return message;
  }
}
