package com.ocucs.cac.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil 
{
	
	    HSSFWorkbook workbook;
	    HSSFSheet sheet;
	    
		public ExcelUtil(String filePath,int sheetNo)
		{
			try
			{
				FileInputStream fis = new FileInputStream(filePath);
				workbook = new HSSFWorkbook(fis);
				sheet = workbook.getSheetAt(sheetNo);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		public String getCellValue(int row, int col)
		{
			HSSFRow rowObj = sheet.getRow(row);
			HSSFCell cell = rowObj.getCell(col);
			return cell.toString();
		}
		
		
		public int getNumberOfRows()
		{
			int count = sheet.getLastRowNum();
			return count;
		}
}
