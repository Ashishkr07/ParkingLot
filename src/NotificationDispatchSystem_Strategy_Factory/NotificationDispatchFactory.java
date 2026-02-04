package NotificationDispatchSystem_Strategy_Factory;

public interface NotificationDispatchFactory {

    NotificationDispatchStrategy dispatch(Channel channel);
}
