package com.brijframework.useraccount.mapper.account;

import java.util.List;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOUserImgDetailDTO;
import com.brijframework.useraccount.beans.rqrs.UserImgDetailRequest;
import com.brijframework.useraccount.beans.rqrs.UserImgDetailResponse;
import com.brijframework.useraccount.entities.account.EOUserImgDetail;
import com.brijframework.useraccount.mapper.GenericMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserImgDetailMapper  extends GenericMapper<EOUserImgDetail, EOUserImgDetailDTO>{

	UserImgDetailResponse mapResponseToDTO(EOUserImgDetail eoUserImgDetail);

	EOUserImgDetail mapRequestToDAO(UserImgDetailRequest userImgDetailRequest);

	List<UserImgDetailResponse> mapResponseToDTO(List<EOUserImgDetail> findAll);

}
