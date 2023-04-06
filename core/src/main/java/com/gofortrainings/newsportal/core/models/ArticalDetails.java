package com.gofortrainings.newsportal.core.models;


	import javax.json.JsonValue.ValueType;

	import org.apache.sling.api.resource.Resource;
	import org.apache.sling.api.resource.ResourceResolver;
	import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
	import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
	import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
	import org.apache.sling.models.annotations.injectorspecific.SlingObject;
	import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.wcm.core.components.models.List;


	@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	public class ArticalDetails {
		
		@ValueMapValue
		private String articalTitle;
		
		@ValueMapValue
		private String articleDesc;
	
		@ValueMapValue
		private String articleImage;
		
		public String getArticalTitle() {
			return articalTitle;
		}

		public String getArticleDesc() {
			return articleDesc;
		}

		public String getArticleImage() {
			return articleImage;
		}
			
						
		
	}


