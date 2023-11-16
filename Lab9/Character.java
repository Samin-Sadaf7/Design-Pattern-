package Lab9;

public interface Character {
    public void setState(CharacterState state);
    public CharacterState getState();
    public void accept(CharacterVisitor visitor);
}
