package com.brijframework.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.mapper.StudentDetailMapper;
import com.brijframework.school.repository.StudentDetailRepository;

@Service
public class StudentDetailServiceImpl implements StudentDetailService{
	
	@Autowired
	private StudentDetailRepository studentDetailRepository;
	
	@Autowired
	private StudentDetailMapper studentDetailMapper;

	@Override
	public StudentDetailDTO saveStudentDetail(Long schoolId,StudentDetailRequest studentDetailRequest) {
		StudentDetail studentDetail = studentDetailMapper.toEntity(studentDetailRequest);
		studentDetail.setSchoolDetail(studentDetailMapper.getSchoolDetail(schoolId));
		studentDetail=studentDetailRepository.save(studentDetail);
		return studentDetailMapper.toDTO(studentDetail);
	}

	@Override
	public StudentDetailDTO getStudentDetail(Long schoolId, Long id) {
		StudentDetail studentDetail = studentDetailRepository.findByActiveAndSchoolDetailIdAndId(true,schoolId,id);
		return studentDetailMapper.toDTO(studentDetail);
	}

	@Override
	public List<StudentDetailDTO> getStudentDetailList(Long schoolId) {
		List<StudentDetail> studentDetails = studentDetailRepository.findByActiveAndSchoolDetailId(true,schoolId);
		ArrayList<StudentDetailDTO> list = new ArrayList<StudentDetailDTO>();
		if(studentDetails==null) {
			return list;
		}
		for (StudentDetail studentDetail : studentDetails) {
			list.add(studentDetailMapper.toDTO(studentDetail));
		}
		return list;
	}


	@Override
	public boolean deleteStudentDetail(Long schoolId, Long id) {
		StudentDetail studentDetail = studentDetailRepository.findByActiveAndSchoolDetailIdAndId(true,schoolId,id);
		studentDetail.setActive(false);
		studentDetail=studentDetailRepository.save(studentDetail);
		return true;
	}
	
}
