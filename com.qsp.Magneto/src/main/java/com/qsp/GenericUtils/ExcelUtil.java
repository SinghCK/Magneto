package com.qsp.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	public String readDataFromExcel(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		String value=WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}

}
