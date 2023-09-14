public class OnlineBookAdapter implements MovieTicketBooking{
    private OnlineTicketBooking onlineBooking;
    public OnlineBookAdapter(OnlineTicketBooking onlineBooking){
        this.onlineBooking = onlineBooking;
    }
    @Override
    public void BookTicket(String movie) {
        onlineBooking.bookOnlineTicket(movie);
    }
}
