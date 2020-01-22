package org.brijframework.college.controller.admin.student;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.brijframework.college.models.dto.GatePassDTO;
import org.brijframework.college.models.dto.StudentDTO;
import org.brijframework.college.service.GatePassService;
import org.brijframework.college.service.SectionService;
import org.brijframework.college.service.SessionService;
import org.brijframework.college.service.StudentClassesService;
import org.brijframework.college.service.StudentsAdmissionService;
import org.brijframework.college.util.GeneratePdfReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping({ "/admin/**", "/employee/**" ,"/branch/**"})
public class GatePassController {
	
	@Autowired
	StudentsAdmissionService admissionService;
	@Autowired
	StudentClassesService classService;
	@Autowired
	SectionService sectionService;
	@Autowired
	SessionService sessionService;
	@Autowired
	GatePassService gatePassService;
	
	@RequestMapping(value = "/generate-gatepass", method = RequestMethod.GET)
	public String showStudentdetails( Model model,
			HttpServletRequest request) {
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat tf=new SimpleDateFormat("h:mm a");
		model.addAttribute("gatePassDTO", new GatePassDTO());
		model.addAttribute("classList", classService.getAllClass());
		HttpSession session = request.getSession();
		session.setAttribute("active", "students");
	   model.addAttribute("sessionList", sessionService.findAllsession());
	   model.addAttribute("dates", df.format(new Date()));
	   model.addAttribute("times", tf.format(new Date()));
	   model.addAttribute("gpno", gatePassService.findGatePassNo());
		model.addAttribute("current", sessionService.findCurrent());
		
		return "gatepass";
	}
	@RequestMapping(value = "/get-student-admissionNo", method = RequestMethod.POST)
	public @ResponseBody
	String getSectionList(@RequestParam("studentId") Integer id,
			HttpServletRequest request) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		StudentDTO student=admissionService.findStudentData(id);
		return mapper.writeValueAsString(student.getAdmissionNo());
	}
	@RequestMapping(value = "/get-student-gatePass", method = RequestMethod.POST)
	public @ResponseBody
	String getStudentData(@RequestParam("id") Integer id,
			HttpServletRequest request) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		StudentDTO student=admissionService.findStudentDetails(id);
		return mapper.writeValueAsString(student);
	}
	@RequestMapping(value = "save-gatePass", method = RequestMethod.POST)
	public ResponseEntity<InputStreamResource> feePaymentSave(
			HttpServletRequest request,HttpServletResponse response,
			ModelMap model,
			@ModelAttribute("gatePassDTO") GatePassDTO gatePassDTO) {
		System.out.println("===============================Enter save-gatePass=====================================");
		/*
		 * try { model.addAttribute("GatePassDTO",
		 * gatePassService.generateGatePass(gatePassDTO)); model.addAttribute("Student"
		 * ,admissionService.findStudentDetails(gatePassDTO.getAdmissionNo())); }catch
		 * (Exception e) { e.printStackTrace(); } System.out.println(model);
		 */
		System.out.println("===============================Forword save-gatePass=====================================");
		ByteArrayInputStream bis = GeneratePdfReport.citiesReport(request,admissionService.findStudentDetails(gatePassDTO.getAdmissionNo()),gatePassService.generateGatePass(gatePassDTO));

		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));

	}
	
	@RequestMapping(value = "/get-previous-gatePass", method = RequestMethod.POST)
	public @ResponseBody
	String getPrevious(@RequestParam("id") Integer id,
			HttpServletRequest request) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<GatePassDTO> list=gatePassService.findPreviousDetailsbyId(id);
		return mapper.writeValueAsString(list);
	}
	@RequestMapping(value = "/check-gatePass", method = RequestMethod.GET)
	public String gatepassdetails( Model model,
			HttpServletRequest request) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		HttpSession session = request.getSession();
		session.setAttribute("active", "students");
	   model.addAttribute("today", df.format(new Date()));
	     return "checktodaygatepass";
	}
	@RequestMapping(value = "/gettodaygatepass", method = RequestMethod.POST)
	public @ResponseBody
	String getTodaygatepass(@RequestParam("dates") String dates,
			HttpServletRequest request) throws JsonProcessingException, ParseException {
		ObjectMapper mapper = new ObjectMapper();
		List<GatePassDTO> list=gatePassService.findDateWiseDetails(dates);
		return mapper.writeValueAsString(list);
	}

	@RequestMapping(value = "/gatepass-menu", method = RequestMethod.GET)
	public String showSetting(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("active", "students");
		return "gatepassmenu";
	}
}
