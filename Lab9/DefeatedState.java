package Lab9;

public class DefeatedState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Defeated attack behavior");
    }

    @Override
    public void defend() {
        System.out.println("Defeated defense behavior");
    }

    @Override
    public void move() {
        System.out.println("Defeated movement behavior");
    }
}
