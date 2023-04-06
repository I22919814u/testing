package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(immediate = true, service = ComputerService.class)
public class ComputerService {
private static final Logger logger=LoggerFactory.getLogger(ComputerService.class);

@Activate
public void active() {
	logger.info("Newsportal Bundles is activated....");
}

@Modified
public void modify() {
	logger.info("Newsportal Bundles is modified....");
}

@Deactivate
public void deActivate() {
	logger.info("Newsportal Bundles is deactivated....");
}

public String laptop(String models) {
	logger.info("gadget model is" + models);
	return "gadget model is " + models;
}
}
