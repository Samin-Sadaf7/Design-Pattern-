public class SimUDuck {
    public static void main(String[] args) {
        // Creating DuckFactory and CountingDuckFactory instances
        DuckFactory duckFactory = new DuckFactory();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();

        // Creating individual ducks using DuckFactory
        Duck mallardDuck = duckFactory.createDuck("MallardDuck");
        Duck redheadDuck = duckFactory.createDuck("RedheadDuck");
        Duck rubberDuck = duckFactory.createDuck("RubberDuck");
        Duck gooseDuck = duckFactory.createDuck("Goose");
        Duck decoyDuck = duckFactory.createDuck("DecoyDuck");

        // Testing individual duck functionalities
        System.out.println("=== Individual Ducks ===");
        mallardDuck.display();
        mallardDuck.swim();

        redheadDuck.display();
        redheadDuck.swim();

        rubberDuck.display();
        rubberDuck.swim();

        gooseDuck.display();
        gooseDuck.swim();

        decoyDuck.display();
        decoyDuck.swim();

        // Creating counting ducks using CountingDuckFactory
        Quackable countedMallardDuck = countingDuckFactory.createDuck("MallardDuck");
        Quackable countedRedheadDuck = countingDuckFactory.createDuck("RedheadDuck");
        Quackable countedGooseDuck = countingDuckFactory.createDuck("Goose");
        Quackable countedDecoyDuck = countingDuckFactory.createDuck("DecoyDuck");

        System.out.println("\n=== Observing Quacks of the Ducks ===");
        QuackObserver observer1 = new QuackObserver(countedMallardDuck);
        QuackObserver observer2 = new QuackObserver(countedRedheadDuck);
        System.out.println("\n=== Adding Observer ===");
        countedMallardDuck.quack();
        countedRedheadDuck.quack();
        System.out.println("\n=== Removing Observer ===");
        countedMallardDuck.removeObserver(observer1);
        countedRedheadDuck.removeObserver(observer2);
        countedMallardDuck.quack();
        countedRedheadDuck.quack();
        
        // Testing counted duck functionalities
        System.out.println("\n=== Counted Ducks ===");
        countedMallardDuck.quack();
        countedMallardDuck.quack();
        countedRedheadDuck.quack();
        countedRedheadDuck.quack();
        countedRedheadDuck.quack();
        countedGooseDuck.quack();
        countedDecoyDuck.quack();

        System.out.println("\nNumber of quacks for MallardDuck: " + ((QuackCounter) countedMallardDuck).getQuacks());
        System.out.println("Number of quacks for RedheadDuck: " + ((QuackCounter) countedRedheadDuck).getQuacks());
        System.out.println("Number of quacks for GooseDuck: " + ((QuackCounter) countedGooseDuck).getQuacks());
        System.out.println("Number of quacks for DecoyDuck: " + ((QuackCounter) countedDecoyDuck).getQuacks());

        
        // Creating Flock and adding ducks
        Flock flock = new Flock();
        flock.add(countedMallardDuck);
        flock.add(countedRedheadDuck);
        flock.add(countedGooseDuck);
        flock.add(countedDecoyDuck);
        Flock bigFlock = new Flock();
        bigFlock.add(flock);
        bigFlock.add(countedMallardDuck);
        bigFlock.add(countedRedheadDuck);
        bigFlock.add(countedGooseDuck);
     
        
        System.out.println("\n=== Flock Quacking ===");
        flock.quack();
        System.out.println("\n=== Big Flock Quacking ===");
        bigFlock.quack();

    }
}
