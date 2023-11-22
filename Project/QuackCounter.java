public class QuackCounter implements Quackable{
    private Quackable duck;
    private int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.numberOfQuacks = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        this.numberOfQuacks = this.numberOfQuacks + 1;
        System.out.println("it has quacked  "+ this.numberOfQuacks+ "times");
    }

    public int getQuacks() {
        return this.numberOfQuacks;
    }
}
