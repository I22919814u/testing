package com.gofortrainings.newsportal.core.servlets;

import java.io.IOException;
import java.util.List;

import javax.jcr.Node;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(service = Servlet.class)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page", extensions = "pdf", selectors = "b")

public class ServletApi extends SlingSafeMethodsServlet{
	
private static final Logger logger = LoggerFactory.getLogger(ServletApi.class);
@Override
protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response ) 
throws ServletException, IOException {
		
		
		try {
			ResourceResolver resolver = request.getResourceResolver();
			
		
			
			Resource nodeRes = resolver.getResource("/content/res");
			
			//List<Resource> childRes = (List<Resource>) nodeRes.listChildren();
			
			//for(Resource res : childRes){
				
			//}
			
			// JCR
			Node infoNode = nodeRes.adaptTo(Node.class);
			infoNode.getProperties("name");					// useful to read the node properties
			infoNode.setProperty("testNode", "vishnu");	// useful to write the node properties
			
			
			//sling
			ValueMap infoVM = nodeRes.getValueMap();
			infoVM.get("name", String.class);
			infoVM.get("sling:resourceType", String.class);
			
			ModifiableValueMap map = nodeRes.adaptTo(ModifiableValueMap.class);
			map.put("modifyVM", "it is servlet");
			nodeRes.getResourceResolver().commit();
			
			response.getWriter().write("From node : " + infoNode.getProperties("name").toString() + "from sling : " + infoVM.get("name", String.class));
		} catch (Exception e) {
		
		
			logger.info("There is an error in NewsportalNodeRetrive : " + e.getMessage());
		}finally {
			logger.info("finally block.............");
		}
		
		
		
		
		
	}

}



