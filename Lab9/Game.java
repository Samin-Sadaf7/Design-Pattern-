package Lab9;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        Character mage = new Mage();
        Character archer = new Archer();

        CharacterVisitor attackVisitor = new AttackVisitor();

        warrior.accept(attackVisitor);
        mage.accept(attackVisitor);
        archer.accept(attackVisitor);
        warrior.setState(new InjuredState());
        warrior.accept(attackVisitor);
        
        warrior.setState(new DefeatedState());
    }
}
