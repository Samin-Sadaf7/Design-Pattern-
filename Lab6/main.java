public class main {
        public static void main(String[] args) {
            ShoppingCartFactory ShoppingCartFactory = new ShoppingCartFactory();
            BkashPaymentStrategy bkash = new BkashPaymentStrategy("01302869890");
            GiftWrapper giftWrapper  = new GiftWrapper(ShoppingCartFactory.CreateShoppingCart("Regular"));
            giftWrapper.addToCart("Gamsa");
            giftWrapper.checkOut(bkash);
        }
    
}
