package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constant.IcecreamConstant;
import com.xworkz.dto.IcecreamDTO;

public class IcecreamDAO {

	public boolean save(IcecreamDTO icecreamDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(IcecreamConstant.MYSQL_URL, IcecreamConstant.MYSQL_NAME,
					IcecreamConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into  icecream_details values(" + icecreamDTO.getId() + ",'"
						+ icecreamDTO.getFlavour() + "','" + icecreamDTO.getName() + "'," + icecreamDTO.getPrice()
						+ ")";
				Statement statement = mysql.createStatement();
				System.out.println(sql);
				int rowsAffected = statement.executeUpdate(sql);

				if (rowsAffected == 1) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public boolean deleteById(int id) {
		System.out.println("deleting...");
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(IcecreamConstant.MYSQL_URL, IcecreamConstant.MYSQL_NAME,
					IcecreamConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from  icecream_details where cream_id=3";
				Statement statement = mysql.createStatement();
				System.out.println(sql);
				int rowsAffected = statement.executeUpdate(sql);
				if (rowsAffected == 1)
					return true;

			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				try {
					mysql.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

		return false;
	}
}
