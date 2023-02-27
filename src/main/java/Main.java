import booking.MovieTicketServer;
import booking.MovieTicketClient;

/**
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class Main {
  public static void main(String[] args) {
    MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);
    MovieTicketClient movieTicketClient = new MovieTicketClient(movieTicketServer, "hi", 2);

    // Creating 4 threads
    Thread t1 = new MovieTicketClient(movieTicketServer, "Xiangming", 3);
    Thread t2 = new MovieTicketClient(movieTicketServer, "Ilaria", 2);
    Thread t3 = new MovieTicketClient(movieTicketServer, "Sam", 3);
    Thread t4 = new MovieTicketClient(movieTicketServer, "Andreas", 4);
    Thread t5 = new MovieTicketClient(movieTicketServer, "Andreas", 4);

    // Starting all threads
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    //System.out.println(movieTicketServer.bookTicket("Xiangming", 3));
    System.out.println(t5);
    //movieTicketClient.run();
  }
}
