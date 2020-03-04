package com.brijframework.useraccount.mapper;

import java.util.List;

public interface RQRSMapper<RQ, E, RS> {

	RS mapToDTO(E eoRole);

	E mapToDAO(RQ eoRoleDTO);
	
	List<E> mapToDAO(List<RQ> findAll);
	
	List<RS> mapToDTO(List<E> eoRoleDTO);
}
