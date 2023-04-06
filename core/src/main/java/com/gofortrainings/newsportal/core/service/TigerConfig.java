package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="TigerConfig",description = "this configuration helps to provide run time values to tiger service")
public @interface TigerConfig {
	@AttributeDefinition(name = "food",description = "what tiger eats", required = true)
	public String food()default"Test Meal";
	
	@AttributeDefinition(name = "drink", description = "drinking",required = true)
	public String drink();
}
