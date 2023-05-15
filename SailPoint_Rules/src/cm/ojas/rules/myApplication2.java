package cm.ojas.rules;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class myApplication2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tk22072",
				"root","root");
		System.out.println("connected successfully" + con);
		PreparedStatement pst = con.prepareStatement("insert into myproducts values(?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pid,pname,price?");
		pst.setInt(1, sc.nextInt());
		pst.setString(2, sc.next());
		pst.setDouble(3, sc.nextDouble());
		int res = pst.executeUpdate();
		System.out.println(res + "record inserted successfully");
		pst.close();
		con.close();
		}
}


