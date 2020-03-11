package MyComputer;

public abstract class mainboard {
	protected String name="mainboard";
	protected double price;
	protected String sign;
	protected int speed;
	
	public String getName()
	{
		return name;
	}
	public String getSign()
	{
		return sign;
	}
	public double getPrice()
	{
		return price;
	}
	public abstract void work();

}
