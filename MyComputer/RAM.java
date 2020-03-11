package MyComputer;

public abstract class RAM  {
	protected String name="RAM";
	protected double price;
	protected int volume;
	protected String sign;
	
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
