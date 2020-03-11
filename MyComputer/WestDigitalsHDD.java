package MyComputer;

public class WestDigitalsHDD extends HDD{
	WestDigitalsHDD (double price,int volume)
	{
		this.volume=volume;;
		this.price=price;
		this.sign="WestDigitals";
	}
	
	public void work()
	{
		System.out.print(this.getName()+"work");
	}
}
