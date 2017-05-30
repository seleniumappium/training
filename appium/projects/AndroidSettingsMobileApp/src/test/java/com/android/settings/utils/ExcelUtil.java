package com.android.settings.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil {
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	
	String file;
	int sheetNumber;
	public ExcelUtil(String filepath,int sheetNo){
		file = filepath;
		sheetNumber = sheetNo;
		
		//Initalize the object
		try
		{
			FileInputStream fis = new FileInputStream(file);
			workbook = new HSSFWorkbook(fis);
			sheet = workbook.getSheetAt(sheetNo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String getCellValue(int rowNo,int colNo)
	{
		HSSFRow row = sheet.getRow(rowNo);
		HSSFCell cell = row.getCell(colNo);
		return cell.toString();
	}
	
	
	public int getNumberOfRows()
	{
		return sheet.getLastRowNum();
	}
	
}
