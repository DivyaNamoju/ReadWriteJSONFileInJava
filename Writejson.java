package readandwritejson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// using json-simple-1.1.1 -  com.googlecode.json-simple

public class Writejson {
	
	public static void main(String[] args) {
		
		JSONObject employeedetails = new JSONObject();
		employeedetails.put("firstname", "Divya");
		employeedetails.put("Surname", "Namoju");
		employeedetails.put("Role","QA Engineer");
		
		JSONObject emp1=new JSONObject();
		emp1.put("employee", employeedetails);
		
		JSONObject employeedetails2=new JSONObject();
		employeedetails2.put("firstname", "Kalyan");
		employeedetails2.put("Surname", "Dumpeti");
		employeedetails2.put("Role","Developer");
		
		JSONObject emp2=new JSONObject();
		emp2.put("employee", employeedetails2);
		
		JSONArray arr = new JSONArray();
		arr.add(emp1);
		arr.add(emp2);
		
		try {
			FileWriter fw=new FileWriter("C:\\employeedetails.json");
			fw.write(arr.toJSONString());
			fw.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("JSON file created");
		
		
	}

}
