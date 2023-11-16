

public class IdleState implements EnemyState{
    @Override
    public void attack() {
        System.out.println("Cannot attack while idle.");
    }

    @Override
    public void defend() {
        System.out.println("Cannot defend while idle.");
    }

    @Override
    public void idle() {
        System.out.println("Already idle.");
    }
}
