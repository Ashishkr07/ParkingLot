import NotificationDispatchSystem_Strategy_Factory.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Channel, NotificationDispatchStrategy> notificationDispatchStrategyMap = new HashMap<>();
        notificationDispatchStrategyMap.put(Channel.EMAIL,new EmailDispatchStrategy());
        notificationDispatchStrategyMap.put(Channel.SMS,new SmsDispatchStrategy());
        notificationDispatchStrategyMap.put(Channel.PUSH,new PushDispatchStrategy());
        notificationDispatchStrategyMap.put(Channel.SLACK,new SlackDispatchStrategy());


        Map<Priority, PrioritySelectStrategy> prioritySelectStrategyMap = new HashMap<>();
        prioritySelectStrategyMap.put(Priority.HIGH,new HighPriorityStrategy());
        prioritySelectStrategyMap.put(Priority.NORMAL,new NormalPriorityStrategy());
        prioritySelectStrategyMap.put(Priority.SILENT,new SilentPriorityStrategy());
        NotificationProcessor processor = new NotificationProcessor(
                new DefaultDispatchFactory(notificationDispatchStrategyMap),new DefaultPriorityFactory(prioritySelectStrategyMap)
        );

        processor.dispatch("Just testing",Channel.SMS,Priority.HIGH);


    }
}
