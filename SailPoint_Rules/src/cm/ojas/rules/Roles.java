package cm.ojas.rules;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Bundle;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;


public class Roles {
	public static void main(String[] args) throws GeneralException {
		        // TODO Auto-generated method stub
		        SpringStarter starter = new SpringStarter("iiqBeans");
		        starter.start();
		        SailPointContext context = SailPointFactory.createContext();
		        Map map = new HashMap();
		        List<Bundle> list = context.getObjects(Bundle.class);
		        for (Bundle identity : list) {
		        	String name = identity.getDisplayableName();
		            String owner = identity.getOwner().getDisplayableName();
		            map.put("name", name);
		            map.put("owner", owner);
		            System.out.println(map);
		        }
		        starter.close();
	
		    }
	}