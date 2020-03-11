package MyComputer;

public abstract class HDD {
	protected String name="HDD";
	protected double price;
	protected String sign;
	protected int volume;
	
	public double getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public String getSign()
	{
		return sign;
	}
	public abstract void work();
	
}
