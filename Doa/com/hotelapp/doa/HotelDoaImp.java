package com.hotelapp.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hotelrooapp.exception.HotelDaoException;
import com.hotelrooapp.exception.HotelServiceException;
import com.hotelroomapp.hotel.Hotel;
import com.hotelroomappp.utility.JdbcConnection1;

public class HotelDoaImp implements HotelDoa {

	@Override
	public String insertHotel(Hotel hotel) throws HotelDaoException {
		Connection connection = null;
		connection = JdbcConnection1.getConnection();
		if (connection != null) {
			System.out.println("Connectted");
		}
		String result = "";
		String query = "insert into hotel values(?,?,?)";
		try {
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, hotel.getHotelId());
			pstmt.setString(2, hotel.getHotelName());
			pstmt.setString(3, hotel.getCity());
			int insertion = pstmt.executeUpdate();
			if (insertion > 0) {
				result = "Insertion done";

			}

		} catch (SQLException e) {
			throw new HotelDaoException("sql exception");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new HotelDaoException("sql exception");
			}
		}
		return result;

	}

	@Override
	public void searchHotelbycity(String city) throws HotelDaoException, HotelServiceException {
		Connection connection = null;
		try
		{
		
		connection = JdbcConnection1.getConnection();
		PreparedStatement stmt = connection.prepareStatement("select * from hotel where city=?");
		stmt.setString(1, city);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			//System.out.println("ccccc");
			System.out.println("id---->" + rs.getString(1));
			System.out.println("Hotelname---->" + rs.getString(2));
			System.out.println("city---->" + rs.getString(3));
		}
		System.out.println();
		if (!rs.next()) {
			 {
				throw new HotelDaoException();
			} 
		}
		}
		catch (Exception e) {
				throw new HotelServiceException("No such city found");
			}
		}
	}

