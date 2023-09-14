public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    abstract void prepare();
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into slices");
    }
    void box() {
        System.out.println("Place pizza in a box");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}