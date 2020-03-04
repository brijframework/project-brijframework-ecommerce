package com.brijframework.useraccount.controller.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.useraccount.beans.rqrs.UserDocumentRequest;
import com.brijframework.useraccount.beans.rqrs.UserDocumentResponse;
import com.brijframework.useraccount.service.account.UserDocumentService;

@RestController
@RequestMapping("api/user/document")
public class UserDocumentController {
		
	@Autowired
	private UserDocumentService userRoleService;
	
	@PostMapping
	public UserDocumentResponse addUserDocumentDetail(@RequestBody UserDocumentRequest roleRequest) {
		return userRoleService.saveUserDocument(roleRequest);
	}
	
	@PutMapping
	public UserDocumentResponse updateUserDocumentDetail(@RequestBody UserDocumentRequest roleRequest) {
		return userRoleService.saveUserDocument(roleRequest);
	}
	
	@GetMapping
	public List<UserDocumentResponse> getUserDocumentDetailList() {
		return userRoleService.getUserDocumentList();
	}
	
	@GetMapping("{id}")
	public UserDocumentResponse getUserDocumentDetail(@PathVariable Long id) {
		return userRoleService.getUserDocument(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteUserDocumentDetail(@PathVariable Long id) {
		return userRoleService.deleteUserDocument(id);
	}
	
}
