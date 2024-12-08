public class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("PhoneNotifier (" + phoneNumber + ") отримав повідомлення: " + alert.getMessage());
    }
}