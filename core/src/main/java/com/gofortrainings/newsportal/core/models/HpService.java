package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component (immediate = true,  service = HpService.class)
public class HpService {
private static final Logger logger = LoggerFactory.getLogger(HpService.class);
	
	@Reference
	private ComputerService computerService;

	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated from Hp....");
		logger.info("This is HpService : " + computerService.laptop("proBook"));
	}
	
}
