public class BkashPaymentStrategy implements PaymentStrategy {
        private String phone;
        public BkashPaymentStrategy(String phone){
            this.phone = phone;
        }
        @Override
        public void pay(){
            System.out.println("The amount is transacted via Bkash to :"+ this.phone);
        }
}
