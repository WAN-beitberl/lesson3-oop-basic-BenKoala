package ObjBen;
import java.util.*;
import ObjBen.CoffeeShop;
import ObjBen.MenuItem;
class Main
{
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args)
	{
		// Declare & Init Variables.
		CoffeeShop tcs = new CoffeeShop("Tina's Shop", 10);
		
		// Declare & Init Menu items.
		{
			MenuItem item1 = new MenuItem("Rice", "Food", 10.5);
			MenuItem item2 = new MenuItem("Pasta", "Food", 12.0);
			MenuItem item3 = new MenuItem("Coffee", "Drink", 3.6);
			MenuItem item4 = new MenuItem("Tea", "Drink", 4.3);
			tcs.addToMenu(item1);
			tcs.addToMenu(item2);
			tcs.addToMenu(item3);
			tcs.addToMenu(item4);
		}
		// Execute and display Object Methods.
		System.out.println(tcs.addOrder("hot cocoa"));
		System.out.println(tcs.addOrder("Rice"));
		System.out.println(tcs.addOrder("Tea"));
		System.out.println("Current total price of orders: "+tcs.dueAmount());
		System.out.println("Cheapest item on menu: "+tcs.cheapestItem());
		System.out.println("Food on Menu: "+tcs.foodOnly()[0]+", "+tcs.foodOnly()[1]);
		System.out.println("Drinks on Menu: "+tcs.drinksOnly()[0]+", "+tcs.drinksOnly()[1]);
	}
}