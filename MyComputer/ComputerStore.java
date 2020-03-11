package MyComputer;

import java.util.ArrayList;

public class ComputerStore {
	ArrayList computers;
	void Add(computer obj) throws Exception
	{
		if(computers.size()==3)
		{
			throw new Exception("已有三台电脑");
		}
		for(int i=0;i<computers.size();i++)
		{
			computer computer=(computer) computers.get(i);
			if(new Rule1().isSame(obj, computer))
			{
				throw new Exception("重复错误");
			}
		}
		computers.add(obj);
	}
	public void description()
	{
		for(int i=0;i<computers.size();i++)
		{
			computer computer=(computer) computers.get(i);
			computer.description();
			System.out.println(computer.getPrice());
			computer.work();
		}
	}
}
