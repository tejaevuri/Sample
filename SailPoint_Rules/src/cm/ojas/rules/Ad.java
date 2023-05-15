package cm.ojas.rules;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Bundle;
import sailpoint.object.ManagedAttribute;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Ad {
	public static void main(String[] args) throws GeneralException {
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		List<Bundle> list = context.getObjects(Bundle.class);
		for (Bundle ma : list) {
			if (ma.isDisabled() == true) {
				String UserName = (String) ma.getDisplayableName();
				System.out.println(UserName);
			}
		}
		starter.close();
	}
}
