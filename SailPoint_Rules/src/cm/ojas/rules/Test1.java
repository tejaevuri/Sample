package cm.ojas.rules;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Test1 {

	public static void main(String[] args) throws GeneralException {
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		List<Identity> list = context.getObjects(Identity.class);
		for (Identity id : list) {
			System.out.println(id.getBundles());
		}

	}

}
