import Observable.IphoneObservable;
import Observer.EmailAlert;
import Observer.MobileAlert;
import Observer.NotificationAlert;

public class Main {
    public static void main(String[] args) {
        IphoneObservable iphoneObservable = new IphoneObservable();
        NotificationAlert obs1 = new MobileAlert("aditya@gmail.com",iphoneObservable);
        NotificationAlert obs2 = new MobileAlert("shivang@gmail.com",iphoneObservable);
        NotificationAlert obs3 = new EmailAlert("rahul@gmail.com",iphoneObservable);

        iphoneObservable.add(obs1);
        iphoneObservable.add(obs2);
        iphoneObservable.add(obs3);

        iphoneObservable.setData(10);
    }
}