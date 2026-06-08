package hospitalprogram;

public class Room {

    String roomNumber;
    String roomType;

    public Room(String roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public String getRoomInfo() {
        return "Room Number = " + roomNumber +
                "\nRoom Type = " + roomType;
    }
}