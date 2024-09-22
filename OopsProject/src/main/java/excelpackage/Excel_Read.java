package excelpackage;

import java.io.FileInputStream;//is a class used to read data from a file
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	static FileInputStream f;//globally declared; FileInputStream-class and f -object
	static XSSFWorkbook w; // to work with excel; i.e to read write and manipulate excel workbook;
	//it is associated with microsoft
	static XSSFSheet sh; //to work with excel sheet; it represents a single sheet within a excel workbook
	
public static String getStringData(int a, int b) throws IOException
{
	f=new FileInputStream("C:\\Users\\asus\\Documents\\Excelread.xlsx");
	w=new XSSFWorkbook(f);//open work book
	sh=w.getSheet("Sheet1");//open sheet in excel workbook
	Row r=sh.getRow(a);// row is a interface , sheet(row)
	Cell c=r.getCell(b);//cell is a interface
	return c.getStringCellValue();
		
}
public static String getIntegerData(int a, int b) throws IOException {
	f=new FileInputStream("C:\\Users\\asus\\Documents\\Excelread.xlsx");
	w=new XSSFWorkbook(f);//open work book
	sh=w.getSheet("Sheet1");//open sheet in excel workbook
	Row r=sh.getRow(a);// row is a interface , sheet(row)
	Cell c=r.getCell(b);//cell is a interface
	int x= (int)c.getNumericCellValue();//type casting converting c into  integer and store in x
	return String.valueOf(x);

}
}