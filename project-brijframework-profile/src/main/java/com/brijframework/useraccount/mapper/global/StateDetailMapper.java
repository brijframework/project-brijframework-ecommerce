package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOStateDetailDTO;
import com.brijframework.useraccount.beans.rqrs.StateDetailRequest;
import com.brijframework.useraccount.beans.rqrs.StateDetailResponse;
import com.brijframework.useraccount.entities.global.EOStateDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface StateDetailMapper extends RQRSMapper<StateDetailRequest, EOStateDetail, EOStateDetailDTO, StateDetailResponse>{

}
