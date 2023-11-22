public class QuackCounter extends QuackableBeing{
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
        notifyObservers();
        System.out.println("it has quacked  "+ this.numberOfQuacks+ "times");
    }

    public int getQuacks() {
        return this.numberOfQuacks;
    }
    @Override
    public void quackSound(){
        System.out.println("Mallard is sounding Quack Quack!");
    }
}
