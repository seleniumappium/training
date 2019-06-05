package com.wordpress.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil 
{
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	
			public ExcelUtil(String filePath,int sheetIndex)
			{
				try 
				{
					FileInputStream fis = new FileInputStream(filePath);
					workbook = new HSSFWorkbook(fis);
					sheet = workbook.getSheetAt(sheetIndex);
				}catch(Exception e) 
				{  
					e.printStackTrace(); 
				}
				
			}
			
			
			public String getCellValue(int rowIndex, int colIndex)
			{
				HSSFRow row = sheet.getRow(rowIndex);
				HSSFCell cell = row.getCell(colIndex);
				return cell.toString();
			}
			
			public int getNumberOfRows()
			{
				return sheet.getLastRowNum();
			}
}
