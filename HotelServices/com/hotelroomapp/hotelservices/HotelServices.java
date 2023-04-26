package com.hotelroomapp.hotelservices;

import java.sql.SQLException;

import com.hotelapp.doa.HotelDoaImp;
import com.hotelrooapp.exception.HotelDaoException;
import com.hotelrooapp.exception.HotelServiceException;
import com.hotelroomapp.hotel.Hotel;

public class HotelServices 
{
	static HotelDoaImp d1=new HotelDoaImp();
	public static String insertHotel(Hotel hotel) throws HotelServiceException
	{
		try
		{
			
			return d1.insertHotel(hotel);
		}
		catch(HotelDaoException e)
		{
			throw new HotelServiceException(e.getMessage());
			
		}
		
		
	}
	public static void searchHotel(String city) throws HotelServiceException, SQLException
	{
		try
		{
			d1.searchHotelbycity(city);
		}
		catch(Exception e)
		{
			throw new HotelServiceException(e.getMessage(),e);
		}
		
	}

}
