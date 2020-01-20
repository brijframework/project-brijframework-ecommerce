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
import org.brijframework.college.models.dto.StudentAttendanceDTO;
import org.brijframework.college.models.dto.StudentDTO;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class AttendanceStudent extends AbstractXlsView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String month = "";
		String classes = "";
		String section = "";
		List<StudentDTO> list = (List<StudentDTO>) model.get("list");
		for (StudentDTO studentDTO : list) {
			month = studentDTO.getMonthName();
			classes = studentDTO.getClassName();
			section = studentDTO.getSectionName();
		}

		Sheet excelSheet = workbook
				.createSheet("Attendance Report for the Month of \"" + month
						+ "\" of Class \"" + classes + "\" of Section \""
						+ section + "\"");
		excelSheet.setDefaultColumnWidth(20);
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);
		Row excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Student Name");
		excelHeader.getCell(0).setCellStyle(style);
		excelHeader.createCell(1).setCellValue("Total Number Of Days");
		excelHeader.getCell(1).setCellStyle(style);
		excelHeader.createCell(2).setCellValue("Number Of Days Present");
		excelHeader.getCell(2).setCellStyle(style);
		excelHeader.createCell(3).setCellValue("Number Of Days Absent");
		excelHeader.getCell(3).setCellStyle(style);
		excelHeader.createCell(4).setCellValue("Number Of Days Late");
		excelHeader.getCell(4).setCellStyle(style);
		excelHeader.createCell(5).setCellValue("Number Of Days Leave");
		excelHeader.getCell(5).setCellStyle(style);
		excelHeader.createCell(6).setCellValue("% Of Attendance");
		excelHeader.getCell(6).setCellStyle(style);
		setExcelRows(excelSheet, list);
	}

	public void setExcelRows(Sheet excelSheet, List<StudentDTO> list) {
		int totalNoOfDays = 0;
		int noOfDaysPresent = 0;
		int noOfDaysAbsent = 0;
		int late = 0;
		int leave = 0;
		double percentageOfAttendance = 0.0;
		String name = "";
		int record = 1;
		for (StudentDTO studentDTO : list) {
			name = studentDTO.getFullName();
			for (StudentAttendanceDTO studentAttendanceDTO : studentDTO
					.getStudentAttendanceDTOs()) {
				totalNoOfDays = studentAttendanceDTO.getTotalAttendance();
				noOfDaysPresent = studentAttendanceDTO.getTotalPresent();
				noOfDaysAbsent = studentAttendanceDTO.getTotalAbsent();
				late = studentAttendanceDTO.getTotalLate();
				leave = studentAttendanceDTO.getTotalLeave();
				percentageOfAttendance = studentAttendanceDTO.getPercent();
			}

			Row excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(name);
			excelRow.createCell(1).setCellValue(totalNoOfDays);
			excelRow.createCell(2).setCellValue(noOfDaysPresent);
			excelRow.createCell(3).setCellValue(noOfDaysAbsent);
			excelRow.createCell(4).setCellValue(late);
			excelRow.createCell(5).setCellValue(leave);
			excelRow.createCell(5).setCellValue(percentageOfAttendance);
		}
	}
}
