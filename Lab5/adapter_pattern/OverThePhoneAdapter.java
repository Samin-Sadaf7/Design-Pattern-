public class OverThePhoneAdapter implements MovieTicketBooking{
    private OverThePhoneTicketBooking phoneBooking;

    public OverThePhoneAdapter (OverThePhoneTicketBooking phoneBooking){
        this.phoneBooking = phoneBooking;
    }

    @Override
    public void BookTicket(String movie){
        this.phoneBooking.bookOverPhoneTicket(movie);
    }
    
}
