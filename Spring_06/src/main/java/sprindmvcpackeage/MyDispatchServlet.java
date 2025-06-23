package sprindmvcpackeage;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatchServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] a = {Myconfigure.class	};
		return a;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] a  = {"/"};
		
		return a;
		
	}

}
