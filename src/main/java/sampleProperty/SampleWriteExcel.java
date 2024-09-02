package sampleProperty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericProperty.IconstantUtility;

public class SampleWriteExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("angrybird");
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelpath);
		book.write(fos);		
	}

}
