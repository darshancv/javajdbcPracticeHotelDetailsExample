package com.hotelapp.doa;

import java.sql.SQLException;

import com.hotelrooapp.exception.HotelDaoException;
import com.hotelrooapp.exception.HotelServiceException;
import com.hotelroomapp.hotel.Hotel;

public interface HotelDoa 
{
	public String insertHotel(Hotel hotel) throws HotelDaoException;
	public void searchHotelbycity(String city) throws HotelDaoException, HotelServiceException;
		

	

}
