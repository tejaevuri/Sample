package cm.ojas.rules;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyApplication {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tk22072","root","root");
		System.out.println("connected successfully" + con);
		Statement st = con.createStatement();
		st.executeUpdate("create table working(pid int primary key,pname varchar(20) not null,price float(9,2))");
		
		System.out.println("table is created successfully");
		st.close();
		con.close();
		}

	}

