/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tests the Passenger class by constructing Passenger objects and calling Passenger methods
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.*;

class GuestTester{
   public static void main(String[] args){

		Guest = new GuestA();
							

		System.out.println(guest);
					

		GuestA.setName(new Name("Ms","Lisa","Simpson"));
		GuestA.setDateOfBirth(new Date(1,6,1990));
		
		(false);				
							

		System.out.println(GuestA);
					
	  
	   Guest GuestB = new Guest(new Name("Mr","Bart","Simpson"),
				                               new Date(15,7,1987),
				                               1,
				                               false);
							

		System.out.println(GuestB);

		Guest passengerC = new Guest(new Name("Mr","Homer","Simpson"), 
                                           new Date(25,10,1965),
                                           2,
                                           true);
					

		if(GuestA.equals(GuestB))
		   System.out.println(GuestA + " is the same Guest as " + GuestB);
		else
		   System.out.println(GuestA + " is not the same passenger as " + passengerB);
					
	
		if(GuestA.getName().isFemale())		// OR	if(personA.isFemale()==true)
		   System.out.println(GuestA + " is female.");			
		else
		   System.out.println(passengerA + " is male.");	
							
		// Create an ArrayList of Passenger objects called passengers
	   ArrayList<Guest> guests = new ArrayList<Guest>();
		// Add 4 Passenger objects to names
	   guests.add(new Guest(new Name("Mrs","Marge","Simpson"),new Date(18,12,1968),4,true));	   
	   guests.add(GuestA);
	   guests.add(GuestB);
	   guests.add(GuestC);	   
		// trim the capacity of names to be names current size
 		guests.trimToSize();	
							
		// print every element in passengers
		System.out.println("\nArrayList contains ==>");
	    for(Guest tempGuest:guests)
 	       System.out.println(tempGuest);
	}
}
					
