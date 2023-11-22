public class QuackObserver implements Observer{
    public QuackObserver(Quackable duck){
        duck.addObserver(this);
    }

    @Override
    public void update(Quackable duck){
        System.out.println("Observer located that: ");
        duck.quackSound();
    }
}