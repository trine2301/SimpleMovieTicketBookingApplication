# SimpleMovieTicketBookingApplication
Assignment 2 OS


With the above code in context, this is what you will need to do:

- [ ]  Accept *movie name* in the class constructor and store it as instance variables.
- [ ]  Accept *number of available seats* in the class constructor and store it as instance variables.
- [ ]  Implement the `bookTicket` method - This will be called by the users (`MovieTicketClient`).
    - [ ]  This function needs to accept the name of the user (we will use this information to show who is booking the tickets) and the number of tickets the user wants.
    - [ ]  Start by printing out the number of tickets available (Might seem useless but you’ll see why we need this when we get to Task 3). Eg:
      `System.out.println("Hi," + *customerName* + " : " + availableSeats + " : Seats available for " + movieName);`
    - [ ]  Then implement the `if` block. The idea is to check if the number of tickets needed exceeds the number of tickets available. If it is the case, `return`. Print a relevant message before you `return`. Eg:
      `System.out.println("Hi," + *customerName* + " : Seats not available for " + movieName);`
    - [ ]  Finally if we have enough tickets, deduct the number of tickets from the available number of tickets. Print a relevant message. Eg:
      `System.out.println("Hi," + *customerName* + " : " + *numberOfSeats* + " Seats booked successfully for" + movieName);`