package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gofortrainings.newsportal.core.service.TigerService;

import java.util.List;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CompositeMultifeld {
	final static Logger logger=LoggerFactory.getLogger(CompositeMultifeld.class);
	@OSGiService
	TigerService tigerservice;
    
	private String message;
	
	private String call;
	
	public String getCall() {
		return call;
	}
	@ValueMapValue
	private String textfield2;

	@ValueMapValue
	private String textfield3;
	
	@ChildResource
    List<field> field;
 
	public String getTextfield2() {
		return textfield2;
	}

	public String getTextfield3() {
		return textfield3;
	}

	public List<field> getField() {
		return field;
	}

public String getMessage() {
	return message;
}
@PostConstruct
public void init() {
	
	message=tigerservice.food();
	
	call=tigerservice.drink();
	}
}

		



