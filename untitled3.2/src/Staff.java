class Staff implements RoomObserver {
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void notify(RoomStatus roomStatus) {
        System.out.println("Personnel " + name + " got an update: " + roomStatus);
    }
}