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
		Class.forName("com.mysql.cj.jdbc.Driver");//�����������󣬶�̬�����ൽjvm,�Ӷ�ִ�о�̬����飬��������п��ް�

		//Ҳ�ɴ����ö��󣬵�û��Ҫ

		String mysqlURL="jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC";//�������ݿ�URL

		Connection conn=DriverManager.getConnection(mysqlURL,"root","");//ʹ���ʵ������������ཨ�������ݿ�����ӡ�

		

		Statement stmt=conn.createStatement();//�����������󣬸ö������ڴ��ݼ򵥵Ĳ����ε��������ݿ����ϵͳ��ִ�С�

		

//		PreparedStatement psm=conn.

//				prepareStatement("INSERT INTO students(name,sex,age,tel)values(?,?,?,?)");//���ʹ���һ����������������

//		

//		CallableStatement csm=conn.prepareCall("{call validate(?,?}");//���ô洢���̵�������

		

		//stmt.executeUpdate("UPDATE students set name=\"lin\" where id=1");//ִ��update

		

		ResultSet rs=stmt.executeQuery("select * from students;");

		String id;

		String name;

		while(rs.next()){//���һ������

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
