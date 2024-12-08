public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();

        EmailNotifier emailNotifier = new EmailNotifier("postolromanv@gmail.com");
        SysLogNotifier sysLogNotifier = new SysLogNotifier("SystemLog");
        TelegramNotifier telegramNotifier = new TelegramNotifier("Sapnu Puas", true);
        PhoneNotifier phoneNotifier = new PhoneNotifier("+42072892030");

        observable.subscribe(emailNotifier);
        observable.subscribe(sysLogNotifier);
        observable.subscribe(telegramNotifier);
        observable.subscribe(phoneNotifier);

        SystemAlert alert = new SystemAlert(
                AlertSeverity.CRITICAL,
                "Системна помилка!",
                500,
                "2024-12-08 12:00:00",
                "MainProcess"
        );

        observable.notifyAllObservers(alert);
    }
}
