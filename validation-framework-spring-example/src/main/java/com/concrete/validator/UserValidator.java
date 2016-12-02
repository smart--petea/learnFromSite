package com.concrete.validator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.concrete.bean.User;

public class UserValidator implements Validator {
	private Resource location;
	
	public void setLocation(Resource location) {
		this.location = location;
	}
	
	public boolean supports(Class cls) {
		return User.class.equals(cls);
	}

	public void validate(Object ob, Errors errors) {
		Properties props = null;
		
		try {
			props = PropertiesLoaderUtils.loadProperties(location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String msg1 = props.getProperty("errormsg.name");
		
		ValidationUtils.rejectIfEmpty(errors, "name", "errormsg.name", msg1);
		
		User user = (User) ob;
		if(user.getAge() < 18) {
			String msg2 = props.getProperty("errormsg.age");
			errors.rejectValue("age", "errormsg.age", msg2);
		}
		
	}

}
