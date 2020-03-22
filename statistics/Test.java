package statistics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) throws Exception {
				
		File file = new File("D:\\���صĶ���\\�˲���ĸǴı�Ӣ��.txt");
		File file2 = new File("D:\\���صĶ���\\output.txt");
		if (!file.exists()) {
			throw new NoFileException();
		}
		else
		{
			if(!file.canRead())
			{
				throw new NoPermissions();
			}
			else
			{
				StringBuilder sb=new StringBuilder();
				HashMap<String,Integer>map=new HashMap<>();
				file2.createNewFile();
				FileWriter fileWritter = new FileWriter(file2,true)	;	
				
/*		BufferedReader*/		
//				String result=new BufferR().Result(file);

				
				
/* 		InputStream	*/	
//				String result=new  InputStreamR().Result(file);

				

/*		Reader			*/
				String result=new ReaderR().Result(file);

				
				map=new NumberOfTxt().Count(result);
				
				 List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
				    //Ȼ��ͨ���Ƚ�����ʵ������
				    Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
				        //��������
				        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				            return -o1.getValue().compareTo(o2.getValue());
				        }
				    });
				    
			    for(Entry<String, Integer> mapping:list){ 
			    	String str=(mapping.getKey()+" "+mapping.getValue()); 
			    	//����
			    	str+="\r\n";
			    	fileWritter.write(str);
	              } 
	
	            fileWritter.close();

			}

		}
}
}
