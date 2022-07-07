package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a variable to hold the quantity of available plane seats left on a flight
				int availablePlaneSeats = 10;
				
				//create a variable to hold the cost of groceries at checkout
				double costOfGroceries = 23.64;
				
				//create a variable to hold a person's middle initial
				char middleInitial = 'J';
						
			
				//create a variable to hold true if it's hot outside and false if it's cold outside
				boolean isHotOutside = true;
				
				//create a variable to hold a customer's first name
				String customersFirstName = "Charlie";
				
				//create a variable to hold a street address
				String streetAddress = "123 Mary Lane Dr";
				
				//print all variables to the console
				System.out.println("Available seats on the planes: " + availablePlaneSeats); 
				System.out.println("The total costs of the groceries is: " + costOfGroceries);
				System.out.println("My middle initial is: " + middleInitial);
				System.out.println("It is hot outside - " + isHotOutside);
				System.out.println(customersFirstName + " is the customer's first name.");
				System.out.println("This person lives at: " + streetAddress);
				
				//a customer booked 2 plane seats, remove 2 seats from the available seats variable
				availablePlaneSeats -= 2;
				System.out.println(availablePlaneSeats);
				
				//impulse candy bar purchase, add 2.15 to the grocery total
				costOfGroceries = costOfGroceries + 2.15;
				System.out.println(costOfGroceries);
				
				//birth certificate was printed incorrectly, change the middle initial to something else
				middleInitial = 'A';
				System.out.println(middleInitial);
				
				//the season has changed, update the hot outside variable to be opposite of what it was
				isHotOutside = !isHotOutside;
				System.out.println(isHotOutside);
				
				//create a new variable called full name using the customer's first name, middle initial, and a last name of your choice
				String fullName = customersFirstName + " " + middleInitial + " Johnson";
				System.out.println(fullName);
				
				//print a line to the console that introduces the customer and says they live at the address variable
				System.out.println("Hi my name is " + fullName + " and I live at " + streetAddress);
	}

}
