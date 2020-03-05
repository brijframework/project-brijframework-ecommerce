package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOReligionDetailDTO;
import com.brijframework.useraccount.beans.rqrs.ReligionDetailRequest;
import com.brijframework.useraccount.beans.rqrs.ReligionDetailResponse;
import com.brijframework.useraccount.entities.global.EOReligionDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface ReligionDetailMapper extends RQRSMapper<ReligionDetailRequest, EOReligionDetail, EOReligionDetailDTO, ReligionDetailResponse>{

}
