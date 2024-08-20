package com.emreeker.dp.structural.adapter;

public class AdapterApplication {

	public static void main(String[] args) {
		OldXmlSystem oldXmlSystem = new OldXmlSystem();
		XmlToJsonAdapter adapter = new XmlToJsonAdapter(oldXmlSystem);
		String jsonData = "{\"key\": \"myKey\", \"value\": \"myValue\"}";
		adapter.sendJsonData(jsonData);
	}

}
