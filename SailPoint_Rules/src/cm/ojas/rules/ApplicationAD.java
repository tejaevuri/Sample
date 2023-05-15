package cm.ojas.rules;

import java.util.List;
import sailpoint.api.IdentityService;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.object.Link;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class ApplicationAD {
	public static void main(String[] args) throws GeneralException {

		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		IdentityService idService = new IdentityService(context);
		//List<Identity> id = context.getObjects(Identity.class);
		
		 List<Identity> id1=context.getObjects(Identity.class);
         for(Identity id: id1) {
        	 System.out.println(id.getManager().getDisplayName());
        	 
     
}
	
}}