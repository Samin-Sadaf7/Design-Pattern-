public class Main {
    public static void main(String[] args) {
        OnlineTicketBooking onlineBooking = new OnlineTicketBooking();
        InPersonTicketBooking inPersonBooking = new InPersonTicketBooking();
        OverThePhoneTicketBooking overThePhoneTicketBooking = new OverThePhoneTicketBooking();
        InPersonTicketAdapter inPersonTicketAdapter = new InPersonTicketAdapter(inPersonBooking);
        OverThePhoneAdapter overThePhoneAdapter = new OverThePhoneAdapter(overThePhoneTicketBooking);
        OnlineBookAdapter onlineBookAdapter = new OnlineBookAdapter(onlineBooking);

        onlineBookAdapter.BookTicket("Avengers"); 
        inPersonTicketAdapter.BookTicket("Nun");  
        overThePhoneAdapter.BookTicket("Jawan");    
    }
 }
