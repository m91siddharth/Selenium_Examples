package webdriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

		    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		    //Create an object of File class to open xlsx file
		    File file =    new File(filePath+"/"+fileName);
		    //Create an object of FileInputStream class to read excel file
		    FileInputStream inputStream = new FileInputStream(file);
		    Workbook Workbook = null;
		    //Find the file extension by splitting file name in substring  and getting only extension name
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
		    //Check condition if the file is xlsx file
		    if(fileExtensionName.equals(".xlsx")){
		    //If it is xlsx file then create object of XSSFWorkbook class
		    Workbook = new XSSFWorkbook(inputStream);
		    }
		    //Check condition if the file is xls file
		    //Read sheet inside the workbook by its name
		    Sheet Sheet = Workbook.getSheet(sheetName);
		    //Find number of rows in excel file
		    int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
		    //Create a loop over all the rows of excel file to read it
		    for (int i = 0; i < rowCount+1; i++) {
		        Row row = Sheet.getRow(i);
		        //Create a loop to print cell values in a row
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            //Print Excel data in console
		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
		        }
		        System.out.println();
		    }
		    }
		    
		    //Main function is calling readExcel function to read data from excel file
		    public static void main(String...strings) throws IOException{
		    //Create an object of ReadGuru99ExcelFile class
		    	ReadExcel objExcelFile = new ReadExcel();
		    //Prepare the path of excel file
		    String filePath = System.getProperty("user.dir")+"/src/main/java";
		    //Call read file method of the class to read data
		    objExcelFile.readExcel(filePath,"data.xlsx","read");
		    ///media/sid/62A2365FA236383D/work/Automation-Linux/Selenium-Topics/src/main/java

		    }

}
