package com.springboot.security.demo.code;

import org.springframework.web.context.request.ServletWebRequest;

import com.springboot.security.core.validate.code.ValidateCode;
import com.springboot.security.core.validate.code.ValidateCodeGenerator;

public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	@Override
	public ValidateCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
