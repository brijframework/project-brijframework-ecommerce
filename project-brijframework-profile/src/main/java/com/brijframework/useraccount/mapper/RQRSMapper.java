package com.brijframework.useraccount.mapper;

import java.util.List;

public interface RQRSMapper<RQ, E,D, RS> {

	RS mapToDTO(E eoRole);

	E mapToDAO(RQ eoRoleDTO);
	
	List<E> mapToDAO(List<RQ> findAll);
	
	List<RS> mapToDTO(List<E> eoRoleDTO);
	
	D toDTO(E eoRole);
	
	E toDAO(D eoRoleDTO);
	
	List<E> toDAO(List<D> findAll);
	
	List<D> toDTO(List<E> eoRoleDTO);
	
}
