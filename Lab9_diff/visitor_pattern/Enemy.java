

public abstract class Enemy {
    public abstract void accept(EnemyVisitor visitor);
    public abstract void takeDamage(int damage);
    public abstract void move();
    
} 