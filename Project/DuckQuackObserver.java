import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class DuckQuackObserver implements Subscriber<Quackable> {
    private Subscription subscription;

    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    public void onNext(Quackable duck) {
        System.out.println("quacked by " + duck );
        subscription.request(1);
    }

    public void onError(Throwable throwable) {
        System.err.println("An error occurred: " + throwable.getMessage());
    }

    public void onComplete() {
         System.out.println("Processing completed.");
    }
    public void unSubscribe(){
            if (subscription != null) {
                subscription.cancel(); 
                System.out.println("Observer unsubscribed.");
            }
    }
}


