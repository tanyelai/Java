import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

class ExistingCustomerTest {

    ExistingCustomer EXIST = new ExistingCustomer("Null");
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    Date date1 = sdf.parse("06/12/2021");
    Date date2 = sdf.parse("07/12/2021");
    SubscriptionPlan plan1 = new SubscriptionPlan("2GB");
    SubscriptionPlan plan2 = new SubscriptionPlan("4GB");
    Subscription newSub1 = new Subscription(date1, plan1 );
    Subscription newSub2 = new Subscription(date2, plan2 );
    PossibleCustomer cust1 = new PossibleCustomer("18011094");
    PossibleCustomer cust2 = new PossibleCustomer("19011093", newSub1);
    PossibleCustomer cust3 = new PossibleCustomer("20011094");
    PossibleCustomer cust4 = new PossibleCustomer("19011093", newSub2);




    @org.junit.jupiter.api.Test
    void testIsAddedExistFromPossible() throws ParseException{
        EXIST.addCustomer(cust1);
        assertTrue(EXIST.findCustomer("18011094") == cust1,
                "It is added. ");
    }

    @org.junit.jupiter.api.Test
    void testFindSetGetCustomer() {

        EXIST.addCustomer(cust1);
        EXIST.addCustomer(cust2);
        EXIST.addCustomer(cust3);
        EXIST.addCustomer(cust4);
        cust3.setName("Veli");
        cust3.setMail("@gmail.com");
        EXIST.findCustomer("20011094").setName("Veli");
        EXIST.findCustomer("20011094").setMail("@gmail.com");

        assertEquals(cust4.getSubscriptionPlan(), EXIST.findCustomer("19011093").getSubscriptionPlan());
        assertEquals(cust3.getName(), EXIST.findCustomer("20011094").getName());
        assertEquals(cust3.getMail(), EXIST.findCustomer("20011094").getMail());

    }

    ExistingCustomerTest() throws ParseException {
    }

}