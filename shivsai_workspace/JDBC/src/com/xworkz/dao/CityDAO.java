package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constant.CityConstant;
import com.xworkz.dto.CityDTO;

public class CityDAO {

	public boolean save(CityDTO cityDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(CityConstant.MYSQL_URL, CityConstant.MYSQL_NAME,
					CityConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "insert into city_details values(" + cityDTO.getId() + ",'" + cityDTO.getName() + "','"
						+ cityDTO.getPopulation() + "','" + cityDTO.getFamousFor() + "')";
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
			mysql = DriverManager.getConnection(CityConstant.MYSQL_URL, CityConstant.MYSQL_NAME,
					CityConstant.MYSQL_PASSWORD);
			if (!mysql.isClosed()) {
				System.out.println("connection open");
				String sql = "delete from city_details where c_id=3";
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
