import java.util.ArrayList;

public class GSMProvider implements ServiceProvider {
    private String name;
    private ArrayList<SubscriptionPlan> subscriptionPlans;

    public GSMProvider(String name) {
        this.name = name;
        subscriptionPlans = new ArrayList<SubscriptionPlan>();
    }

    public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan){
        subscriptionPlans.add(subscriptionPlan);
    }


    public SubscriptionPlan findSubscriptionPlan(String name){
        for( SubscriptionPlan subscriptionPlan : subscriptionPlans )
            if( subscriptionPlan.getName().compareTo(name) == 0 )
                return subscriptionPlan;
        return null;
    }

    public void showPlanList(){
        for( SubscriptionPlan subscriptionPlan : subscriptionPlans )
            System.out.println(subscriptionPlan.getName()+ " " + subscriptionPlan.getServiceProvider().getName());
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
