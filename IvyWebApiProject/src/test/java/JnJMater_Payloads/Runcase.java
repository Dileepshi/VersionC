package JnJMater_Payloads;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Runcase {

		
		@Test
		public void testload() throws JsonProcessingException {
			String data =null;
			//JsonArray w = new JsonArray();
			fields it= new fields("10", "12", "5", "14", "14", "13", "1", "1", "1", "1", "1", "1", "1", "1");
			fields it1= new fields("10", "12", "5", "14", "14", "13", "1", "1", "1", "1", "1", "1", "1", "1");
			//w.add(it.toString());
			finalloadsalesreturn a = new finalloadsalesreturn(new fields[]{it,it1});
			ObjectMapper ob = new ObjectMapper(); 
			 data = ob.writerWithDefaultPrettyPrinter().writeValueAsString(a);
			
			System.out.print(data);
			
		}

	}


