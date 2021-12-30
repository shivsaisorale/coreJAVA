package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constant.StateConstant;
import com.xworkz.dto.StateDTO;

public class StateDAO {

	public boolean save(StateDTO stateDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(StateConstant.MYSQL_URL, StateConstant.MYSQL_NAME,
					StateConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into  state_details values(" + stateDTO.getId() + ",'" + stateDTO.getName() + "',"
						+ stateDTO.getCode() + ",'" + stateDTO.getCapital() + "')";
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
			mysql = DriverManager.getConnection(StateConstant.MYSQL_URL, StateConstant.MYSQL_NAME,
					StateConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from  state_details where s_id=3";
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
