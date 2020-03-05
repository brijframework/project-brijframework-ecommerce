package com.brijframework.useraccount.mapper.global;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EODocumentDetailDTO;
import com.brijframework.useraccount.beans.rqrs.DocumentDetailRequest;
import com.brijframework.useraccount.beans.rqrs.DocumentDetailResponse;
import com.brijframework.useraccount.entities.global.EODocumentDetail;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface DocumentDetailMapper extends RQRSMapper<DocumentDetailRequest, EODocumentDetail, EODocumentDetailDTO, DocumentDetailResponse> {

}
