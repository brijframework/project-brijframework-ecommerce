package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.RoleDetailRequest;
import com.brijframework.useraccount.beans.rqrs.RoleDetailResponse;

public interface RoleDetailService {

	RoleDetailResponse saveRoleDetail(RoleDetailRequest roleDetailRequest);

	RoleDetailResponse getRoleDetail(long id);

	List<RoleDetailResponse> getRoleDetailList();

	boolean deleteRoleDetail(Long id);

}
