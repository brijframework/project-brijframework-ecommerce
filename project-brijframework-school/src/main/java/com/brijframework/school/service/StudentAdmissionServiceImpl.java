package com.brijframework.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.mapper.StudentDetailMapper;
import com.brijframework.school.repository.StudentAdmissionRepository;

@Service
public class StudentAdmissionServiceImpl implements StudentAdmissionService {


	@Autowired
	private StudentDetailMapper studentDetailMapper;
	
	@Autowired
	private StudentAdmissionRepository studentAdmissionRepository;
	
	@Override
	public StudentAdmissionDTO saveStudentAdmission(Long schoolId, StudentAdmissionDTO studentDTO) {
		StudentAdmission studentAdmission = studentDetailMapper.toEntity(studentDTO);
		studentAdmission.setSchoolDetail(studentDetailMapper.getSchoolDetail(schoolId));
		studentAdmissionRepository.save(studentAdmission);
		return studentDetailMapper.toDTO(studentAdmission);
	}

	@Override
	public boolean deleteStudentAdmission(Long schoolId, Long id) {
		StudentAdmission studentAdmission = studentAdmissionRepository.findByActiveAndSchoolDetailIdAndId(true, schoolId, id);
		studentAdmission.setActive(false);
		studentAdmissionRepository.save(studentAdmission);
		return true;
	}

	@Override
	public StudentAdmissionDTO getStudentAdmission(Long schoolId, Long id) {
		StudentAdmission studentInformation = studentAdmissionRepository.findByActiveAndSchoolDetailIdAndId(true, schoolId, id);
		return studentDetailMapper.toDTO(studentInformation);
	}

	@Override
	public List<StudentAdmissionDTO> getStudentAdmissionList(Long schoolId) {
		List<StudentAdmissionDTO> list=new ArrayList<StudentAdmissionDTO>();
		List<StudentAdmission> studentAdmissions = studentAdmissionRepository.findByActiveAndSchoolDetailId(true, schoolId);
		for (StudentAdmission studentAdmission : studentAdmissions) {
			list.add(studentDetailMapper.toDTO(studentAdmission));
		}
		return list;
	}

}
