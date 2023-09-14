public class InPersonTicketAdapter implements MovieTicketBooking{
        private InPersonTicketBooking inPersonTicketBooking;
        public InPersonTicketAdapter(InPersonTicketBooking inPersonBooking){
            this.inPersonTicketBooking = inPersonBooking;
        }
        @Override
        public void BookTicket ( String Movie){
            inPersonTicketBooking.bookInPersonTicket(Movie);
        }    
}
