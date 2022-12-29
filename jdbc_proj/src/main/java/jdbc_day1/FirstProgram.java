package jdbc_day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate","root","Optimus@2399");
		Statement statement=connection.createStatement();
		//	statement.execute("insert into jdbc_clarivate.student (id,name,phone) values(2,'Revanth','7541248423')");
		ResultSet resultSet=	 statement.executeQuery("select * from jdbc_clarivate.student");
		while(resultSet.next()) {
			System.out.println("id: "+resultSet.getInt(1)+"\n");
			System.out.println("name: "+resultSet.getString(2)+"\n");
			System.out.println("phone: "+resultSet.getLong(3)+"\n");
			System.out.println("--------------------------------");
		}
		statement.close();
		connection.close();
	}
}
