
package com.selenium.framework.base;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData
{
	public static String ExcelPath = "C:\\Users\\Kalyani\\Desktop\\DataInput.xlsx";
	//Method to read value from excel.
	public static String getValue(String sheet,int row,int column)
	{
		String v = "";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
			v = wb.getSheet(sheet).getRow(row).getCell(column).toString();
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		return v;
	}
	
	
}
