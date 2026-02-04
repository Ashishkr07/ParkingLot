package NotificationDispatchSystem_Strategy_Factory;

import java.util.Map;

public class DefaultDispatchFactory implements NotificationDispatchFactory{
    Map<Channel, NotificationDispatchStrategy> strategy;

    public DefaultDispatchFactory(Map<Channel, NotificationDispatchStrategy> strategy) {
        this.strategy = strategy;
    }

    @Override
    public NotificationDispatchStrategy dispatch(Channel channel) {
        return strategy.get(channel);
    }
}
