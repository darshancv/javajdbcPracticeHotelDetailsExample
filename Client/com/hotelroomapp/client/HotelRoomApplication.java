package com.hotelroomapp.client;

import java.util.Scanner;

import com.hotelrooapp.exception.HotelServiceException;
import com.hotelroomapp.hotel.Hotel;
import com.hotelroomapp.hotelservices.HotelServices;

public class HotelRoomApplication
{
	
	//private static Room room=new Room();
   public static Scanner s=new Scanner(System.in);
   
	public static void main(String[] args) throws HotelServiceException 
	{
		try
		{
	   int choice=0;
	   do
	   {
		   System.out.println("1.Add hotel");
		   System.out.println("2.Search a hotel by city name");
		   System.out.println("3.exit");
		   System.out.println("Enter your choice");
		   choice=s.nextInt();
		   switch(choice)
		   {
		   case 1:String message=addHotelDetails();
		           System.out.println(message);
		           break;
		   case 2:System.out.println("Enter the city name ");
		           String city=s.next();
		          HotelServices.searchHotel(city);
			           
		   }
	   }while(choice!=3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static String  addHotelDetails() throws HotelServiceException 
	{
		System.out.println("Enter hotel id");
		int hotelId=s.nextInt();
		System.out.println("Enter the hotel name");
		String hotelName=s.next();
		System.out.println("Enter the city");
		String city=s.next();
		Hotel hotel=new Hotel(hotelId, hotelName, city);
		return HotelServices.insertHotel( hotel);
		
		
	}

}
