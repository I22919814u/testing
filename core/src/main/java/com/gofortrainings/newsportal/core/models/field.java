package com.gofortrainings.newsportal.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


	@Model(adaptables= Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	public class field {
	
		@ValueMapValue
		private String state;

		@ValueMapValue
		private String dist;

		@ValueMapValue
		private String dropdown;
		
		@ValueMapValue
		private String checkbox;
		
		@ValueMapValue
		private String checkbox1;
		
		
		public String getCheckbox() {
			return checkbox;
		}
		public String getDropdown() {
			return dropdown;
		}
		public String getState() {
			return state;
		}
		public String getDist() {
			return dist;
		}
		
	

}
