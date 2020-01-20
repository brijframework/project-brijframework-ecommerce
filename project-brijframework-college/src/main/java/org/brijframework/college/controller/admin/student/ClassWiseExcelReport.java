package org.brijframework.college.controller.admin.student;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.brijframework.college.models.dto.StudentDTO;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ClassWiseExcelReport extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String classes = "";
		@SuppressWarnings("unchecked")
		List<StudentDTO> list = (List<StudentDTO>) model.get("classWiseList");
		
		for (StudentDTO dto : list) {
			classes = dto.getClassName();

		}
		Sheet excelSheet = workbook.createSheet("ClassWise Student List of"+classes);
		excelSheet.setDefaultColumnWidth(30);
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);
		Row excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Roll No.");
		excelHeader.getCell(0).setCellStyle(style);
		excelHeader.createCell(1).setCellValue("Student Name");
		excelHeader.getCell(1).setCellStyle(style);
		excelHeader.createCell(2).setCellValue("Section");
		excelHeader.getCell(2).setCellStyle(style);
		excelHeader.createCell(3).setCellValue("Father's Name");
		excelHeader.getCell(3).setCellStyle(style);
		excelHeader.createCell(4).setCellValue("Mobile");
		excelHeader.getCell(4).setCellStyle(style);
		excelHeader.createCell(5).setCellValue("Address");
		excelHeader.getCell(5).setCellStyle(style);
		setExcelRows(excelSheet, list);
	}

	public void setExcelRows(Sheet excelSheet, List<StudentDTO> list) {
		int record = 1;
		for (StudentDTO dto : list) {
			Row excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(dto.getRollno());
			excelRow.createCell(1).setCellValue(
					dto.getFirstName() + " " + dto.getMiddleName() + " "
							+ dto.getLastName());
			excelRow.createCell(2).setCellValue(dto.getSectionName());
			excelRow.createCell(3).setCellValue(dto.getFatherName());
			excelRow.createCell(4).setCellValue(dto.getMobile());
			excelRow.createCell(5).setCellValue(dto.getAddressLine1());
		}
	}
}
