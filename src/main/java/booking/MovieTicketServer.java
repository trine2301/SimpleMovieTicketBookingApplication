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
    this.availableSeats = 10;
    this.movieName = "Wakanda forever";
  }

  public String bookTicket(String customerName, int numberOfWantedSeats) {
    String message;
    checkIfObjectIsBelowZero(numberOfWantedSeats, "number of wanted seats");
    System.out.println("Hi, " + customerName + " we have " + availableSeats + " seats available for " + movieName);
    if (availableSeats > numberOfWantedSeats) {
      message = "Hi, " + customerName + " we do have " + numberOfWantedSeats + " seats available for " + movieName;
      availableSeats -= numberOfWantedSeats;
    } else {
      message = "Sorry, " + customerName + ". We don\t have " + numberOfWantedSeats + " seats available for " + movieName;
    }
    System.out.println("We now have " + availableSeats + " left. ");
    return message;
  }

  /**
   * Checks if an object is null.
   *
   * @param object the object you want to check.
   * @param error  the error message the exception should have.
   * @throws IllegalArgumentException gets thrown if the object is null.
   */
  private void checkIfObjectIsBelowZero(int object, String error) {
    if (object < 0) {
      throw new IllegalArgumentException("The " + error + " cannot be less than zero.");
    }
  }

}
