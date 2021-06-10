

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class InformationSystem {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        int n;
        String id;
        String isExist;

        /* We will use these classes in both cases
        *  so we declare them here as null to avoid errors
        *  during compilation
        *  I did initialize existingCustomer's constructor as "Empty" because we should avoid
        *  NullPointerException when try to find a first existing customer even there is none to compare with. */
        SubscriptionPlan aSubscriptionPlan = null;
        PossibleCustomer aCustomer = null;
        ExistingCustomer existingCustomer = new ExistingCustomer("Empty");

        /* I prepared a menu to cover more cases besides the main example
        *  We were only covering GSM Provider cases
        *
        *  There is an infinitive loop to choose and make GSM-Cable Provider and Customer addition
        */

        while(flag != 1){
            System.out.print("Which provider you prefer to add: \n1) GSM Service Provider \n2) Cable Service Provider\n3) Quit program:\n");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter a name of GSM Service Provider: ");
                    GSMProvider aGSMProvider = new GSMProvider(in.nextLine());
                    System.out.print("Enter number of subscription plans: ");
                    n = in.nextInt();

                    /* After getting integer input, the enter case will be taken as string input again
                    *  that lead to an unexpected error so to fix it we use in.nextLine() with declaring nowhere
                    *  it's working like buffer  */
                    in.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter new subscription plan: ");
                        aSubscriptionPlan = new SubscriptionPlan(in.nextLine(), aGSMProvider);
                        aGSMProvider.addSubscriptionPlan(aSubscriptionPlan);
                    }

                    /* I added this section to improve flexibility of code
                    *  This section gives a capability to add more than one customer at once for specific provider
                    *  And the important part of this, i use existingCustomer as database
                    *  that means we cannot add same id twice */
                    System.out.print("Enter number of how many customers you want to add: ");
                    n = in.nextInt();
                    in.nextLine();
                    /*        */
                    while (n>0){
                        System.out.print("Enter customer citizenship number: ");
                        isExist = in.nextLine();
                        if (existingCustomer.findCustomer(isExist) == null) {
                            aCustomer = new PossibleCustomer(isExist);
                            System.out.print("Enter customer name: ");
                            aCustomer.setName(in.nextLine());
                            System.out.print("Enter phone number of customer: ");
                            aCustomer.setTel(in.nextLine());
                            System.out.print("Enter mail of customer: ");
                            aCustomer.setMail(in.nextLine());

                            /* After we assigned all plans, we have arraylist to hold and call them anytime we want
                             *  This if block asks for a plan from our arraylist that declared before
                             *  If we choose from what we have at list we, assign it directly to PossibleCustomer
                             *  But if we cannot find the expected plan in the list, we show the available ones
                             *  from our list and let them choose one from specific choices
                             *  And at the end of the operations we start holding possibleCustomer as existingCustomer */
                            System.out.print("Enter name of the plan: ");
                            String GSMPlan = in.nextLine();
                            if (aGSMProvider.findSubscriptionPlan(GSMPlan) != null) {
                                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                                System.out.print("Start date for subscription : ");
                                Date date1 = sdf.parse(in.nextLine());
                                aCustomer.setSubscriptionPlan(aGSMProvider.findSubscriptionPlan(GSMPlan));
                                aCustomer.setSubscriptionStartDate(date1);
                            }
                            else {
                                System.out.println("There is no plan named " + GSMPlan);
                                aGSMProvider.showPlanList();
                                System.out.print("Choose available one from above list: ");
                                GSMPlan = in.nextLine();
                                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                                System.out.print("Start date for subscription : ");
                                Date date1 = sdf.parse(in.nextLine());
                                aCustomer.setSubscriptionPlan(aGSMProvider.findSubscriptionPlan(GSMPlan));
                                aCustomer.setSubscriptionStartDate(date1);
                            }
                            aCustomer.setGsmProvider(aGSMProvider);
                            existingCustomer.addCustomer(aCustomer);
                            n--;
                        }
                        else
                            System.out.println("This citizen is already exist as customer.");
                    }

                    /* As we covered before we have unique ids that means we can see the unique information that
                    *  chosen id has as existingCustomer */
                    System.out.print("Enter an id of customer that you want to see its information: ");
                    id = in.nextLine();
                    if(existingCustomer.findCustomer(id) != null){
                        System.out.println("CUSTOMER CITIZENSHIP NUMBER: " + existingCustomer.findCustomer(id).getCitizenshipNr());
                        System.out.println("CUSTOMER NAME: " + existingCustomer.findCustomer(id).getName() + " TEL: " + existingCustomer.findCustomer(id).getTel() + " MAIL: " + existingCustomer.findCustomer(id).getMail());
                        System.out.println("SERVICE PROVIDER: " + existingCustomer.findCustomer(id).getGsmProvider().getName());
                        System.out.println("SUBSCRIPTION START DATE: " + existingCustomer.findCustomer(id).getSubscriptionStartDate());
                        System.out.println("SUBSCRIPTION PLAN NAME: " + existingCustomer.findCustomer(id).getSubscriptionPlan().getName() + "\n");
                    }
                    else
                        System.out.println("There is no customer has this id." );

                    break;

                    ///////////////////////////////////////////////////////////////////////////////////////////
                    /* The second case is pretty much same with the first one
                    *  Only changes are names GSM to Cable*/
                case 2:
                    System.out.print("Enter a name of Cable Provider: ");
                    CableProvider aCableProvider = new CableProvider(in.nextLine());
                    System.out.print("Enter number of subscription plans: ");
                    n = in.nextInt();

                    in.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter new subscription plan: ");
                        aSubscriptionPlan = new SubscriptionPlan(in.nextLine(), aCableProvider);
                        aCableProvider.addSubscriptionPlan(aSubscriptionPlan);
                    }

                    System.out.print("Enter number of how many customers you want to add: ");
                    n = in.nextInt();
                    in.nextLine();
                    /*  We assign customer's citizenship number as unique id.
                    *   This allows us to find them easily after they are considered as existingCustomer     */
                    while (n>0){
                        System.out.print("Enter customer citizenship number: ");
                        isExist = in.nextLine();
                        if (existingCustomer.findCustomer(isExist) == null) {
                            aCustomer = new PossibleCustomer(isExist);
                            System.out.print("Enter customer name: ");
                            aCustomer.setName(in.nextLine());
                            System.out.print("Enter phone number of customer: ");
                            aCustomer.setTel(in.nextLine());
                            System.out.print("Enter mail of customer: ");
                            aCustomer.setMail(in.nextLine());

                            /* After we assigned all plans, we have arraylist to hold and call them anytime we want
                             *  This if block asks for a plan from our arraylist that declared before
                             *  If we choose from what we have at list we, assign it directly to newSub
                             *  But if we cannot find the expected plan in the list, we show the available ones
                             *  from our list and let them choose one from specific choices */
                            System.out.print("Enter name of the plan: ");
                            String cablePlan = in.nextLine();
                            if (aCableProvider.findSubscriptionPlan(cablePlan) != null) {
                                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                                System.out.print("Start date for subscription : ");
                                Date date1 = sdf.parse(in.nextLine());
                                aCustomer.setSubscriptionPlan(aCableProvider.findSubscriptionPlan(cablePlan));
                                aCustomer.setSubscriptionStartDate(date1);
                            }
                            else {
                                System.out.println("There is no plan named " + cablePlan);
                                aCableProvider.showPlanList();
                                System.out.print("Choose available one from above list: ");
                                cablePlan = in.nextLine();
                                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                                System.out.print("Start date for subscription : ");
                                Date date1 = sdf.parse(in.nextLine());
                                aCustomer.setSubscriptionPlan(aCableProvider.findSubscriptionPlan(cablePlan));
                                aCustomer.setSubscriptionStartDate(date1);
                            }
                            aCustomer.setCableProvider(aCableProvider);
                            existingCustomer.addCustomer(aCustomer);
                            n--;
                        }
                        else
                            System.out.println("This citizen is already exist as customer.");
                    }

                    System.out.print("Enter an id of customer that you want to see its information: ");
                    id = in.nextLine();
                    if(existingCustomer.findCustomer(id) != null){
                        System.out.println("CUSTOMER CITIZENSHIP NUMBER: " + existingCustomer.findCustomer(id).getCitizenshipNr());
                        System.out.println("CUSTOMER NAME: " + existingCustomer.findCustomer(id).getName() + " TEL: " + existingCustomer.findCustomer(id).getTel() + " MAIL: " + existingCustomer.findCustomer(id).getMail());
                        System.out.println("SERVICE PROVIDER: " + existingCustomer.findCustomer(id).getCableProvider().getName());
                        System.out.println("SUBSCRIPTION START DATE: " + existingCustomer.findCustomer(id).getSubscriptionStartDate());
                        System.out.println("SUBSCRIPTION PLAN NAME: " + existingCustomer.findCustomer(id).getSubscriptionPlan().getName() + "\n");
                    }
                    else
                        System.out.println("There is no customer has this id." );
                    break;

                case 3:
                    flag = 1;
                    break;

            }
        }
    }
}