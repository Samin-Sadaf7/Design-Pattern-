

public class AttackVisitor implements EnemyVisitor {
    @Override
    public void visitMonster(Monster monster) {
        System.out.println("Attacking the monster!");
        monster.takeDamage(20);
        monster.roar();
    }

    @Override
    public void visitGoblin(Goblin goblin) {
        System.out.println("Attacking the goblin!");
        goblin.takeDamage(15);
        goblin.sneakAttack();
    }

    @Override
    public void visitDragon(Dragon dragon) {
        System.out.println("Attacking the dragon!");
        dragon.takeDamage(30);
        dragon.breatheFire();
    }
}
