package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.constant.TrainConstant;

public class DBaseUtil {

	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(TrainConstant.MYSQL_URL, TrainConstant.MYSQL_NAME,
					TrainConstant.MYSQL_PASSWORD);
			return connection;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {

				connection.close();
				System.out.println("Closed the resource");

			} catch (SQLException e) {

				e.printStackTrace();
			}

	}
}
