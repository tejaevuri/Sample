package cm.ojas.rules;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Bundle;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Identites {

	public static void main(String[] args) throws GeneralException {
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext con = SailPointFactory.createContext();
		List<Bundle> it = con.getObjects(Bundle.class);
		for (Bundle id : it) {
			System.out.println(id.getDisplayName());
		}
		starter.close();
	}

}
