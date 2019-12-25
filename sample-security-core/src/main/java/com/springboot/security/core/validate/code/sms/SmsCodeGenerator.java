package com.springboot.security.core.validate.code.sms;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import com.springboot.security.core.properties.SecurityProperties;
import com.springboot.security.core.validate.code.ValidateCode;
import com.springboot.security.core.validate.code.ValidateCodeGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("smsValidateCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

	@Autowired
	private SecurityProperties securityProperties;

	@Override
	public ValidateCode generate(ServletWebRequest request) {
		String code = RandomStringUtils.randomNumeric(securityProperties.getCode().getSms().getLength());
		return new ValidateCode(code, securityProperties.getCode().getSms().getExpireIn());
	}

}
