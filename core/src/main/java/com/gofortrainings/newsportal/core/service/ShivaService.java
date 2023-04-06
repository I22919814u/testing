package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gofortrainings.newsportal.core.models.ComputerService;

@Component(immediate = true, service = ShivaService.class)
@Designate(ocd =ShivaConfig.class )
public class ShivaService {
	
	private static final Logger logger =LoggerFactory.getLogger(ShivaService.class);
	@Reference
	private ComputerService computerservice;
	
	ShivaConfig shivaConfig;
	@Activate
	public void active(ShivaConfig shivaConfig) {
		
		logger.info("shiva:"+shivaConfig.mobile());
		
	}
	

}
