package statistics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader
public class BufferR implements Read {
     public String Result(File file) throws Exception
     {
    	 String str=null;
    	 if (!file.exists()) {
 			throw new NoFileException();
 		}
 		else
 		{
    	 	FileReader reader = new FileReader(file);
    	 	StringBuilder sb=new StringBuilder();
			BufferedReader br = new BufferedReader(reader); 
			String ss=null;
			
			while ((ss=br.readLine())!= null) { 
					sb.append(ss);
					sb.append(" ");
			}
			str=sb.toString();
			reader.close();
			br.close();
		}
    	 return str;
     }
}
