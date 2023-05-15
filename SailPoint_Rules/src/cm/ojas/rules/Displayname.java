package cm.ojas.rules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Displayname {
	Map dummy() throws GeneralException {
		SpringStarter starter=new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context=SailPointFactory.createContext();
		Map map=new HashMap();
		List<Identity>ids=context.getObjects(Identity.class);
		int count=0;
		for(Identity id:ids) {
			map.put(count+":",id.getDisplayName()+"\n");
			count++;
		}
		return map;
	}

	public static void main(String[] args) throws GeneralException {
		
		Displayname t2=new Displayname();
		System.out.println(t2.dummy());
			
		}
		

	}
