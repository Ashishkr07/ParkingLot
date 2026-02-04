package NotificationDispatchSystem_Strategy_Factory;

public class SmsDispatchStrategy implements NotificationDispatchStrategy{
    @Override
    public void dispatch(String notification) {
        System.out.println(notification +"- dispatched via sms");
    }
}
