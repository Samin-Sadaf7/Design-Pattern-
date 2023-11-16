

public class Monster extends Enemy{
    private int health = 100;

    @Override
    public void accept(EnemyVisitor visitor) {
        visitor.visitMonster(this);
    }

    public void roar() {
        System.out.println("Monster roars!");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Monster takes " + damage + " damage. Health: " + health);
    }

    @Override
    public void move() {
        System.out.println("Monster moves forward!");
    }
}
