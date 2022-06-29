package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availablePlaneSeats = 5;
		double costOfGroceries = 23.64;
		char middleInitial = 'A';
		boolean isHotOutside = false;
		String firstName = "James";
		String streetAddress = "123 Park Street";
		
		System.out.println("Available seats remaining: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries");
		System.out.println("Is it hot outside? " + isHotOutside);
		System.out.println(firstName + " " + middleInitial + " lives at " + streetAddress);
		
		//availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		middleInitial = 'J';
		System.out.println(middleInitial);
		
		//isHotOutside = true;
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		String fullName = firstName + " " + middleInitial + " Jones";
		System.out.println(fullName);
		
		System.out.println(fullName + " lives at " + streetAddress);
		
		System.out.println(fullName);

	}

}
