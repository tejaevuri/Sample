package cm.ojas.rules;
import java.util.List;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

 

public class Attributes1 {
    public static void main(String[] args) throws GeneralException {

        SpringStarter starter = new SpringStarter("iiqBeans");
        starter.start();
        SailPointContext context = SailPointFactory.createContext();
        Application app = context.getObject(Application.class,"ManagerCorrelation");
           List<Identity> id=context.getObjects(Identity.class);
            for(Identity l1 : id){
            System.out.println(l1.getAttribute("employeeId"));
            starter.close();
        }
    }
}