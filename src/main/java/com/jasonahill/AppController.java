package com.jasonahill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller maps requests and returns views.
 * 
 * @author jason
 *
 */
@Controller
public class AppController {

	/**
	 * This method maps the "/hello" requests and returns a view "/index.html".
	 * Spring resolves this view using the default view resolvers and searches
	 * for this file in the default static files location (typically
	 * /src/main/resources/static).
	 * 
	 * <p>
	 * When using JSP or other server view-templating technology, a custom view
	 * resolver (e.g. JSP, Thymeleaf) will need to be configured so that the servlet  
	 * knows where to render the view from.
	 * </p>
	 * 
	 * @return the view location
	 */
	@RequestMapping("/dashboard")
	public String index() {
		return "/index.html";
	}

}
