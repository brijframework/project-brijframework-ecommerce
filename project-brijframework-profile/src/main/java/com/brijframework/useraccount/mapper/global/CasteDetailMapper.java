package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.rqrs.CasteDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CasteDetailResponse;
import com.brijframework.useraccount.entities.global.EOCasteDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface CasteDetailMapper extends RQRSMapper<CasteDetailRequest, EOCasteDetail, CasteDetailResponse> {

}
