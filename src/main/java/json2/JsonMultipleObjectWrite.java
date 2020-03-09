package json2;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonMultipleObjectWrite 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		JSONObject department=new JSONObject();
		
		JSONObject onkarDeatils=new JSONObject();
		onkarDeatils.put("Name", "Onkar Balasaheb Nimbalkar");
		onkarDeatils.put("Post", "Java Developer");
		onkarDeatils.put("Location", "KarveNagar");
		
		JSONObject onkar=new JSONObject();
		onkar.put("Onkar", onkarDeatils);
		
		JSONObject amarDeatils=new JSONObject();
		amarDeatils.put("Name", "Amar Babadev Kargal");
		amarDeatils.put("Post", "Android Developer");
		amarDeatils.put("Location", "Baner");
		
		JSONObject amar=new JSONObject();
		amar.put("Amar", amarDeatils);
		
		JSONObject SuhasDeatils=new JSONObject();
		SuhasDeatils.put("Name", "Suhas bhanudas bhame");
		SuhasDeatils.put("Post", "Java Developer");
		SuhasDeatils.put("Location", "Bhavdhan");
		
		JSONObject suhas=new JSONObject();
		suhas.put("Suhas", SuhasDeatils);
		
		JSONObject mayureshDetails=new JSONObject();
		mayureshDetails.put("Name", "Mayuresh Dattatray Anturkar");
		mayureshDetails.put("Post", "Web Developer");
		mayureshDetails.put("Location", "Viman Nagar");
		
		JSONObject mayuresh=new JSONObject();
		mayuresh.put("Mayuresh", mayureshDetails);
		
		JSONArray software=new JSONArray();
		software.add(onkar);
		software.add(suhas);
		
		JSONArray web=new JSONArray();
		web.add(amar);
		web.add(mayuresh);
		
		JSONObject software1=new JSONObject();
		software1.put("Software", software);
		
		JSONObject web1=new JSONObject();
		web1.put("Web", web);
		
		JSONArray department1=new JSONArray();
		department1.add(software1);
		department1.add(web1);
		
		JSONObject dept=new JSONObject();
		dept.put("Department", department1);
		
		try 
		{
			FileWriter file=new FileWriter("Departments.json");
			file.write(dept.toJSONString());
			file.flush();
			file.close();
			System.out.println("File Write Successfully...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
