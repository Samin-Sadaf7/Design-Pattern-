public class PaypalPaymentStrategy implements PaymentStrategy{
    private String Email;
    public PaypalPaymentStrategy(String Email){
            this.Email = Email;
    }
    @Override
    public void pay(){
        System.out.println("Paypal has transacted the amount :"+ this.Email);
    }
}
