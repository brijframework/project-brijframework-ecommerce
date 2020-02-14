package com.brijframework.school.service.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.domain.student.StudentDocument;
import com.brijframework.school.mapper.StudentDocumentMapper;
import com.brijframework.school.repository.DocumentDetailRepository;
import com.brijframework.school.repository.StudentDocumentRepository;

@Service
public class StudentDocumentServiceImpl implements StudentDocumentService {
	
	@Autowired
	private StudentDocumentMapper studentDocumentMapper;
	
	@Autowired
	private StudentDocumentRepository studentDocumentRepository;
	
	@Autowired
	private DocumentDetailRepository documentDetailRepository;

	@Override
	public StudentDocumentDTO saveStudentDocument(StudentDocumentRequest documentRequest) {
		StudentDocument studentDocument = studentDocumentMapper.toEntity(documentRequest);
		studentDocument.setDocumentDetail(documentDetailRepository.save(studentDocument.getDocumentDetail()));
		studentDocument.setStudentProfile(studentDocumentMapper.getStudentProfile(documentRequest.getStudentDetailId()));
		studentDocument=studentDocumentRepository.save(studentDocument);
		return studentDocumentMapper.toDTO(studentDocument);
	}
	


	@Override
	public List<StudentDocumentDTO> getStudentDocumentList(Long studentDetailId) {
		List<StudentDocumentDTO> list=new ArrayList<StudentDocumentDTO>();
		List<StudentDocument> findByStudentDetailList= studentDocumentRepository.findByStudentProfileId(studentDetailId);
		System.out.println("findByStudentDetailList="+findByStudentDetailList);
		for (StudentDocument studentDocument : findByStudentDetailList) {
			list.add(studentDocumentMapper.toDTO(studentDocument));
		}
		return list;
	}

	@Override
	public StudentDocumentDTO getStudentDocument(Long id) {
		Optional<StudentDocument> studentDocument = studentDocumentRepository.findById(id);
		if(!studentDocument.isPresent()) {
			return null;
		}
		return studentDocumentMapper.toDTO(studentDocument.get());
	}

	@Override
	public boolean deleteStudentDocument(Long id) {
		Optional<StudentDocument> studentDocument = studentDocumentRepository.findById(id);
		if(!studentDocument.isPresent()) {
			return false;
		}
		studentDocument.get().setActive(false);
		studentDocumentRepository.save(studentDocument.get());
		return true;
	}

}
