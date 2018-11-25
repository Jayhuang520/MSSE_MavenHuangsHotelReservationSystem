package com.huangshotelreservationsystem.service.factory;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.huangshotelreservationsystem.service.IService;
import com.huangshotelreservationsystem.service.ServiceLoadException;

public class ServiceFactory {

	// Singleton Pattern:
	//Make the constructor private
	private ServiceFactory() {
	}
	
	private static ServiceFactory serviceFactoryInstance;
	
	private static String getImplName(String name) throws Exception {
	     Context iniCtx = new InitialContext();
	     Context envCtx = (Context) iniCtx.lookup("java:comp/env");
	     return (String)envCtx.lookup(name);
	}

	
	public IService getService(String name) throws Exception{
		System.out.println("Inside of the get service method of Service Factory");
		try {
			Class<?> c = Class.forName(getImplName(name));
			return (IService)c.newInstance();
		} catch (ClassNotFoundException e) {
			throw new ServiceLoadException(name + "not found", e);
		} catch (InstantiationException ie) {
			throw new ServiceLoadException(name + "not instantiated", ie);
		} catch (IllegalAccessException iae) {
			throw new ServiceLoadException(name+"illegal access", iae);
		}
	}
	
	public static ServiceFactory getInstance() {
		if(serviceFactoryInstance == null) {
			serviceFactoryInstance = new ServiceFactory();
		}
		return serviceFactoryInstance;
	}

}
