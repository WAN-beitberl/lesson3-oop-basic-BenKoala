package ObjBen;
class MenuItem
{
	private String name;
	private String type;
	private double price;
	public MenuItem(String name, String type, double price)
	{
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "Name : " + this.name +
		"\tType : " + this.type + "\tPrice : "
		+ this.price;
	}
}
