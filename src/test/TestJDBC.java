package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动对象，动态加载类到jvm,从而执行静态代码块，这句好像可有可无啊

		//也可创建该对象，但没必要

		String mysqlURL="jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC";//定义数据库URL

		Connection conn=DriverManager.getConnection(mysqlURL,"root","");//使用适当的驱动程序类建立与数据库的连接。

		

		Statement stmt=conn.createStatement();//创建简单语句对象，该对象用于传递简单的不带参的语句给数据库管理系统来执行。

		

//		PreparedStatement psm=conn.

//				prepareStatement("INSERT INTO students(name,sex,age,tel)values(?,?,?,?)");//传送带有一或多个参数的语句对象

//		

//		CallableStatement csm=conn.prepareCall("{call validate(?,?}");//调用存储过程的语句对象

		

		//stmt.executeUpdate("UPDATE students set name=\"lin\" where id=1");//执行update

		

		ResultSet rs=stmt.executeQuery("select * from students;");

		String id;

		String name;

		while(rs.next()){//输出一行数据

			id=rs.getString(1);

			name=rs.getString(2);

			System.out.println(id+","+name);

		}

		rs.close();

		stmt.close();

//		psm.close();

//		csm.close();

		conn.close();
	}

}
