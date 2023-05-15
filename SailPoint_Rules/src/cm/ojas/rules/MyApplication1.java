package cm.ojas.rules;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyApplication1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tk22072","root","root");
		System.out.println("connected successfully" + con);
		Statement st = con.createStatement();
		//int res = st.executeUpdate("insert into myproducts values(1,'Laptop',40000)");
		int res = st.executeUpdate("insert into myproducts values(2,'mouse',30000)");
	//int res = st.executeUpdate("insert into myproducts values(3,'mobile',20000)");


		System.out.println(res + "record inserted successfully");
		st.close();
		con.close();

	}
}

