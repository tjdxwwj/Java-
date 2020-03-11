package MyComputer;

public class SeagateHDD extends HDD{
	SeagateHDD (double price,int volume)
	{
		this.volume=volume;;
		this.price=price;
		this.sign="SeagateHDD";
	}
	
	public void work()
	{
		System.out.println(this.getName()+"work");
	}
}
