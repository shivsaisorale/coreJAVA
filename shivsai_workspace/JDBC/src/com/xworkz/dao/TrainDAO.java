package com.xworkz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.constant.TrainConstant;
import com.xworkz.db.DBaseUtil;
import com.xworkz.dto.TrainDTO;

public class TrainDAO {

	public boolean save(TrainDTO trainDTO) {
		System.out.println("saving...");
		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "insert into train_details values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, trainDTO.getId());
			pstmt.setObject(2, trainDTO.getTrainNo());
			pstmt.setObject(3, trainDTO.getBoarding());
			pstmt.setObject(4, trainDTO.getDestination());
			pstmt.setObject(5, trainDTO.getSeatNo());
			pstmt.setObject(6, trainDTO.getPrice());
			pstmt.setObject(7, trainDTO.getClassType());
			pstmt.setObject(8, trainDTO.getName());
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Formated output :" + rowsAffected);

			if (rowsAffected == 1) {
				return true;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBaseUtil.closeConnection(mysql);
		}

		return false;
	}

	public boolean deleteById(int id) {

		Connection mysql = null;
		try {
			Class.forName(TrainConstant.DRIVER);
			mysql = DBaseUtil.createConnection();

			String sql = "delete from train_details where t_id=?";
			PreparedStatement pstmt = mysql.prepareStatement(sql);
			pstmt.setObject(1, id);
			int rowsAffected = pstmt.executeUpdate(sql);
			System.out.println("Formated output :" + rowsAffected);
			if (rowsAffected == 1)
				return true;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBaseUtil.closeConnection(mysql);
		}
		return false;
	}

	public void displayById(int id) {
		Connection mysql = null;
		try {
			mysql = DBaseUtil.createConnection();

			String sql = "SELECT * FROM train_details where t_id=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(2, id);
			ResultSet rs = stat.executeQuery();
			while (rs.next()) {
				Object t_id = rs.getObject(1);
				System.out.println("id- " + t_id);
				Object t_trainNo = rs.getObject(2);
				System.out.println("trainNo - " + t_trainNo);
				Object t_boarding = rs.getObject(3);
				System.out.println("boarding- " + t_boarding);
				Object t_destination = rs.getObject(4);
				System.out.println("destination -" + t_destination);
				Object t_seatNo = rs.getObject(5);
				System.out.println("seatNo -" + t_seatNo);
				Object t_price = rs.getObject(6);
				System.out.println("price -" + t_price);
				Object t_classType = rs.getObject(7);
				System.out.println("classType -" + t_classType);
				Object t_name = rs.getObject(8);
				System.out.println("name -" + t_name);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBaseUtil.closeConnection(mysql);
		}
	}

}
