package ReadJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class LoadFromURL 
{
	@Test
	public void testingTrail() {
	JSONParser parser = new JSONParser();
	try
	{
        Object object= parser.parse(new FileReader("C:\\Program Files\\Selenium\\Spring tool suite\\Code\\JSON\\src\\test\\java\\ReadJSON\\Test.json"));
        
        JSONObject jsonObject = (JSONObject) object;
        System.out.println(jsonObject);

        String name = (String) jsonObject.get("response");
        System.out.println(name);

       // long age = (Long) jsonObject.get("age");
        //System.out.println(age);


    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
     
    	
 
	}
}
}
	 

