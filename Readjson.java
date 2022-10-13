package readandwritejson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// using json-simple-1.1.1 -  com.googlecode.json-simple

public class Readjson {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		 JSONParser jsonParser = new JSONParser();
		
		try {
			FileReader fd=new FileReader("C:\\employeedetails.json");
			
			Object o = jsonParser.parse(fd);
			JSONArray arr = (JSONArray) o;
			
			arr.forEach(employee -> parseJsonFile((JSONObject)employee));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void parseJsonFile(JSONObject emp) {
		
		JSONObject employee = (JSONObject) emp.get("employee");
		
		String fname = (String) employee.get("firstname");
		String sname = (String) employee.get("Surname");
		String role = (String) employee.get("Role");
		
		System.out.println(fname+" "+sname+" "+role);
	}

}
