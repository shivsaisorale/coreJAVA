package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.constant.ClubConstant;
import com.xworkz.dto.ClubDTO;

public class ClubDAO {

	public boolean save(ClubDTO clubDTO) {
		Connection mysql = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			mysql = DriverManager.getConnection(ClubConstant.MYSQL_URL, ClubConstant.MYSQL_NAME,
					ClubConstant.MYSQL_PASSWORD);
			Statement statement = mysql.createStatement();
			String sql = "insert into club values(" + clubDTO.getId() + ",'" + clubDTO.getName() + "',"
					+ clubDTO.getEntryfees() + "," + clubDTO.getBouncer() + ",'" + clubDTO.getLocation() + "','"+clubDTO.getIsactive()+"')";

		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

		
		return false;

	}
	}

