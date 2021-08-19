  package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/** 
 *
 * @author sangeetha
 
 */

public class Readfrompropfile {

	/**
	 * @author Sangeetha
	 * @param path
	 * @param key
	 * @return key value
	 * @throws IOException
	 */
public String readfrompropfile(String path ,String key) throws IOException
{
FileInputStream fis=new FileInputStream(path);	
Properties pobj=new Properties();
pobj.load(fis);
return pobj.getProperty(key);

}
	}


