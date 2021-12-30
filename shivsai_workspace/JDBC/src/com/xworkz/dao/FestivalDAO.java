package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constant.FestivalConstant;
import com.xworkz.dto.FestivalDTO;

public class FestivalDAO {
	public boolean save(FestivalDTO festivalDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(FestivalConstant.MYSQL_URL, FestivalConstant.MYSQL_NAME,
					FestivalConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into festival_details values(" + festivalDTO.getId() + ",'" + festivalDTO.getName()
						+ "','" + festivalDTO.getDate() + "','" + festivalDTO.getState() + "')";
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
			mysql = DriverManager.getConnection(FestivalConstant.MYSQL_URL, FestivalConstant.MYSQL_NAME,
					FestivalConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from festival_details where f_id=3";
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
