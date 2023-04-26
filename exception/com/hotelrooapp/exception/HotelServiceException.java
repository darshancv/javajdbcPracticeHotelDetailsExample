package com.hotelrooapp.exception;

public class HotelServiceException extends HotelAppException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HotelServiceException() {
		super();
	}

	public HotelServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public HotelServiceException(String message) {
		super(message);
	}

	public HotelServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public HotelServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
