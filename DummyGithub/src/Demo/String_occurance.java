package Demo;

import java.util.HashMap;
import java.util.Set;



public class String_occurance 
{
	public static void main(String[] args) 
	{
		String org="Dipali Avani Arnav Dipali Avani Dipali  Avani Dipali";
		String []arr=org.split(" ");
		HashMap<String,Integer>mp=new HashMap<String,Integer>();
		for(int i=0;i<=arr.length-1;i++)
		{
			String s1=arr[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1,mp.get(s1)+1);
			}
			else
			{
				mp.put(s1,1);
			}
			
		}
		Set<String>allkeys=mp.keySet();
		
		for(String key:allkeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+":"+mp.get(key));
			}
		}
		System.out.println("Dipali:"+mp.get("Dipali"));
		
	}
}
