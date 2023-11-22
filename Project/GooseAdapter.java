public class GooseAdapter extends Duck implements Quackable{
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose =goose;
    }
    @Override
    public void quack() {
            goose.honk();
    }
    @Override
    public void swim() {
            System.out.println("Goose is swimming!");
    }
    @Override
    public void display(){
            System.out.println("This is a goose!");
    } 
}
