import java.util.List;
import java.util.ArrayList;

public class RoomNotificationSystem {
    private List<RoomObserver> observers = new ArrayList<>();
    private List<RoomStatus> roomStatuses = new ArrayList<>();

    public void subscribe(RoomObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(RoomObserver observer) {
        observers.remove(observer);
    }

    public void updateRoomStatus(RoomStatus roomStatus) {
        roomStatuses.add(roomStatus);
        notifyAllObservers(roomStatus);
    }

    public void notifyAllObservers(RoomStatus roomStatus) {
        for (RoomObserver observer : observers) {
            observer.notify(roomStatus);
        }
    }
}
