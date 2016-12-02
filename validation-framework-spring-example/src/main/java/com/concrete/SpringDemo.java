package com.concrete;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.concrete.bean.User;
import com.concrete.validator.UserValidator;

public class SpringDemo {

	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
		User user = (User)context.getBean("user");
		UserValidator userValidator = (UserValidator)context.getBean("userValidator");
		
		Map<String, String> map = new HashMap<String, String>();
		MapBindingResult err = new MapBindingResult(map, User.class.getName());
		userValidator.validate(user, err);
		List<ObjectError> list = err.getAllErrors();
		
		for(ObjectError objErr : list) {
			System.out.println(objErr.getDefaultMessage());
		}
	}
}
