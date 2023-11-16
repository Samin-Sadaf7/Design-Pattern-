

public class Game {
    public static void main(String[] args) {

        Enemy[] enemies = { new Monster(), new Goblin(), new Dragon() };

        EnemyVisitor attackVisitor = new AttackVisitor();

        for (Enemy enemy : enemies) {
            enemy.accept(attackVisitor);
            enemy.move(); 
            System.out.println("----------");
        }
    }
}
