package main;
import java.util.Scanner;

//This class represents one admission 
public class movies {
	
	private int numAdults, numChildren; //number of children and adults
	private int adultTickets = 12; //cost of tickets for adults
	private int childTickets = 8; //cost of tickets for children
	private int adultTotal, childTotal; //total amount of children and adults
	
	//constructor that initializes numAdults and numChildren
	private movies(int a, int c) {
		
		numAdults = a;
		numChildren = c;
	}
	
	//function that returns total amount of adult tickets
	private int costAdults(int num) {
		
		adultTotal = numAdults * adultTickets;
		
		return adultTotal;
	}
	
	//function that returns total amount of child tickets
	private int costChildren(int num) {
		
		childTotal = numChildren * childTickets;
		
		return childTotal;
	}
	
	//returns the overall price
	private int grandTotal(int totalFood) {
		
		int grandPrice = adultTotal + childTotal + totalFood;
		
		return grandPrice;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the amount of adults ($12 per adult): ");
		int adults = in.nextInt();
		
		System.out.print("Enter the amount of children ($8 per child): ");
		int children = in.nextInt();
		
		movies movie = new movies(adults,children);
		
		System.out.println("1.Popcorn ($4)\n2.Hot Dog ($3)\n3.Fountain Drink ($1)");
		System.out.print("Enter the amount of popcorn: ");
		int popcorn = in.nextInt();
		System.out.print("Enter the amount of hot dog: ");
		int hotdog = in.nextInt();
		System.out.print("Enter the amount of drink: ");
		int drink = in.nextInt();
		
		food junkies = new food();
		
		int getFoodCost = junkies.totalFood(popcorn,hotdog,drink);
				
		System.out.println("RECEIPT:\n");
		System.out.println("Adults: $" + movie.adultTickets + " x " + movie.numAdults + " = $" + movie.costAdults(adults));
		System.out.println("Children: $" + movie.childTickets + " x " + movie.numChildren + " = $" + movie.costChildren(children));
		System.out.println("Popcorn: $" + junkies.costPopcorn + " x " + popcorn + " = $" + junkies.getPopcorn(popcorn));
		System.out.println("Hotdog: $" + junkies.costHotDog + " x " + hotdog + " = $" + junkies.getHotDog(hotdog));
		System.out.println("Drink: $" + junkies.costDrink + " x " + drink + " = $" + junkies.getDrink(drink));
		System.out.println("Total: $" + movie.grandTotal(getFoodCost) + "\n");
		System.out.print("Enjoy the movies!");
	}

}
