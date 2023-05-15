package cm.ojas.rules;

import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Identityreq {
	public static void main(String[] args) throws GeneralException {
		SpringStarter starter=new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context=SailPointFactory.createContext();
		List<Identity> identity =context.getObjects(Identity.class);
		for(Identity ids: identity)
		{
			if(ids.isInactive()==true)
				
			{
				System.out.println(ids.getName()+"\t"+ids.getFirstname()+"\t"+ids.getLastname()+"\t"+ids.getEmail());
			}
		}
		starter.close();
		
	}
}

