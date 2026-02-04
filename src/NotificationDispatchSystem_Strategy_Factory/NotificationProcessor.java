package NotificationDispatchSystem_Strategy_Factory;

public class NotificationProcessor {

    NotificationDispatchFactory notificationDispatchFactory;
    PrioritySelectFactory prioritySelectFactory;

    public NotificationProcessor(NotificationDispatchFactory notificationDispatchFactory, PrioritySelectFactory prioritySelectFactory) {
        this.notificationDispatchFactory = notificationDispatchFactory;
        this.prioritySelectFactory = prioritySelectFactory;
    }

    public void dispatch(String notification,Channel channel,Priority priority){
       PrioritySelectStrategy prioritySelectStrategy= prioritySelectFactory.select(priority);
       notification = prioritySelectStrategy.select(notification);
       NotificationDispatchStrategy notificationDispatchStrategy = notificationDispatchFactory.dispatch(channel);
       notificationDispatchStrategy.dispatch(notification);
    }
}
