public class RegularShoppingCart implements ShoppingCart{
    @Override
    public void addToCart(String item){
        System.out.println(item + " is added to regular shopping cart") ;
    }
    @Override 
    public void checkOut(PaymentStrategy paymentStrategy){
        paymentStrategy.pay();
    }   
}
