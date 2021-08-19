package com.generic;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadfromXmlfile {
	
	public String readfromxml(String path,String key) throws DocumentException
	{

		File inputfile = new File(path);
		SAXReader reader = new SAXReader();
		Document doc = reader.read(inputfile);
		return doc.selectSingleNode(key).getText();
	
	}
}
