package jdbc_day2;
import java.sql.*;
import java.util.*;
public class JDBC_CRUD {
	public void saveStudent() {
		  Connection connection = null;
		  Scanner scanner=null;
		  try {
		    scanner = new Scanner(System.in);
		   System.out.println("Enter your Id");
		   int id = scanner.nextInt();
		   System.out.println("Enter your Name");
		   String name = scanner.next();
		   System.out.println("Enter your Phone Number");
		   long phone = scanner.nextLong();

		   // 1.Load and Register
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   // 2.Establish Connection
		   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
		   // 3. Create Prepared Statement
		   PreparedStatement preparedStatement = connection.prepareStatement("insert into jdbc_clarivate.student values(?,?,?)");
		   preparedStatement.setInt(1, id);
		   preparedStatement.setString(2, name);
		   preparedStatement.setLong(3, phone);

		   int rows = preparedStatement.executeUpdate();

		   System.out.println("The number of rows effected " + rows);

		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();
		  } catch (SQLException e) {
		   e.printStackTrace();
		  } finally {
		   try {
		    connection.close();
		   } catch (SQLException e) {
		    e.printStackTrace();
		   }
		   scanner.close();
		  }
		 }

		 public void deleteStudent() throws Exception {
		  Connection connection = null;
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter your Id to be deleted");
		  int id = scanner.nextInt();

		  // 1.Load and Register
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  // 2.Establish Connection
		  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
		  // 3. Create Prepared Statement
		  PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
		  preparedStatement.setInt(1, id);
		  preparedStatement.executeUpdate();
		  connection.close();
		  scanner.close();
		 }

		 public void getAllStudents() throws Exception {
		  // 1.Load and Register
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  // 2.Establish Connection
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root",
		    "Optimus@2399");
		  // 3. Create Prepared Statement
		  PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
		  ResultSet resultSet = preparedStatement.executeQuery();
		  while (resultSet.next()) {
		   System.out.println("Id " + resultSet.getInt(1));
		   System.out.println("Name " + resultSet.getString(2));
		   System.out.println("Phone " + resultSet.getLong(3));
		   System.out.println("=====================================");
		  }
		  connection.close();
		 }
		 public void updateStudent() throws ClassNotFoundException, SQLException {
			 Connection connection = null;
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Enter your Id to be updated");
			  int id = scanner.nextInt();
			  scanner.nextLine();
			  System.out.println("Enter the name to be updated");
			  String name=scanner.nextLine();
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
			  PreparedStatement preparedStatement = connection.prepareStatement("update jdbc_clarivate.student set name=? where id=?");
			  preparedStatement.setString(1, name);
			  preparedStatement.setInt(2, id);
			  preparedStatement.executeUpdate();
			  preparedStatement.close();
			  connection.close();
			  scanner.close();
			  
		 }
		 public void getStudentById() throws ClassNotFoundException, SQLException {
			 Connection connection = null;
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("Enter your record Id to be fetched");
			  int id = scanner.nextInt();
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_clarivate", "root", "Optimus@2399");
			  PreparedStatement preparedStatement = connection.prepareStatement("select name from jdbc_clarivate.student where id=?");
			  preparedStatement.setInt(1, id);
			  ResultSet resultSet= preparedStatement.executeQuery();
			 if(resultSet.next()) {
			System.out.println("Student Name: "+resultSet.getString(1));
			}
			  resultSet.close();
			  preparedStatement.close();
			  connection.close();
			  scanner.close();
		 }
}
