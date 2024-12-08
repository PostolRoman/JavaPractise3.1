public class RoomStatus {
    private int roomNumber;
    private boolean isOccupied;

    public RoomStatus(int roomNumber, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public String toString() {
        return "room N" + roomNumber + (isOccupied ? " occupied " : " free");
    }
}