package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOCountryDetailDTO;
import com.brijframework.useraccount.beans.rqrs.CountryDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CountryDetailResponse;
import com.brijframework.useraccount.entities.global.EOCountryDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface CountryDetailMapper extends RQRSMapper<CountryDetailRequest, EOCountryDetail, EOCountryDetailDTO, CountryDetailResponse>{

}
