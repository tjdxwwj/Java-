package MyComputer;

import java.util.ArrayList;

public class ComputerStore {
	ArrayList computers;
	ComputerStore ()
	{
		computers=new ArrayList();
	}
	void Add(computer obj) throws Exception
	{
		if(computers.size()==3)
		{
			throw new Exception("������̨����");
		}
		for(int i=0;i<computers.size();i++)
		{
			computer computer=(computer) computers.get(i);
			if(new Rule1().isSame(obj, computer))
			{
				throw new Exception("�ظ�����");
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
			System.out.println("Price:"+computer.getPrice());
			computer.work();
			System.out.println();
		}
	}
}
