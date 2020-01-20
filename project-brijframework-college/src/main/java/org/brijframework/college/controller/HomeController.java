package org.brijframework.college.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.brijframework.college.common.constant.CommonConstants;
import org.brijframework.college.models.dto.FeecategoryAmountDTO;
import org.brijframework.college.models.dto.StudentClassesDTO;
import org.brijframework.college.service.AssignClassService;
import org.brijframework.college.service.SessionService;
import org.brijframework.college.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	UserService userService;
	@Autowired
	private AssignClassService assignClassService;
	@Autowired
	SessionService sessionService;


	@RequestMapping(value = { "/admin/home" }, method = RequestMethod.GET)
	public String adminHome(HttpServletRequest request, ModelMap model,
			@RequestParam(defaultValue = "0", required = false) String msg) {
		
		logger.info("admin home");
		HttpSession session = request.getSession();
		session.setAttribute("active", "home");
		model.addAttribute("FeecategoryAmountDTO", new FeecategoryAmountDTO());
		model.addAttribute("current", sessionService.findCurrent());
		model.addAttribute("msg", msg);
		return "adminhome";
	}

	@RequestMapping(value = { "/branch/branchhome" }, method = RequestMethod.GET)
	public String branchHome(HttpServletRequest request, ModelMap model,
			@RequestParam(defaultValue = "0", required = false) String msg) {
		HttpSession session = request.getSession();
		session.setAttribute("active", "home");
		model.addAttribute("FeecategoryAmountDTO", new FeecategoryAmountDTO());
		model.addAttribute("current", sessionService.findCurrent());
		model.addAttribute("msg", msg);
		return "branchhome";
	}

	@RequestMapping(value = { "/student/home" }, method = RequestMethod.GET)
	public String userHome() {
		return "studenthome";
	}

	@RequestMapping(value = { "/employee/home" }, method = RequestMethod.GET)
	public String businessHome(ModelMap model, HttpServletRequest request,
			@RequestParam(defaultValue = "0", required = false) String msg) {
		HttpSession session = request.getSession();
		Integer EmpId = (Integer) session.getAttribute(CommonConstants.EMPLOYER_ID);
		model.addAttribute("EMPLOYER_id", EmpId);
		model.addAttribute("current", sessionService.findCurrent());
		model.addAttribute("msg", msg);
		StudentClassesDTO studentClassesDTO = assignClassService.getAssignClassAndSection(EmpId);
		if (studentClassesDTO == null) {
		} else {
			session.setAttribute("assigned", "yes");
		}

		return "employeehome";
	}

	@RequestMapping(value = { "/modeler/home" }, method = RequestMethod.GET)
	public String modelerHome() {
		return "modelerhome";
	}

	@RequestMapping(value = "/employee/logout", method = RequestMethod.GET)
	public String logout(ModelMap model, HttpServletRequest request) {
		request.getSession().invalidate();
		return null;

	}

	@RequestMapping(value = { "/admin/dashboard" }, method = RequestMethod.GET)
	public String dashboard(ModelMap model) {
		return "dashboard";
	}

	@RequestMapping(value = "/admin/send-sms", method = RequestMethod.GET)
	public String sendSMS(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * String userName = "9811973900"; String pwd = "hariom"; String toMobile =
		 * "9811973900"; String msg = "Hello+This+Is+Testing+message";
		 * SMS.sendMySMS("https://site2sms.p.mashape.com/index.php?uid=" + userName +
		 * "&pwd=" + pwd + "&phone=" + toMobile + "&msg=" + msg);
		 */
		return "adminhome";

	}

	@RequestMapping(value = "/admin/sms", method = RequestMethod.GET)
	public String sMS(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "sms";

	}

}
