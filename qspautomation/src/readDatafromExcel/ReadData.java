package readDatafromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh = wb.getSheet("CityTour");////go to specified sheet
		Row row = sh.getRow(1);//go to the specified row
		Cell cell = row.getCell(0);//go to specified column
		String data = cell.getStringCellValue();//get the data from the cell
		System.out.println(data);//print the data
	}

}
