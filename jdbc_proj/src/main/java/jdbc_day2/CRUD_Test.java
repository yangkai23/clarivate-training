package jdbc_day2;

import java.sql.SQLException;
public class CRUD_Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	JDBC_CRUD crud=new JDBC_CRUD();
//	crud.saveStudent();
//	crud.getStudentById();
	crud.updateStudent();
}
}
