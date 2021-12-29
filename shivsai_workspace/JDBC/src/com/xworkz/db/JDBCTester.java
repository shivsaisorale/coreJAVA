package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) {
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/btm";
			String userName = "root";
			String password = "kiran";

			mysql = DriverManager.getConnection(url, userName, password);
			if (!mysql.isClosed())

			{
				System.out.println("mysql database is open");
				//String sql = "insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(1,'Nightclub','btm',5,500,true)";
				//String sql1 = "insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(2,'Raj','btm',4,400,true)";
				//String sql2 = "insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(3,'Bengale Club','Calcutta',7,1500,true)";
				//String sql3 = "insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(4,'Byculla club','Bombay',8,2500,true)";
				//String sql4 = "insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(5,'Ice','btm',5,100,true)";
				//String sql5="insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(7,'High ultra ','Malleswaram',5,800,true)";
				String sql7="insert into club(c_id,c_name,c_location,c_bouncers,c_entryfee,c_isActive)value(9,'Hsr','Hsr',5,900,true)";
				Statement statement = mysql.createStatement();

				statement.execute(sql7);
				System.out.println(sql7);
			}
			System.out.println("After connecting");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
				System.out.println("connection is finally closed");
			}

		}

	}
}
