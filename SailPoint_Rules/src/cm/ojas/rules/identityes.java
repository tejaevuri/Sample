package cm.ojas.rules;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;
import sailpoint.object.Identity;
public class identityes {
public static void main(String[] args) throws GeneralException {
//IIQ propeties file must be present in java project.
	SpringStarter starter = new SpringStarter("iiqBeans");
	starter.start();
	SailPointContext context = SailPointFactory.createContext();
	Identity id=context.getObject(Identity.class, "James.Smith");
	System.out.println(id.getDisplayableName());
		}
}
			




	


