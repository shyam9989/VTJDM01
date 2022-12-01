package com.config;


import com.dao.RegisterDao;
import com.service.RegisterService;

public class Config {
	
	
	public static RegisterService getLoginService() {
		
		return new RegisterService();
	}
	
	public static RegisterDao getRegister() {
		return new RegisterDao();
	}
	
	
	

}
