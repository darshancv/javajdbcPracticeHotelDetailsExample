package com.hotelroomapp.hotel;

public class Room {
	// @id
	private int roomId;
	private String roomType;
	private String roomCost;

	public Room() {
		super();
	}

	public Room(int roomId, String roomType, String roomCost) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomCost = roomCost;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(String roomCost) {
		this.roomCost = roomCost;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", roomCost=" + roomCost + "]";
	}

}
