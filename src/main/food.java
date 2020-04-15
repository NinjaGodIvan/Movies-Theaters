package main;

public class food {
	
	protected int costPopcorn = 4; //cost of popcorn
	protected int costHotDog = 3; //cost of hot dog
	protected int costDrink = 1; //cost of drink
	
	//function that returns the total amount of popcorn
	protected int getPopcorn(int val) {
		
		return costPopcorn * val;
	}
	
	//function that returns the total amount of hot dog
	protected int getHotDog(int val) {
		
		return costHotDog * val;
	}
	
	//function that returns the total amount of drink
	protected int getDrink(int val) {
		
		return costDrink * val;
	}
	
	//function that returns the total amount of food
	protected int totalFood(int p, int h, int d) {
		
		final int totalCost; //totalCost gets add up ONCE
		totalCost = (costPopcorn * p) + (costHotDog * h) + (costDrink * d);
		 
		return totalCost;
	}
	

}
