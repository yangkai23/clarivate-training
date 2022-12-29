package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
		PreparedStatement	preparedStatement=connection.prepareStatement("update jdbc_clarivate.student set name=? where id=? ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id value");
		preparedStatement.setInt(2, sc.nextInt());
		System.out.println("enter name to update");
		preparedStatement.setString(1, sc.next());
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		sc.close();
	}
}
