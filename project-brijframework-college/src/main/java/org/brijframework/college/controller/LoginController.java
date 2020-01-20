package org.brijframework.college.controller;

import java.security.Principal;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.brijframework.college.common.constant.CommonConstants;
import org.brijframework.college.common.constant.SessionConstants;
import org.brijframework.college.model.User;
import org.brijframework.college.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginWelcome(ModelMap model) {
		
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginFailed(HttpServletRequest request, ModelMap model) {
		if (request.getParameter("j_username") != null)
			logger.info("Login attempt failed for user: " + request.getParameter("j_username"));
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model, HttpServletRequest request) {
		request.getSession().invalidate();
		return "login";
	}


	@RequestMapping(value = { "/home" }, method = RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest httpServletRequest, Principal principal) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) auth.getAuthorities();
		String name = principal.getName();
		HttpSession session = httpServletRequest.getSession();
		session.setAttribute(CommonConstants.USER_NAME, name);
		User user = (User) session.getAttribute(SessionConstants.USER_INFO);
		if (user == null) {
			String userName = principal.getName();
			logger.info("Login attempt failed for user: " + userName + ". Loading user info in session");
			user = userService.getUserByUserName(userName);
			session.setAttribute(SessionConstants.USER_INFO, user);
			user.setLastLoginTime(new Date());
			userService.update(user);
		}
		String pageToForward = null;
		for (GrantedAuthority authority : authorities) {
			session.setAttribute(CommonConstants.ROLE, authority.getAuthority());
			if (authority.getAuthority().equalsIgnoreCase(CommonConstants.ROLE_ADMIN)) {
				pageToForward = "/admin/home";
				break;
			} else if (authority.getAuthority().equalsIgnoreCase(CommonConstants.ROLE_EMPLOYEE)) {
				session.setAttribute(CommonConstants.EMPLOYER_ID, user.getEmployees().getEmployeeId());
				pageToForward = "/employee/home";
				break;
			} else if (authority.getAuthority().equalsIgnoreCase(CommonConstants.ROLE_BRANCH)) {
				pageToForward = "/branch/branchhome";
				break;
			} else if (authority.getAuthority().equalsIgnoreCase(CommonConstants.ROLE_STUDENT)) {
				pageToForward = "/student/home";
				break;
			}
			else {
				pageToForward = "/user/homelogout";
			}
		}
		if (pageToForward == null) {
			pageToForward = "logout";
		}
		return "redirect:"+pageToForward;
	}
}
