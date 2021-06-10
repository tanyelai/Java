import java.util.ArrayList;

public class PossibleCustomer extends Customer {
    private Subscription subscription;

    public PossibleCustomer(String citizenshipNr, Subscription subscription) {
        super(citizenshipNr);
        this.subscription = subscription;
    }

    public PossibleCustomer(String citizenshipNr) {
        super(citizenshipNr);
    }


    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
