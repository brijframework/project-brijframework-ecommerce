package com.brijframework.school.service.comman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.domain.comman.Religion;
import com.brijframework.school.repository.ReligionRepository;

@Service
public class ReligionServiceImpl implements ReligionService {

	@Autowired
	private ReligionRepository religionRepository;
	
	@Override
	public Religion saveReligion(Religion religion) {
		return religionRepository.save(religion);
	}
}
