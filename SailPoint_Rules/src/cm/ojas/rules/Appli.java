package cm.ojas.rules;

import java.util.ArrayList;
import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Appli {

	public static void main(String[] args) throws GeneralException {
		// IIQ propeties file must be present in java project.
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		List<Application> list = context.getObjects(Application.class);
		int count = 1;
		for (Application application : list) {
			System.out.println(count + ":" + application.getName());
			count++;
		}
		
	}
}
