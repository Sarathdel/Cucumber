package com.framework.org.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class DataDriven {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\sarath kafir\\eclipse-workspace\\MavenProject\\target\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);

		/*
		 * Sheet sheetAt = wb.getSheetAt(0);
		 * 
		 * for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
		 * 
		 * Row row = sheetAt.getRow(i);
		 * 
		 * for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		 * 
		 * Cell cell = row.getCell(j);
		 * 
		 * org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
		 * 
		 * if (cellType.equals(cellType.STRING)) {
		 * 
		 * System.out.println(cell.getStringCellValue());
		 * 
		 * }else if (cellType.equals(cellType.NUMERIC)) {
		 * 
		 * double numericCellValue = cell.getNumericCellValue();
		 * 
		 * System.out.println(String.valueOf(numericCellValue)); } }
		 * 
		 * }
		 */

		// Sheet createSheet = wb.createSheet("Test dats");
		// Cell createCell =
		// createSheet.createRow(0).createCell(0).setCellValue("areavid");
		// createCell.setCellValue("Datas");
		// createCell.setCellValue("saratg");

//		Row createRow1 = createSheet.createRow(0);
//		Cell createCell1 = createRow1.createCell(0);
//		createCell1.setCellValue("asvhjad");
//		createRow1.createCell(1).setCellValue("saratgh");

		XSSFSheet sheet = (XSSFSheet) wb.getSheet("Sheet2");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("sarath");
		sheet.getRow(0).createCell(1).setCellValue("success");
		sheet.getRow(0).createCell(2).setCellValue("Araa");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("ertgtrkg");
		sheet.getRow(1).createCell(1).setCellValue("adksfnkb");
		sheet.getRow(1).createCell(2).setCellValue("cbxcvmfbn");
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("cuddalore");
		sheet.getRow(2).createCell(1).setCellValue("pondy");
		sheet.getRow(2).createCell(2).setCellValue("Delhi");
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Completed");

	}
}
