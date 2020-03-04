package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.rqrs.AddressDetailRequest;
import com.brijframework.useraccount.beans.rqrs.AddressDetailResponse;
import com.brijframework.useraccount.entities.global.EOAddressDetail;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface AddressDetailMapper {

	EOAddressDetail mapRequestToDAO(AddressDetailRequest addressDetailRequest);

	AddressDetailResponse mapResponseToDTO(EOAddressDetail eoAddressDetail);

}
