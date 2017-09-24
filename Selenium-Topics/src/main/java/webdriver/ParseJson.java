package webdriver;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParseJson {
	public static void main(String[] args){
		String sampleJson = "{\"name\":\"john\",\"age\":22,\"class\":\"mca\"}";
		JsonObject jObj = (JsonObject) new JsonParser().parse(sampleJson);
		System.out.println(jObj.get("age"));
		
	}
}
