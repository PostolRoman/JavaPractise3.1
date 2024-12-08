public class Main {
    public static void main(String[] args) {
        RoomNotificationSystem roomSystem = new RoomNotificationSystem();

        Staff staff1 = new Staff("staff1");
        Staff staff2 = new Staff("staff2");

        roomSystem.subscribe(staff1);
        roomSystem.subscribe(staff2);

        RoomStatus room101 = new RoomStatus(101, true);
        RoomStatus room102 = new RoomStatus(102, false);

        roomSystem.updateRoomStatus(room101);
        roomSystem.updateRoomStatus(room102);

        RoomStatus room103 = new RoomStatus(103, true);
        roomSystem.updateRoomStatus(room103);

        RoomStatus room101Updated = new RoomStatus(101, false);
        roomSystem.updateRoomStatus(room101Updated);
    }
}