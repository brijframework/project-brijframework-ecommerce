package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.rqrs.GenderDetailRequest;
import com.brijframework.useraccount.beans.rqrs.GenderDetailResponse;
import com.brijframework.useraccount.entities.global.EOGenderDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface GenderDetailMapper extends RQRSMapper<GenderDetailRequest, EOGenderDetail, GenderDetailResponse> {

}
