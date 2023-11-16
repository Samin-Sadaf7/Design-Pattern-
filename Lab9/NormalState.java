package Lab9;

public class NormalState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Normal attack behavior");
    }

    @Override
    public void defend() {
        System.out.println("Normal defense behavior");
    }

    @Override
    public void move() {
        System.out.println("Normal movement behavior");
    }
}
