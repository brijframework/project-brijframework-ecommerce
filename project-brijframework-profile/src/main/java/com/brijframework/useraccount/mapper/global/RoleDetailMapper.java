package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EORoleDetailDTO;
import com.brijframework.useraccount.beans.rqrs.RoleDetailRequest;
import com.brijframework.useraccount.beans.rqrs.RoleDetailResponse;
import com.brijframework.useraccount.entities.global.EORoleDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface RoleDetailMapper extends RQRSMapper<RoleDetailRequest, EORoleDetail, EORoleDetailDTO, RoleDetailResponse>{

}
