package com.emreeker.dp.structural.adapter;

import org.json.JSONObject;

class XmlToJsonAdapter extends NewJsonSystem {
	private OldXmlSystem oldXmlSystem;

	public XmlToJsonAdapter(OldXmlSystem oldXmlSystem) {
		this.oldXmlSystem = oldXmlSystem;
	}

	@Override
	void sendJsonData(String json) {
		System.out.println("Json data "+json);
		String xml = convertJsonToXml(json);
		oldXmlSystem.sendXmlData(xml);
	}

	private String convertJsonToXml(String json) {
		JSONObject jsonObject = new JSONObject(json);
		String key = jsonObject.getString("key");
		String value = jsonObject.getString("value");
		
		return "<data> <"+key+">"+value+" <"+key+"></data>";
	}
}