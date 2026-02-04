package NotificationDispatchSystem_Strategy_Factory;

import java.util.Map;

public class DefaultPriorityFactory implements PrioritySelectFactory{

    Map<Priority,PrioritySelectStrategy> strategyMap;

    public DefaultPriorityFactory(Map<Priority, PrioritySelectStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    @Override
    public PrioritySelectStrategy select(Priority priority) {
        return strategyMap.get(priority);
    }
}
