package cm.ojas.rules;
import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Test2 {
		
		    public static void main(String[] args) throws GeneralException {
		        // IIQ propeties file must be present in java project.
		        SpringStarter starter = new SpringStarter("iiqBeans");
		        starter.start();
		        SailPointContext context = SailPointFactory.createContext();
		        List<Identity> list = context.getObjects(Identity.class);
		        for (Identity id : list) {



		           
		              System.out.println("dan:" + id.getDisplayableName());
		              System.out.println("displayname:" + id.getDisplayName());
		             
		            System.out.println("firstname:" + id.getFirstname());
		            System.out.println("lastname:" + id.getLastname());
		            starter.close();
		        }
		    }

	}


