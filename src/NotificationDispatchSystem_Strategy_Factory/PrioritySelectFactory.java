package NotificationDispatchSystem_Strategy_Factory;

public interface PrioritySelectFactory {

    PrioritySelectStrategy select(Priority priority);
}
