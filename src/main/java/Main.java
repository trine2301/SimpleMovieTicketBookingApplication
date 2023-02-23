import booking.MovieTicketServer;

/**
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class Main {

  /**
   * Makes an instance of the Main class.
   */
  public Main() {

  }

  public static void main(String[] args) {
    MovieTicketServer movieTicketServer = new MovieTicketServer();
    movieTicketServer.bookTicket("Trine", 0);
  }
}
