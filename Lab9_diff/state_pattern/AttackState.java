

public class AttackState implements EnemyState{
    @Override
    public void attack() {
        System.out.println("Attacking the player!");
    }

    @Override
    public void defend() {
        System.out.println("Cannot defend while attacking.");
    }

    @Override
    public void idle() {
        System.out.println("Switching to idle state.");
    }
}
