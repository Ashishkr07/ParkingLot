package NotificationDispatchSystem_Strategy_Factory;

public class NormalPriorityStrategy implements PrioritySelectStrategy{
    @Override
    public String select(String notification) {
        return(notification.concat(Priority.NORMAL.name()));
    }
}
