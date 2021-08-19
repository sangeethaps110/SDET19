package com.objectrepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.generic.ReadfromExcelsheets;

public class Trail extends ReadfromExcelsheets {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ReadfromExcelsheets ex=new ReadfromExcelsheets();
		String content=ex.readfromExcelSheet("Sheet1", 0, 0);
		System.out.println(content);
	}

}
