package NotificationDispatchSystem_Strategy_Factory;

public class SilentPriorityStrategy implements PrioritySelectStrategy{

    @Override
    public String select(String notification) {
        return(notification.concat(Priority.SILENT.name()));
    }
}
