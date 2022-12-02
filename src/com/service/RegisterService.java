package com.service;

import java.sql.SQLException;

import com.config.Config;
import com.dao.RegisterDao;
import com.model.UserModel;
import com.utils.UserNotfoundException;

public class RegisterService {
	
	public boolean registerUser(UserModel userModel) throws ClassNotFoundException, SQLException, UserNotfoundException {
		
		
		
		RegisterDao rd=Config.getRegister();
		
		boolean f=rd.checkUserEmail(userModel.getEmailid());
		if(f) {
			throw new UserNotfoundException("Email id already exists");
		}else {
			int i=	rd.insertUser(userModel);	
		boolean f1=	i!=-1?true:false;
			return f1;
		}
     		
		
     	
	}

}
