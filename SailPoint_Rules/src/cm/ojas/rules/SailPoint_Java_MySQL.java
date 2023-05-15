package cm.ojas.rules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class SailPoint_Java_MySQL {

	public static void main(String[] args) throws GeneralException {
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		SailPointContext context = SailPointFactory.createContext();
		Application app = context.getObject(Application.class,"Auth11");
		List<Identity> id = context.getObjects(Identity.class);
		for(Identity l1 : id) {
			String empid = (String) l1.getAttribute("employeeId");
			String fn = (String) l1.getAttribute("firstname");
			String ln = (String) l1.getAttribute("lastname");
			String fullName = fn + " " + ln;
			String email = fn.toLowerCase() + "." + ln.toLowerCase() + "@ojas-it.com";
			String pass = fn.substring(0, 1) + ln.substring(0, 1).toLowerCase() + empid;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tk22072","root","root");
				PreparedStatement pst = con.prepareStatement("insert into AuthEmp(empid,fn,ln,fullName,email,pass)values(?,?,?,?,?,?)");
				pst.setString(1,empid);
				pst.setString(2,fn);
				pst.setString(3,ln);
				pst.setString(4,fullName);
				pst.setString(5,email);
				pst.setString(6,pass);
				pst.executeUpdate();
				pst.close();
				con.close();
				System.out.println("Inserted Successfully");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		starter.close();
	}
}

