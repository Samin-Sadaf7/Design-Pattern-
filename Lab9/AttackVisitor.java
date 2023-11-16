package Lab9;

public class AttackVisitor implements CharacterVisitor{
    @Override
    public void visitWarrior(Warrior warrior) {
        warrior.attack();
    }

    @Override
    public void visitMage(Mage mage) {
        mage.attack();
    }

    @Override
    public void visitArcher(Archer archer) {
        archer.attack();
    }
}
