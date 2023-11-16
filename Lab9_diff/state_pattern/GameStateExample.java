

public class GameStateExample {
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        enemy.attack();
        enemy.setState(new AttackState());
        enemy.attack();
        enemy.idle();
        enemy.defend();
        enemy.setState(new DefendState());
        enemy.defend();
    }
}
