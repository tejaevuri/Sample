package cm.ojas.rules;


import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;

import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class attributes {
	public static void main(String[] args) throws GeneralException  {
				        // IIQ propeties file must be present in java project.
				        SpringStarter starter = new SpringStarter("iiqBeans");
				        starter.start();
				        SailPointContext context = SailPointFactory.createContext();
				        List<Identity> identity=context.getObjects(Identity.class);
				        for(Identity identity2:identity)
				        {
				        	System.out.println(identity2.getAttributes());
				        }
				        starter.close();
	}

}
