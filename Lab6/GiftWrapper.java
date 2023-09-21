public class GiftWrapper implements ShoppingCart{
    ShoppingCart cart;
    public GiftWrapper(ShoppingCart cart){
        this.cart = cart; 
    }
    public void addGiftPayment(){
        System.out.println("extra amount is charged for the gift wrapping");
    }
    public void addGiftWrap(){
        System.out.println("the item is wrapped by gift wrapper ");
    }
    @Override
    public void addToCart(String item){
        cart.addToCart(item);
        this.addGiftWrap();
    }
    @Override 
    public void checkOut(PaymentStrategy payment){
        cart.checkOut(payment);
        this.addGiftPayment();
    }
}
