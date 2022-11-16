package ObjBen;
import ObjBen.MenuItem;
class CoffeeShop
{
	// Declare Properties.
	private String name;
	private ObjBen.MenuItem[] menu;
	private String[] orders;
	private int lastOrder;
	private int menuSize;
	private int lastItemMenu;
	
	// Constructor.
	public CoffeeShop(String name, int size)
	{
		this.name = name;
		this.menuSize = size;
		this.menu = new ObjBen.MenuItem[this.menuSize];
		this.orders = new String[100];
		this.lastOrder = 0;
		this.lastItemMenu = 0;
	}
	
	public void addToMenu(MenuItem item)
	{
		this.menu[this.lastItemMenu] = item;
		this.lastItemMenu++;
	}
	
	public String addOrder(String name)
	{
		int i;
		for(i = 0; i < this.lastItemMenu && !(this.menu[i].getName().equals(name)); i++);
		if(i == this.lastItemMenu)
			return "This item is currently unavailable!";
		this.orders[this.lastOrder] = name;
		this.lastOrder++;
		return name + " is in!";
	}
	
	public String fullfillOrder()
	{
		if(this.lastOrder == 0)
		{
			return "All orders have been fulfilled!";
		}
		this.lastOrder--;
		String name = this.orders[this.lastOrder];
		for(int i = 0; i < this.lastOrder; i++)
		{
			this.orders[i] = this.orders[i+1];
		}
		return "The" + name + "is ready!";
	}
	
	public String[] listOrder()
	{
		return this.orders;
	}
	
	public double dueAmount()
	{
		double sum = 0.0;
		int j;
		for(int i = 0; i < this.lastOrder; i++)
		{
			for(j = 0; j < this.lastItemMenu; j++)
			{
				if(this.menu[j].getName().equals(this.orders[i]))
				{
					break;
				}
			}
			sum += this.menu[j].getPrice();
		}
		return sum;
	}
	
	public String cheapestItem()
	{
		double minPrice = 1000.0;
		String minName = "Null?";
		for(int i = 0; i < this.lastItemMenu; i++)
		{
			if(this.menu[i].getPrice() < minPrice)
			{
				minPrice = this.menu[i].getPrice();
				minName = this.menu[i].getName();
			}
		}
		return minName;
	}
	
	public String[] drinksOnly()
	{
		int count = 0;
		for(int i = 0; i < this.lastItemMenu; i++)
		{
			if(this.menu[i].getType().equals("Drink"))
			{
				count++;
			}
		}
		String[] drinks = new String[count];
		count = 0;
		for(int i = 0; i < this.lastItemMenu; i++)
		{
			if(this.menu[i].getType().equals("Drink"))
			{
				drinks[count] = this.menu[i].getName();
				count++;
			}
		}
		return drinks;
	}
	
	public String[] foodOnly()
	{
		int count = 0;
		for(int i = 0; i < this.lastItemMenu; i++)
		{
			if(this.menu[i].getType().equals("Food"))
			{
				count++;
			}
		}
		String[] foods = new String[count];
		count = 0;
		for(int i = 0; i < this.lastItemMenu; i++)
		{
			if(this.menu[i].getType().equals("Food"))
			{
				foods[count] = this.menu[i].getName();
				count++;
			}
		}
		return foods;
	}
}