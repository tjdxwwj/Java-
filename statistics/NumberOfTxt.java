package statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOfTxt {
	
	HashMap<String,Integer> Count(String str2) {
	HashMap<String,Integer>map=new HashMap<>();
	String str[]=str2.split("\\s+");
    for(int i=0;i<str.length;i++)
    {
    	if(str[i].length()>0)
    	{
	    	if(map.containsKey(str[i]))
	    	{
	        	map.put(str[i], map.get(str[i])+1);
	        }
	        else
	        	map.put(str[i], 1);
    	}
    }
  
    return map;
//    for(Entry<String, Integer> entry :map.entrySet()){
//        System.out.println(entry.getKey()+"="+entry.getValue());
//    }
}
	
}
