package com.brijframework.useraccount.service.global;

import com.brijframework.useraccount.beans.rqrs.MaritalDetailRequest;
import com.brijframework.useraccount.beans.rqrs.MaritalDetailResponse;

public interface MaritalDetailService {

	MaritalDetailResponse saveMaritalDetail(MaritalDetailRequest MaritalDetailRequest);

	MaritalDetailResponse getMaritalDetail(long id);

	boolean deleteMaritalDetail(Long id);

}
