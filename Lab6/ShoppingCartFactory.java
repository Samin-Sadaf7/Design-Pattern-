public class ShoppingCartFactory {
    public ShoppingCart CreateShoppingCart(String type){
        if(type=="Regular"){
            return new RegularShoppingCart();
        }
        else{
            return new VIPShoppingCart();
        }
    }    
}
