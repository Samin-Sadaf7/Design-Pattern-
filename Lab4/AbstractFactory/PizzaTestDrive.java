public class PizzaTestDrive {
    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Samin ordered a " + pizza.getName() + "\n");
        
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Zayed ordered a " + pizza.getName() + "\n");
    
    }
}