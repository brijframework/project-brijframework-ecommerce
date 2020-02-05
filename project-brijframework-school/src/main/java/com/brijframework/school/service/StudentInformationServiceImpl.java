package com.brijframework.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentInformationDTO;
import com.brijframework.school.domain.student.StudentInformation;
import com.brijframework.school.mapper.StudentDetailMapper;
import com.brijframework.school.repository.StudentInformationRepository;

@Service
public class StudentInformationServiceImpl implements StudentInformationService {


	@Autowired
	private StudentDetailMapper studentDetailMapper;
	
	@Autowired
	private StudentInformationRepository studentInformationRepository;
	
	@Override
	public StudentInformationDTO saveStudentInformation(Long schoolId, StudentInformationDTO studentDTO) {
		StudentInformation studentInformation = studentDetailMapper.toEntity(studentDTO);
		studentInformation.setSchoolDetail(studentDetailMapper.getSchoolDetail(schoolId));
		studentInformationRepository.save(studentInformation);
		return studentDetailMapper.toDTO(studentInformation);
	}

	@Override
	public boolean deleteStudentInformation(Long schoolId, Long id) {
		StudentInformation studentInformation = studentInformationRepository.findByActiveAndSchoolDetailIdAndId(true, schoolId, id);
		studentInformation.setActive(false);
		studentInformationRepository.save(studentInformation);
		return true;
	}

	@Override
	public StudentInformationDTO getStudentInformation(Long schoolId, Long id) {
		StudentInformation studentInformation = studentInformationRepository.findByActiveAndSchoolDetailIdAndId(true, schoolId, id);
		return studentDetailMapper.toDTO(studentInformation);
	}

	@Override
	public List<StudentInformationDTO> getStudentInformationList(Long schoolId) {
		List<StudentInformationDTO> list=new ArrayList<StudentInformationDTO>();
		List<StudentInformation> studentInformations = studentInformationRepository.findByActiveAndSchoolDetailId(true, schoolId);
		for (StudentInformation studentInformation : studentInformations) {
			list.add(studentDetailMapper.toDTO(studentInformation));
		}
		return list;
	}

}
