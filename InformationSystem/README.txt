An Information System for Service Providers

	This project is created to implement a basic information system based on UML that prepared for OOP lecture. 
	It allows to add new GSM or Cable Providers and customer(s) to use their plans.
	Used everything UML includes, but it is extended by developer.
______________________________________________________________________________________________________________________________

How to import/setup/get ready to run

	Used Win10 and IntelliJ IDE 2020.3.2 version to develop.
	 I tried to open this project in Netbeans and Eclipse. Netbeans is not available to transfer all codes.
	
	We can use "Eclipse" with some changes:
		
	create new Java project -> while creating select " JAVASE-15" and use project folder as root for sources and class files.
	import "18011094" from Archive File
	add "JUnit 5" library
	add -> package t_18011094.src; line to all classes in the package of "t_18011094.src"

	add -> package t_18011094.src.test; line to all classes in the package of "t_18011094.src.test"

	//CableProviderTest
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertTrue;

	import org.junit.jupiter.api.Test;

	import t_18011094.src.CableProvider;
	import t_18011094.src.SubscriptionPlan;


	//ExistingCustomerTest
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertTrue;
	
	import org.junit.jupiter.api.Test;

	import t_18011094.src.CableProvider;
	import t_18011094.src.ExistingCustomer;
	import t_18011094.src.PossibleCustomer;
	import t_18011094.src.Subscription;
	import t_18011094.src.SubscriptionPlan;


	//GSMProviderTest
	import static org.junit.jupiter.api.Assertions.*;
	

	There is second way to use eclipse or netbeans, 
	-> create empty classes with same names, 
	-> copy class codes one by one in the */src file 
	-----------------------------------------------
	
	****On the other hand, i recommend to download IntelliJ to compile and run properly all the files and tests.****
	

	Used JUnit5 library, Date library, SimpleDateFormat and ParseException.
_______________________________________________________________________________________________________________________________
Usage of project

      *Choose service provider*
 	 After start program, you will see the section that created to choose GSM or Cable as your provider.

                  Which provider you prefer to add: 
                  1) GSM Service Provider 
                  2) Cable Service Provider
                  3) Quit program:

	 If you choose 2 as input the program will direct you to this section:

  	Enter a name of Cable Provider: 

  	I will provide my custom inputs for instructions and will be testing other possible inputs.
  	So let's continue with prepared inputs.

  	Enter a name of Cable Provider: KabloNet
  	Enter number of subscription plans: 4
  	Enter new subscription plan: 15mbps
  	Enter new subscription plan: 20mbps
  	Enter new subscription plan: 25mbps
 	Enter new subscription plan: 30mbps

	After this section, program is ready for adding new customer to Provider we just entered.
  ________________________________________________________________________________________________________________________
  
        *Adding new Customer*

	/*There is extended feature that allows you to add customer more than one 
	*  and project covered more cases for customer such as phone number, mail etc.*/

	Enter number of how many customers you want to add: 2

	Enter customer citizenship number: 18011094
	Enter customer name: Toygar
	Enter phone number of customer: 5464162020
	Enter mail of customer: toygartanyel@hotmail.com

------> this section is important, added some features to handle unexpected plan input

	Enter name of the plan: 16mbps

	/* 16mbps is not available choice for our provider. Therefore, new input must be given.
	*Because of that reason, program makes easier to see what is available before user chooses.
	*
	*This screen appears in the wrong case:     */
	

	There is no plan named 16mbps
	15mbps KabloNet
	20mbps KabloNet
	25mbps KabloNet
	30mbps KabloNet
	Choose available one from above list: 15mbps //( available choice entered )
	
	Start date for subscription : 05/06/2021
	
	This loop will continue until reaching the number you gave as number of customer.
	Enter customer citizenship number: 19011094
	Enter customer name: Veli
	Enter phone number of customer: 5435002020
	Enter mail of customer: veli@gmail.com
	Enter name of the plan: 30mbps
	Start date for subscription : 06/05/2021

	After the last input, the program will show the information is asked by project instructions. 
______________________________________________________________________________________________________________________________________
       *Display the information that is taken*
	
	/* Program will be asking you which customer's information should seen */
	/* It is not depend on what is given as inputs momentarily. Program is saving all the 
	*  customers until you quit manually from "3) Quit in the menu"
	*  that means you can see every Existing Customer by their unique citizenshipnumber */

	Enter an id of customer that you want to see its information: 18011094

	CUSTOMER CITIZENSHIP NUMBER: 18011094
	CUSTOMER NAME: Toygar TEL: 5464162020 MAIL: toygartanyel@hotmail.com
	SERVICE PROVIDER: 4
	SUBSCRIPTION START DATE: Thu May 06 00:00:00 TRT 2021
	SUBSCRIPTION PLAN NAME: 15mbps
	
	Which provider you prefer to add: 
	1) GSM Service Provider 
	2) Cable Service Provider
	3) Quit program:

	There is no way to add same customer twice because their ids are unique.
	Choosing GSM has exactly same path with what is done above.
	
__________________________________________________________________________________________________________________________________________
	TESTING OTHER POSSIBLE INPUTS

	Test inputs given by lecturer

	INPUTs

	Enter a name of GSM Service Provider: TURKCELL
	Enter number of subscription plans: 1
	Enter new subscription plan: 4GB
	Enter number of how many customers you want to add: 1
	Enter customer citizenship number: 32643509892
	Enter customer name: AHMET OZTURK
	Enter phone number of customer: 2124505454
	Enter mail of customer: @std.yildiz.edu.tr
	Enter name of the plan: 4GB
	Start date for subscription : 11/12/2013
	Enter an id of customer that you want to see its information: 32643509892


	OUTPUT

	CUSTOMER CITIZENSHIP NUMBER: 32643509892
	CUSTOMER NAME: AHMET OZTURK TEL: 2124505454 MAIL: @std.yildiz.edu.tr
	SERVICE PROVIDER: TURKCELL
	SUBSCRIPTION START DATE: Tue Nov 12 00:00:00 TRT 2013
	SUBSCRIPTION PLAN NAME: 4GB

________________________________________________________________________________________________________________________
THE LESSONS TAKEN FROM THE PROJECT
	
	Learned how objects work and communicate with each other.

	Thought new solutions to solve unexpected problems.

	Extended given program to improve clarity and flexibility while using.

	Figured out how inputs that is taken for same reason interact with ArrayList

	Improved written skills to explain a documentation of code.