package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOMaritalDetailDTO;
import com.brijframework.useraccount.beans.rqrs.MaritalDetailRequest;
import com.brijframework.useraccount.beans.rqrs.MaritalDetailResponse;
import com.brijframework.useraccount.entities.global.EOMaritalDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface MaritalDetailMapper extends RQRSMapper<MaritalDetailRequest, EOMaritalDetail, EOMaritalDetailDTO,  MaritalDetailResponse>{

}
