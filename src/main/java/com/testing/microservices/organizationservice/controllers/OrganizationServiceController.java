package com.testing.microservices.organizationservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.microservices.organizationservice.config.ConfigComponent;
import com.testing.microservices.organizationservice.model.Organization;
import com.testing.microservices.organizationservice.utils.LicensingUtils;

@RequestMapping(value="/v1/organizations")
@RestController
public class OrganizationServiceController {
	
	@Autowired
	private ConfigComponent configComponent;
	
	@RequestMapping(value="/{organizationId}")
	public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
		LicensingUtils.slowRandomRequest();
		return Organization.builder()
				.organizationId(organizationId)
				.description(configComponent.getLicenseType()).build();
	}
}
