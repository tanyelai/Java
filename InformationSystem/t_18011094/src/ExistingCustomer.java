import java.util.ArrayList;

public class ExistingCustomer extends Customer {
    private Subscription subscription;
    private ArrayList<Customer> Customers;

    public ExistingCustomer(String citizenshipNr, Subscription subscription) {
        super(citizenshipNr);
        this.subscription = subscription;
        Customers = new ArrayList<Customer>();
    }

    public ExistingCustomer(String citizenshipNr) {
        super(citizenshipNr);
        Customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer){
        Customers.add(customer);
    }

    public Customer findCustomer(String citizenshipNr){
        for( Customer customer : Customers )
            if( customer.getCitizenshipNr().compareTo(citizenshipNr) == 0 )
                return customer;
        return null;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
