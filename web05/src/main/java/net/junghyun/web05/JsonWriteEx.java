package net.junghyun.web05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.json.simple.JSONObject;

public class JsonWriteEx {
	public void jsonIn(String uname, String age, String chari) {
		
		JSONObject obj = new JSONObject();
		obj.put("uname", uname);
		obj.put("age", age);
		obj.put("chari", chari);
		
		try {
			FileWriter writer = new FileWriter("c:/junghyun/json/data.json", true);
			writer.write(obj.toString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
