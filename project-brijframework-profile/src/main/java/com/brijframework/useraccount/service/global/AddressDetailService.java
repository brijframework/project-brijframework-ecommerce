package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.AddressDetailRequest;
import com.brijframework.useraccount.beans.rqrs.AddressDetailResponse;

public interface AddressDetailService {

	public AddressDetailResponse saveAddressDetail(AddressDetailRequest addressDetailRequest) ;

	public AddressDetailResponse getAddressDetail(long id);

	public boolean deleteAddressDetail(Long id);

	public List<AddressDetailResponse> getAddressDetailList();
}
