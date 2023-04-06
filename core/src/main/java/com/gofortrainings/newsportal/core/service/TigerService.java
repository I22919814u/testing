package com.gofortrainings.newsportal.core.service;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gofortrainings.newsportal.core.models.ComputerService;



@Component(immediate = true, service = TigerService.class)
@Designate(ocd = TigerConfig.class)
public class TigerService {
	
	private static final Logger logger = LoggerFactory.getLogger(TigerService.class);

	
	//@Reference
	//private ComputerService  computerService;
	
	TigerConfig tigerConfig;
	private String name;
	
	private String val;
	
	@Activate
	public void active(TigerConfig tigerConfig) {
		this.tigerConfig=tigerConfig;
		logger.info(" Tiger config value : " + tigerConfig.food());
		name=tigerConfig.food();
		
		logger.info("jgjk:"+tigerConfig.drink());
		val=tigerConfig.drink();
	}

	public String food() {
		
		return name;
	}
	public String drink() {
		return val;
	}
}

