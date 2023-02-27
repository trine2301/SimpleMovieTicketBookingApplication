package booking;

/** This class represents the client.
 * The objective of this class is to be able to run on a separate thread in order to simulate consumers accessing resources in parallel.
 *
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class MovieTicketClient extends Thread {
  String customerName;
  int numberOfWantedTickets;
  MovieTicketServer movieTicketServer;

  /**
   * Makes an instance of the MovieTicketClient class.
   *
   * @param movieTicketServer
   * @param customerName         the name of the customer.
   * @param numberOfWantedTicket the number of wanted tickets.
   */
  public MovieTicketClient(MovieTicketServer movieTicketServer, String customerName, int numberOfWantedTicket) {
    this.customerName = customerName;
    this.numberOfWantedTickets = numberOfWantedTicket;
    this.movieTicketServer = new MovieTicketServer(movieTicketServer.movieName, movieTicketServer.availableSeats);
  }

  public synchronized void run() {
    //movieTicketServer.bookTicket(customerName, numberOfWantedTickets);
/*    Object process = movieTicketServer.bookTicket(customerName, numberOfWantedTickets);
    synchronized (process) {
      try {
        process.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }*/
    this.movieTicketServer.bookTicket(customerName, numberOfWantedTickets);
  }
}
