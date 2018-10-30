package com.testing.microservices.organizationservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ConfigComponent {
	
	@Value("${example.property}")
	private String licenseType;
	
	public String getLicenseType() {
		return licenseType;
	}

}
