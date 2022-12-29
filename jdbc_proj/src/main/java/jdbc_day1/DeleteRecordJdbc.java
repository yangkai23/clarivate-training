package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
		PreparedStatement	preparedStatement=connection.prepareStatement("delete from jdbc_clarivate.student where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id value");
		preparedStatement.setInt(1, sc.nextInt());
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
		sc.close();
	}
}
