package com.brijframework.school.service.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentRegistrationDTO;
import com.brijframework.school.domain.student.StudentRegistration;
import com.brijframework.school.mapper.StudentDetailMapper;
import com.brijframework.school.repository.StudentRegistrationRepository;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {


	@Autowired
	private StudentDetailMapper studentDetailMapper;
	
	@Autowired
	private StudentRegistrationRepository studentRegistrationRepository;
	
	@Autowired
	private StudentProfileService studentProfileService;
	
	@Override
	public StudentRegistrationDTO saveStudentRegistration(StudentRegistrationDTO studentDTO) {
		StudentRegistration studentRegistration = studentDetailMapper.toEntity(studentDTO);
		studentRegistration.setSchoolDetail(studentDetailMapper.getSchoolDetail(studentDTO.getSchoolDetailId()));
		studentRegistration.setStudentProfile(studentProfileService.saveStudentProfile(studentDTO.getStudentProfile()));
		studentRegistration=studentRegistrationRepository.save(studentRegistration);
		return studentDetailMapper.toDTO(studentRegistration);
	}

	@Override
	public boolean deleteStudentRegistration(Long id) {
		StudentRegistration studentRegistration = studentRegistrationRepository.findByActiveAndId(true, id);
		studentRegistration.setActive(false);
		studentRegistrationRepository.save(studentRegistration);
		return true;
	}

	@Override
	public StudentRegistrationDTO getStudentRegistration( Long id) {
		StudentRegistration studentRegistration = studentRegistrationRepository.findByActiveAndId(true, id);
		return studentDetailMapper.toDTO(studentRegistration);
	}

	@Override
	public List<StudentRegistrationDTO> getStudentRegistrationList(Long schoolId) {
		List<StudentRegistrationDTO> list=new ArrayList<StudentRegistrationDTO>();
		List<StudentRegistration> studentRegistrations = studentRegistrationRepository.findByActiveAndSchoolDetailId(true, schoolId);
		for (StudentRegistration studentRegistration : studentRegistrations) {
			list.add(studentDetailMapper.toDTO(studentRegistration));
		}
		return list;
	}

}
