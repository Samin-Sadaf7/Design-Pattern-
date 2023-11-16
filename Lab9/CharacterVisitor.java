package Lab9;

public interface CharacterVisitor {
    void visitWarrior(Warrior warrior);
    void visitMage(Mage mage);
    void visitArcher(Archer archer);
}
