package com.springboot.security.core.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrowserProperties {

	private SessionProperties session = new SessionProperties();
	
	private String signUpUrl = "/imooc-signUp.html";
	
	private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;
	
	private LoginResponseType loginType = LoginResponseType.JSON;
	
	private int rememberMeSeconds = 3600;
}
