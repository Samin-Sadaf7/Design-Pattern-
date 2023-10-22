package Lab7;

public class House implements VillageComponent {
    private String type;

    public House(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("House: " + type);
    }
}