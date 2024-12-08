public class SysLogNotifier implements Observer {
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("SysLogNotifier (" + journalName + ") отримав повідомлення: " + alert.getMessage());
    }
}
