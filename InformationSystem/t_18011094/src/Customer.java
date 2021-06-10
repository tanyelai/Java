import java.util.Date;

public abstract class Customer {
    private String CitizenshipNr, name, tel, mail;
    private Date SubscriptionStartDate;
    private SubscriptionPlan subscriptionPlan;
    private GSMProvider gsmProvider;
    private CableProvider cableProvider;

    public Customer(String citizenshipNr) { CitizenshipNr = citizenshipNr; }

    public String getCitizenshipNr() {
        return CitizenshipNr;
    }

    public void setCitizenshipNr(String citizenshipNr) {
        CitizenshipNr = citizenshipNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public GSMProvider getGsmProvider() {
        return gsmProvider;
    }

    public void setGsmProvider(GSMProvider gsmProvider) {
        this.gsmProvider = gsmProvider;
    }

    public CableProvider getCableProvider() {
        return cableProvider;
    }

    public void setCableProvider(CableProvider cableProvider) {
        this.cableProvider = cableProvider;
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

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
