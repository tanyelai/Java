import static org.junit.jupiter.api.Assertions.*;

class CableProviderTest {

    CableProvider aCP = new CableProvider("KabloNet");
    SubscriptionPlan plan1 = new SubscriptionPlan("8mbps");
    SubscriptionPlan plan2 = new SubscriptionPlan("16mbps");
    SubscriptionPlan plan3 = new SubscriptionPlan("24mbps");
    SubscriptionPlan plan4 = new SubscriptionPlan("35mbps");



    @org.junit.jupiter.api.Test
    void testIsAddingSubscriptionPlan() {
        aCP.addSubscriptionPlan(plan1);
        aCP.addSubscriptionPlan(plan2);
        aCP.addSubscriptionPlan(plan4);
        assertTrue(aCP.findSubscriptionPlan(plan1.getName()) != aCP.findSubscriptionPlan(plan2.getName()),
                "2 plan added and their names are different.");
        assertEquals("35mbps", aCP.findSubscriptionPlan(plan4.getName()).getName());
    }

    @org.junit.jupiter.api.Test
    void testFindPlan() {
        aCP.addSubscriptionPlan(plan1);
        aCP.addSubscriptionPlan(plan2);
        aCP.addSubscriptionPlan(plan3);
        aCP.addSubscriptionPlan(plan4);
        assertEquals(plan1, aCP.findSubscriptionPlan(plan1.getName()));
    }
}