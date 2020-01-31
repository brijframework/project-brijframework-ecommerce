package com.brijframework.school.domain.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "RECEIPT")
public class Receipt extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "fee_receipt_date")
	private Date feeReceiptDate;

}
