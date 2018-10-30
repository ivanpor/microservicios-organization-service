package com.testing.microservices.organizationservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@SuppressWarnings(value={"all"})
@Getter
@AllArgsConstructor
@Builder
public class Organization implements Serializable {

	private static final long serialVersionUID = 8278016230493037555L;
	
	private String organizationId;
	private String description;

}