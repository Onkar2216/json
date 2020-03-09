package json2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonReadMultipleObject 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		JSONParser parser=new JSONParser();
		FileReader file;
		try 
		{
			file = new FileReader("Departments.json");
			Object dept=parser.parse(file);
			JSONObject department=(JSONObject) dept;
			Set<String> key=department.keySet();
			for(String dept1: key)
			{
				JSONArray deptnames=(JSONArray) department.get(dept1);
				for(Object deptname:deptnames)
				{
					JSONObject departmentName= (JSONObject) deptname;
					Set<String>depart=departmentName.keySet();
					for(String deptartname:depart)
					{
						System.out.println("Department Name >> "+deptartname);
						JSONArray employeeDetails=(JSONArray) departmentName.get(deptartname);
						for(Object employees:employeeDetails)
						{
							JSONObject employee= (JSONObject) employees;
							Set<String> empnames=employee.keySet();
							for(String empname:empnames)
							{
								System.out.println("Employee >> "+empname);
								JSONObject employee1=(JSONObject) employee.get(empname);
								Set<String> empnames1=employee1.keySet();
								for(String empname1:empnames1)
								{
									String name=(String) employee1.get(empname1);
									System.out.println(empname1+" >> "+name);
								}
							}
							System.out.println();
						}
						System.out.println();
					}
				}
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
