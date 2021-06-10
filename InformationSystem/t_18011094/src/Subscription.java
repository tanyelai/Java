import java.util.Date;

public class Subscription{
    private Date SubscriptionStartDate;
    private SubscriptionPlan subscriptionPlan;

    public Subscription(Date subscriptionStartDate, SubscriptionPlan subscriptionPlan) {
        SubscriptionStartDate = subscriptionStartDate;
        this.subscriptionPlan = subscriptionPlan;
    }

    public Date getSubscriptionStartDate() {
        return SubscriptionStartDate;
    }

    public void setSubscriptionStartDate(Date subscriptionStartDate) {
        SubscriptionStartDate = subscriptionStartDate;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

}
