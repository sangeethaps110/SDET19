package commonprograms;

import java.io.IOException;

import com.generic.Readfrompropfile;

public class Fetchingdatafromprop extends Readfrompropfile{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="../SDET19/datafiles/commonutils.properties";
		Readfrompropfile prop=new Readfrompropfile();
		System.out.println(prop.readfrompropfile(path,"username"));
		
	}

}
