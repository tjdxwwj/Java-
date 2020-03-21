package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderR implements Read{
	public String Result(File file) throws Exception
	{
		String st="";
		if (!file.exists()) {
			throw new NoFileException();
		}
		else
		{
			Reader in = new FileReader(file);
			char data[] = new char[1024];
			int temp = 0;
			int foot = 0;
			while((temp = in.read(data))!=-1) {
				String w=new String(data,0,temp);
			    st+=w;
			}
			in.close();
		} 
		
		return st;
		
	}
}
