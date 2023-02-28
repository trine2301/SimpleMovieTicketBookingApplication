import booking.MovieTicketServer;
import booking.MovieTicketClient;

/**
 * @author Trine Merete Staverløkk
 * @version 0.1
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {
    MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);
    //System.out.println(movieTicketServer.bookTicket("Trine", 2));

   creatingThreads();
  }

  public synchronized static void creatingThreads() {
    MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);

    Thread t1 = new MovieTicketClient(movieTicketServer, "Xiangming", 3);
    Thread t2 = new MovieTicketClient(movieTicketServer, "Ilaria", 2);
    Thread t3 = new MovieTicketClient(movieTicketServer, "Sam", 3);
    Thread t4 = new MovieTicketClient(movieTicketServer, "Andreas", 4);

    t1.start();
    t2.start();
    t3.start();
    t4.start();

      try {
        t1.wait();
        t2.wait();
        t3.wait();
        t4.wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
  }
}

