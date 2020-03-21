package statistics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamR implements Read{
	public String Result(File file) throws Exception
	{
		String st=null;
		if (!file.exists()) {
			throw new NoFileException();
		}
		else
		{
			InputStream	is = new FileInputStream(file);	
			byte data[] = new byte[1024];
			 int n=0;
			while((n=is.read(data))!=-1)
			{
			    String w=new String(data,0,n);
			    st+=w;
			}
			is.close();			 
		}
		
		return st;
	
	}
}
