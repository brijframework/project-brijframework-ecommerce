package com.brijframework.school.service;

import java.util.ArrayList;
import java.util.List;

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
	public StudentDocumentDTO saveStudentDocument(Long studentDetailId, StudentDocumentRequest student) {
		StudentDocument studentDocument = studentDocumentMapper.toEntity(student);
		studentDocument.setDocumentDetail(documentDetailRepository.save(studentDocument.getDocumentDetail()));
		studentDocument.setStudentDetail(studentDocumentMapper.getStudentDetail(studentDetailId));
		studentDocument=studentDocumentRepository.save(studentDocument);
		return studentDocumentMapper.toDTO(studentDocument);
	}

	@Override
	public List<StudentDocumentDTO> getStudentDocumentList(Long studentDetailId) {
		List<StudentDocumentDTO> list=new ArrayList<StudentDocumentDTO>();
		List<StudentDocument> findByStudentDetailList= studentDocumentRepository.findByStudentDetailId(studentDetailId);
		System.out.println("findByStudentDetailList="+findByStudentDetailList);
		for (StudentDocument studentDocument : findByStudentDetailList) {
			list.add(studentDocumentMapper.toDTO(studentDocument));
		}
		return list;
	}

	@Override
	public StudentDocumentDTO getStudentDocument(Long studentDetailId, Long id) {
		StudentDocument studentDocument = studentDocumentRepository.findByStudentDetailIdAndId(studentDetailId,id);
		return studentDocumentMapper.toDTO(studentDocument);
	}

	@Override
	public boolean deleteStudentDocument(Long studentDetailId, Long id) {
		StudentDocument studentDocument = studentDocumentRepository.findByStudentDetailIdAndId(studentDetailId,id);
		studentDocument.setActive(false);
		studentDocumentRepository.save(studentDocument);
		return true;
	}

}
