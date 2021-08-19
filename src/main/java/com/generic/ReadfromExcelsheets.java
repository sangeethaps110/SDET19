package com.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromExcelsheets implements AutoConstants{
	/**
	 * @author Sangeetha
	
	 * @param path
	 * @param Sheetnum
	 * @param rownum
	 * @param cellnum
	 * @return StringCellValue
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readfromExcelSheet(String Sheetnum,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstants.excelSheetPath);
		Workbook workbook = WorkbookFactory.create(fis);
	
		
		//String content=	WorkbookFactory.create(fis).getSheet(Sheetnum).getRow(rownum).getCell(cellnum).getStringCellValue();
	
		String value = workbook.getSheet(Sheetnum).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		
		
	}
	}
