package MyComputer;

public abstract class CPU {
	protected String name="CPU";
	protected double price;
	protected int coreNum;
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
