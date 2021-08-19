package commonprograms;

import java.io.IOException;

import org.dom4j.DocumentException;

import com.generic.ReadfromXmlfile;

public class Fetchingdatafromxmlfile extends ReadfromXmlfile{

	public static void main(String[] args) throws IOException, DocumentException {
		// TODO Auto-generated method stub
		String path="../SDET19/datafiles/xmlfile.xml";
		ReadfromXmlfile xml=new ReadfromXmlfile();
		System.out.println(xml.readfromxml(path, "//login/username"));
		
		
	}

}
