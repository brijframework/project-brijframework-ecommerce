package com.brijframework.useraccount.controller.global;

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

import com.brijframework.useraccount.beans.rqrs.DocumentDetailRequest;
import com.brijframework.useraccount.beans.rqrs.DocumentDetailResponse;
import com.brijframework.useraccount.service.global.DocumentDetailService;

@RestController
@RequestMapping("api/global/document")
public class DocumentDetailController {

	@Autowired
	private DocumentDetailService documentDetailService;
	
	@PostMapping
	public DocumentDetailResponse addDocumentDetail(@RequestBody DocumentDetailRequest DocumentDetailRequest) {
		return documentDetailService.saveDocumentDetail(DocumentDetailRequest);
	}
	
	@PutMapping
	public DocumentDetailResponse updateDocumentDetail(@RequestBody DocumentDetailRequest DocumentDetailRequest) {
		return documentDetailService.saveDocumentDetail(DocumentDetailRequest);
	}
	
	@GetMapping("{id}")
	public DocumentDetailResponse getDocumentDetail(@PathVariable long id) {
		return documentDetailService.getDocumentDetail(id);
	}

	@GetMapping
	public List<DocumentDetailResponse> getDocumentDetailList() {
		return documentDetailService.getDocumentDetailList();
	}

	@DeleteMapping("{id}")
	public boolean deleteDocumentDetail(@PathVariable Long id) {
		return documentDetailService.deleteDocumentDetail(id);
	}
}
