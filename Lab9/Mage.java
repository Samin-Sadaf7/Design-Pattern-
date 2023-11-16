package Lab9;

public class Mage implements Character {
    private CharacterState state;

    public Mage() {
        this.state = new NormalState();
    }

    @Override
    public void setState(CharacterState state) {
        this.state = state;
    }

    @Override
    public CharacterState getState() {
        return state;
    }

    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visitMage(this);
    }
    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void move() {
        state.move();
    }
}
