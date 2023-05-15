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

public class Applicationdetails {
	public static void main(String[] args) throws GeneralException {

		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		IdentityService idService = new IdentityService(context);
		List<Identity> id = context.getObjects(Identity.class);
		Application app = context.getObject(Application.class, "ManagerCorrelation11");

		for (Identity l1 : id) {
			List<Link> links = idService.getLinks(l1, app);
			for (Link l : links) {
				if (l != null) {
					System.out.println(l.getDisplayName());
				}
			}

		}
	}
}