package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyModel {
	@Self   
	   private SlingHttpServletRequest request;

	   // your existing OSGi service
	   @OSGiService
	  // private MyService myService;

	   public void method() {
	       // new method tho set request object
	     //  myService.setRequest(request);
	       
	       // existing method
	     //  myService.methodA();
	   }

}
