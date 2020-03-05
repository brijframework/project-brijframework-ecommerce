package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOCityDetailDTO;
import com.brijframework.useraccount.beans.rqrs.CityDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CityDetailResponse;
import com.brijframework.useraccount.entities.global.EOCityDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface CityDetailMapper  extends RQRSMapper<CityDetailRequest, EOCityDetail,EOCityDetailDTO, CityDetailResponse>{

}
