package json1;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JsonWrite {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JSONObject employeeDetails=new JSONObject();
		employeeDetails.put("Name","Onkar");
		employeeDetails.put("Location","Saswad");
		employeeDetails.put("Post","Software Developer");
		
		JSONObject  emoloyeeObject=new JSONObject();
		emoloyeeObject.put("Onkar", employeeDetails);
		
		JSONObject employeeDetails1=new JSONObject();
		employeeDetails1.put("Name","Suhas");
		employeeDetails1.put("Location","baner");
		employeeDetails1.put("Post","java Developer");
		
		JSONObject  emoloyeeObject1=new JSONObject();
		emoloyeeObject1.put("Suhas", employeeDetails1);
		
		JSONArray employees=new JSONArray();
		employees.add(emoloyeeObject);
		employees.add(emoloyeeObject1);
		
		JSONObject employee=new JSONObject();
		employee.put("Employee", employees);
		try 
		{
			FileWriter file=new FileWriter("Employee.json");
			file.write(employee.toString());
			System.out.println("Done");
			file.flush();
			file.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
