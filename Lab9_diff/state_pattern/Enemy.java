

public class Enemy {
    private EnemyState state;

    public Enemy() {
        this.state = new IdleState(); 
    }

    public void setState(EnemyState state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void idle() {
        state.idle();
    }
}
