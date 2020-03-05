package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.StateDetailRequest;
import com.brijframework.useraccount.beans.rqrs.StateDetailResponse;

public interface StateDetailService {

	StateDetailResponse saveStateDetail(StateDetailRequest StateDetailRequest);

	StateDetailResponse getStateDetail(long id);

	boolean deleteStateDetail(Long id);

	List<StateDetailResponse> getStateDetailList();

}
