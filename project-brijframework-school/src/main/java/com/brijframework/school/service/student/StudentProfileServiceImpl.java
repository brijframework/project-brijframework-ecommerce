package com.brijframework.school.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentProfileDTO;
import com.brijframework.school.domain.student.StudentProfile;
import com.brijframework.school.mapper.StudentDetailMapper;
import com.brijframework.school.repository.StudentProfileRepository;
import com.brijframework.school.service.comman.ReligionService;
import com.brijframework.school.service.location.AddressService;

@Service
public class StudentProfileServiceImpl implements StudentProfileService{

	@Autowired
	private StudentDetailMapper studentDetailMapper;
	
	@Autowired
	private StudentProfileRepository studentProfileRepository;
	
	@Autowired
	private ReligionService religionService;
	
	@Autowired
	private AddressService addressService;
	
	@Override
	public StudentProfile saveStudentProfile(StudentProfileDTO studentProfileDTO) {
		StudentProfile studentProfile = studentDetailMapper.getStudentProfile(studentProfileDTO);
		if(studentProfileDTO.getAddress()!=null) {
			studentProfile.setAddress(addressService.saveAddress(studentDetailMapper.getAddress(studentProfileDTO.getAddress())));
		}
		if(studentProfileDTO.getReligionId()!=null) {
			studentProfile.setReligion(religionService.saveReligion(studentDetailMapper.getReligion(studentProfileDTO.getReligionId())));
		}
		return studentProfileRepository.save(studentProfile);
	}
	
	
}
