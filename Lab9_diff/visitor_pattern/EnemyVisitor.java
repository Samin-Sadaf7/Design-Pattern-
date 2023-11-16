

public interface EnemyVisitor {
    void visitMonster(Monster monster);
    void visitGoblin(Goblin goblin);
    void visitDragon(Dragon dragon);
}
