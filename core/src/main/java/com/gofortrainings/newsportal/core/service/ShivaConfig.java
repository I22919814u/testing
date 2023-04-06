package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "ShivaConfig", description = "this config helps to provide run time values to service ")
public @interface ShivaConfig {
	@AttributeDefinition(name = "mobile", description = "what is mobile", required = true)
	public String mobile() default"realme";
}
