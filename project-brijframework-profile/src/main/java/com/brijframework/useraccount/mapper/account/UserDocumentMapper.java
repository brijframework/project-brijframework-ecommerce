package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOUserDocumentDTO;
import com.brijframework.useraccount.beans.rqrs.UserDocumentRequest;
import com.brijframework.useraccount.beans.rqrs.UserDocumentResponse;
import com.brijframework.useraccount.entities.account.EOUserDocument;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserDocumentMapper extends RQRSMapper<UserDocumentRequest, EOUserDocument,EOUserDocumentDTO, UserDocumentResponse>{

}
