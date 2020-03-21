package statistics;

public class NoPermissions extends Exception{
	NoPermissions()
	{
		System.out.println("没有权限打开文件");
	}
}
