package com.brijframework.school.service.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentContactDTO;
import com.brijframework.school.domain.student.StudentContact;
import com.brijframework.school.mapper.StudentContactMapper;
import com.brijframework.school.repository.ContactDetailRepository;
import com.brijframework.school.repository.StudentContactRepository;

@Service
public class StudentContactServiceImpl implements StudentContactService {

	@Autowired
	private StudentContactRepository studentContactRepository;
	
	@Autowired
	private ContactDetailRepository contactDetailRepository;
	
	@Autowired
	private StudentContactMapper studentContactMapper;
	
	@Override
	public StudentContactDTO saveStudentContact(Long studentDetailId, StudentContactDTO studentContactDTO) {
		StudentContact studentContact= studentContactMapper.toEntity(studentContactDTO);
		studentContact.setContactDetail(contactDetailRepository.save(studentContact.getContactDetail()));
		studentContact=studentContactRepository.save(studentContact);
		return studentContactMapper.toDTO(studentContact);
	}

	@Override
	public List<StudentContactDTO> getStudentContactList(Long studentDetailId) {
		Optional<List<StudentContact>> findByStudentDetailId = studentContactRepository.findByStudentProfileId(studentDetailId);
		List<StudentContactDTO> list=new ArrayList<StudentContactDTO>();
		if(!findByStudentDetailId.isPresent()) {
			return list;
		}
		for (StudentContact studentContact : findByStudentDetailId.get()) {
			list.add(studentContactMapper.toDTO(studentContact));
		}
		return list;
	}

	@Override
	public StudentContactDTO getStudentContact(Long studentDetailId, Long id) {
		return studentContactMapper.toDTO(studentContactRepository.findByStudentProfileIdAndId(studentDetailId,id));
	}

	@Override
	public boolean deleteStudentContact(Long studentDetailId, Long id) {
		StudentContact findByStudentDetailIdAndId = studentContactRepository.findByStudentProfileIdAndId(studentDetailId,id);
		if(findByStudentDetailIdAndId==null) {
			return false;
		}
		findByStudentDetailIdAndId.setActive(false);
		studentContactRepository.save(findByStudentDetailIdAndId);
		return true;
	}

}
