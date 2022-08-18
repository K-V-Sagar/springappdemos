package com.samples.S01SpringCoreDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {	
    	
    	// ******* Setter Injection ******
    	
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01SpringCoreDI/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp"); 
        System.out.println(emp);
    	
//    	Hospital hospital = (Hospital) springContainer.getBean("hospital");
//    	System.out.println(hospital);
    	
//      CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
//      System.out.println(dealer);
      
//      Customer customer = (Customer) springContainer.getBean("customer");
//      System.out.println(customer);
    	
//    	CountriesAndLanguages countries = (CountriesAndLanguages) springContainer.getBean("countries");
//    	System.out.println(countries);
    	
//    	Student student = (Student) springContainer.getBean("student");
//    	System.out.println(student);
    	
//    	ShoppingCart sc = (ShoppingCart) springContainer.getBean("shoppingcart");
//        System.out.println(sc);
    	
//    	AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
//    	Patient patient = (Patient) springContainer.getBean("patient");
//    	System.out.println(patient);
//    	springContainer.registerShutdownHook();
    	
    }
}
