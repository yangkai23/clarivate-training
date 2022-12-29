package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num of records u want to persist");
		int num=scanner.nextInt();
		PreparedStatement preparedStatement=null;
		while(num>0) {
			preparedStatement=connection.prepareStatement("insert into jdbc_clarivate.student (id,name,phone) values(?,?,?)");
			System.out.println("enter id");
			preparedStatement.setInt(1, scanner.nextInt());
			System.out.println("enter name");
			scanner.nextLine();
			preparedStatement.setString(2, scanner.nextLine());
			System.out.println("enter phone number");
			preparedStatement.setLong(3, scanner.nextLong());
			preparedStatement.addBatch();
			num--;
		}
		preparedStatement.executeBatch();

		preparedStatement.close();
		connection.close();
		scanner.close();
	}
}
