package Lab9;

public class InjuredState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Injured attack behavior");
    }

    @Override
    public void defend() {
        System.out.println("Injured defense behavior");
    }

    @Override
    public void move() {
        System.out.println("Injured movement behavior");
    }
}
