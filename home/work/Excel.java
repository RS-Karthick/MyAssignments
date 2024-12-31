package home.work;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	String fileLocation = "./testData/CreateLead.xlsx";
	XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
	
}
}
