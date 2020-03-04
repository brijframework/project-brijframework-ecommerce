package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserImgDetailRequest;
import com.brijframework.useraccount.beans.rqrs.UserImgDetailResponse;

public interface UserImgDetailService {

	UserImgDetailResponse saveUserImgDetail(UserImgDetailRequest userImgDetailRequest);

	UserImgDetailResponse getUserImgDetail(long id);

	boolean deleteUserImgDetail(Long id);

	List<UserImgDetailResponse> getUserImgDetailList();

}
