import java.util.Iterator;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscription;
public class SimUDuck {
     public static void main(String[] args) {

        DuckFactory duckFactory = new DuckFactory();
        Duck mallardDuck = duckFactory.createDuck("MallardDuck");
        Duck rubberDuck = duckFactory.createDuck("RubberDuck");
        Duck decoyDuck = duckFactory.createDuck("DecoyDuck");
        Duck gooseAdapter = duckFactory.createDuck("Goose");

        System.out.println("\n --- Ducks functionality display ----\n");
        
        mallardDuck.display();
        mallardDuck.swim();

        rubberDuck.display();
        rubberDuck.swim();

        decoyDuck.display();
        decoyDuck.swim();

        gooseAdapter.display();
        gooseAdapter.swim();

        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        QuackCounter quackableMallard = countingDuckFactory.createDuck("MallardDuck");
        QuackCounter quackableRedhead = countingDuckFactory.createDuck("RedheadDuck");
        QuackCounter quackableGoose = countingDuckFactory.createDuck("Goose");
        
        System.out.println("\n --- Counting Duck functionality display ----\n");
        
        quackableMallard.quack();
        quackableMallard.quack();
        quackableRedhead.quack();
        quackableGoose.quack();

        System.out.println("\n --- Flock functionality display ----\n");
        
        Flock duckFlock = new Flock();
        duckFlock.add(quackableMallard);
        duckFlock.add(quackableRedhead);
        duckFlock.quack();
        
        System.out.println("\n --- Flock in a big flock functionality display ----\n");
        
        Flock bigDuckFlock = new Flock();
        bigDuckFlock.add(duckFlock);
        bigDuckFlock.add(quackableMallard);
        bigDuckFlock.add(quackableGoose);
        Iterator<Quackable> iterator = bigDuckFlock.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
        
        System.out.println("\n---- Observer Pattern ----");
        DuckQuackObserver observer = new DuckQuackObserver();
        Publisher<Quackable> publisher = (subscriber) -> {
            subscriber.onSubscribe(new Subscription() {
                @Override
                public void request(long n) { }

                @Override
                public void cancel() {}
            });
            subscriber.onNext(quackableMallard);
            subscriber.onNext(quackableGoose);
            subscriber.onNext(quackableRedhead);
            subscriber.onComplete();
        };

        publisher.subscribe(observer);

    }
}
