package NotificationDispatchSystem_Strategy_Factory;

public class HighPriorityStrategy implements PrioritySelectStrategy{

    @Override
    public String select(String notification) {
       return(notification.concat(Priority.HIGH.name()));
    }
}
