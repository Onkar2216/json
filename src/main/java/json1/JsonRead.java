package json1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		try 
		{
			JSONParser parser=new JSONParser();
			FileReader file= new FileReader("Employee.json");
			Object obj=parser.parse(file);
			JSONObject employee=(JSONObject) obj;
			System.out.println(employee);
			System.out.println();
			Set<String> keys=employee.keySet();
			for(String key: keys)
			{
				JSONArray employees=(JSONArray) employee.get(key);
				for(Object obj1:employees)
				{
					
					JSONObject emp= (JSONObject)obj1;
					Set<String> keys1=emp.keySet();
					for(String key1:keys1)
					{
						System.out.println("Employee details >> "+key1);
						JSONObject obj2=(JSONObject)emp.get(key1);
						Set<String> keys2=obj2.keySet();
						for(String key2:keys2)
						{
							String name=(String) obj2.get(key2);
							System.out.println(key2+" >> "+name);
						}
						System.out.println();
					}
				}
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
