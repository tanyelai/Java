import static org.junit.jupiter.api.Assertions.*;

class GSMProviderTest {

    GSMProvider aGSM = new GSMProvider("TURKTELEKOM");
    SubscriptionPlan plan1 = new SubscriptionPlan("2GB");
    SubscriptionPlan plan2 = new SubscriptionPlan("4GB");
    SubscriptionPlan plan3 = new SubscriptionPlan("6GB");
    SubscriptionPlan plan4 = new SubscriptionPlan("10GB");



    @org.junit.jupiter.api.Test
    void testIsAddingSubscriptionPlan() {
        aGSM.addSubscriptionPlan(plan1);
        aGSM.addSubscriptionPlan(plan2);
        aGSM.addSubscriptionPlan(plan4);
        assertTrue(aGSM.findSubscriptionPlan(plan1.getName()) != aGSM.findSubscriptionPlan(plan2.getName()),
                "2 plan added and their names are different.");
        assertEquals("10GB", aGSM.findSubscriptionPlan(plan4.getName()).getName());
    }

    @org.junit.jupiter.api.Test
    void testFindPlan() {
        aGSM.addSubscriptionPlan(plan1);
        aGSM.addSubscriptionPlan(plan2);
        aGSM.addSubscriptionPlan(plan3);
        aGSM.addSubscriptionPlan(plan4);
        assertEquals(plan1, aGSM.findSubscriptionPlan(plan1.getName()));
    }

}