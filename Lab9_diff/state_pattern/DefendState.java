

public class DefendState implements EnemyState{
    @Override
    public void attack() {
        System.out.println("Cannot attack while defending.");
    }

    @Override
    public void defend() {
        System.out.println("Already defending.");
    }

    @Override
    public void idle() {
        System.out.println("Switching to idle state.");
    }
}
