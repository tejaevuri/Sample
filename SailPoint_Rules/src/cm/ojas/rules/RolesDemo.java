package cm.ojas.rules;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;

import com.twilio.rest.chat.v1.service.User;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class RolesDemo {

	public static void main(String[] args) throws GeneralException {
        // TODO Auto-generated method stub
        SpringStarter starter = new SpringStarter("iiqBeans");
        starter.start();
        SailPointContext context = SailPointFactory.createContext();
        Map map = new HashMap();
        List<Bundle> list = context.getObjects(Bundle.class);
       
        if (User.hasRole("AssignedRole")) {     
        	System.out.println("User has the assignedRole"); 
        	} else if (User.hasRole("detectedRole"))
        	{     
        		System.out.println("User has the detectedRole"); 
        		}
        
        
        starter.close();
	}


}
