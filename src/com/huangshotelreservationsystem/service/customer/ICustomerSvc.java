package com.huangshotelreservationsystem.service.customer;

import com.huangshotelreservationsystem.model.domain.CustomerBean;
import com.huangshotelreservationsystem.service.IService;

public interface ICustomerSvc extends IService{
	
	final String NAME = "ICustomerSvc";
	
	public boolean updateDatabaseService(CustomerBean customer);
}