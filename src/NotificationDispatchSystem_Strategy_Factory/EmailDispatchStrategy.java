package NotificationDispatchSystem_Strategy_Factory;

public class EmailDispatchStrategy implements NotificationDispatchStrategy{
    @Override
    public void dispatch(String notification) {
        System.out.println(notification +"- dispatched via email");
    }
}
