

public class Dragon extends Enemy{
    private int health = 200;

    @Override
    public void accept(EnemyVisitor visitor) {
        visitor.visitDragon(this);
    }

    public void breatheFire() {
        System.out.println("Dragon breathes fire!");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Dragon takes " + damage + " damage. Health: " + health);
    }

    @Override
    public void move() {
        System.out.println("Dragon flies gracefully!");
    }
}
