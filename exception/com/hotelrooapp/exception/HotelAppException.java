package com.hotelrooapp.exception;

public class HotelAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HotelAppException() {
		super();
	}

	public HotelAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HotelAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public HotelAppException(String message) {
		super(message);
	}

	public HotelAppException(Throwable cause) {
		super(cause);
	}

}
