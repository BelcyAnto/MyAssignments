package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{

 public static String[][] readData(String filename) throws IOException
  {
	//To open the Workbook
	XSSFWorkbook wb=new XSSFWorkbook("./Data/"+ filename + ".xlsx");
     
	//Locate the worksheet
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	//To count no of rows -without Header
	int rowCount=ws.getLastRowNum();
	System.out.println("The Row count is: "+rowCount);
	
	//To count no of rows -with Header
	int totalrowCount=ws.getPhysicalNumberOfRows();
	System.out.println("The TotalRow count is: "+totalrowCount);
	
	//To count the Column
	int columnCount= ws.getRow(0).getLastCellNum();
	System.out.println("The Column count is: "+columnCount);

	//To get Column data
	String cell1Value=ws.getRow(1).getCell(1).getStringCellValue();
	System.out.println("The cell1 value is: "+cell1Value);
	
	//To retrive the entire data
	String[][] data=new String[rowCount][columnCount];
	
	for (int i=1;i<=rowCount;i++)
	{
	 XSSFRow row=ws.getRow(i);
	 for (int j=0;j<columnCount;j++)
	 {
	  String allData= row.getCell(j).getStringCellValue();
	  data[i-1][j]=allData;
	  System.out.println("All Data are: "+allData);	  
	 }
	}
	
  
 // wb.close();
  return data;
}
}
