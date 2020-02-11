package com.brijframework.school.service.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.brijframework.school.bean.student.StudentFamilyContactDTO;
import com.brijframework.school.bean.student.StudentFamilyDTO;
import com.brijframework.school.bean.student.StudentFamilyQualificationDTO;
import com.brijframework.school.domain.student.StudentFamily;
import com.brijframework.school.domain.student.StudentFamilyContact;
import com.brijframework.school.domain.student.StudentFamilyQualification;
import com.brijframework.school.mapper.StudentFamilyMapper;
import com.brijframework.school.repository.ContactDetailRepository;
import com.brijframework.school.repository.StudentFamilyContactRepository;
import com.brijframework.school.repository.StudentFamilyQualificationRepository;
import com.brijframework.school.repository.StudentFamilyRepository;

@Service
public class StudentFamilyServiceImpl implements StudentFamilyService {
	
	@Autowired
	private StudentFamilyRepository studentFamilyRepository;
	
	@Autowired
	private ContactDetailRepository contactDetailRepository;
	
	@Autowired
	private StudentFamilyContactRepository studentFamilyContactRepository;
	
	@Autowired
	private StudentFamilyQualificationRepository studentFamilyQualificationRepository; 
	
	@Autowired
	private StudentFamilyMapper studentFamilyMapper;

	@Override
	public StudentFamilyDTO saveStudentFamily(StudentFamilyDTO studentFamilyDTO) {
		StudentFamily studentFamily=studentFamilyMapper.toEntity(studentFamilyDTO);
		studentFamily.setStudentDetail(studentFamilyMapper.toStudentDetail(studentFamilyDTO.getStudentDetailId()));
		studentFamily=studentFamilyRepository.save(studentFamily);
		
		if(!CollectionUtils.isEmpty(studentFamilyDTO.getFamilyContacts())) {
			for(StudentFamilyContactDTO studentFamilyContactDTO:studentFamilyDTO.getFamilyContacts()) {
				StudentFamilyContact studentFamilyContact = studentFamilyMapper.getFamilyContact(studentFamilyContactDTO);
				studentFamilyContact.setContactDetail(contactDetailRepository.save(studentFamilyContact.getContactDetail()));
				studentFamilyContact.setStudentFamily(studentFamily);
				studentFamilyContactRepository.save(studentFamilyContact);
			}
		}
		
		if(!CollectionUtils.isEmpty(studentFamilyDTO.getFamilyQualifications())) {
			for(StudentFamilyQualificationDTO studentFamilyQualificationDTO:studentFamilyDTO.getFamilyQualifications()) {
				StudentFamilyQualification studentFamilyQualification = studentFamilyMapper.getFamilyQualification(studentFamilyQualificationDTO);
				studentFamilyQualification.setStudentFamily(studentFamily);
				studentFamilyQualificationRepository.save(studentFamilyQualification);
			}
		}
		return studentFamilyMapper.toDTO(studentFamily);
	}

	@Override
	public List<StudentFamilyDTO> getStudentFamilyList(Long studentDetailId) {
		Optional<List<StudentFamily>> findByStudentDetailId = studentFamilyRepository.findByStudentDetailId(studentDetailId);
		List<StudentFamilyDTO> families=new ArrayList<StudentFamilyDTO>();
		if(!findByStudentDetailId.isPresent()) {
			return families;
		}
		for (StudentFamily studentFamily : findByStudentDetailId.get()) {
			families.add(studentFamilyMapper.toDTO(studentFamily));
		}
		return families;
	}

	@Override
	public StudentFamilyDTO getStudentFamily(Long id) {
		return studentFamilyMapper.toDTO(studentFamilyRepository.findById(id).get());
	}

	@Override
	public boolean deleteStudentFamily(Long id) {
		Optional<StudentFamily> findByStudentDetailIdAndId = studentFamilyRepository.findById(id);
		if(findByStudentDetailIdAndId.isPresent()) {
			findByStudentDetailIdAndId.get().setActive(false);
			studentFamilyRepository.save(findByStudentDetailIdAndId.get());
			return true;
		}
		return false;
	}

}
