package ObjBen;
import java.util.*;
import ObjBen.CoffeeShop;
import ObjBen.MenuItem;
class Main
{
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args)
	{
		CoffeeShop tcs = new CoffeeShop("Tina's Shop", 10);
		MenuItem item = new MenuItem("Rice", "Food", 10.5);
		tcs.addToMenu(item);
		System.out.println(tcs.addOrder("hot cocoa"));
		System.out.println(tcs.dueAmount());
	}
}