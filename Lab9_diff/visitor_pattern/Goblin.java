

public class Goblin extends Enemy{
    private int health = 50;

    @Override
    public void accept(EnemyVisitor visitor) {
        visitor.visitGoblin(this);
    }

    public void sneakAttack() {
        System.out.println("Goblin performs a sneak attack!");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Goblin takes " + damage + " damage. Health: " + health);
    }

    @Override
    public void move() {
        System.out.println("Goblin moves quickly!");
    }
}
