package MyComputer;

public class AsusMainboard extends mainboard{
	AsusMainboard(double price,int speed)
		{
			this.speed=speed;
			this.price=price;
			this.sign="Asus";
		}
		 public void work()
			{
				System.out.print(this.getName()+"work");
			}
}
