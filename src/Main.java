import Observable.IphoneObservableImp;
import Observable.StockObservable;
import Observer.EmailAlertObserverImp;
import Observer.MobileAlertObserverImp;
import Observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockObservable iphone = new IphoneObservableImp();
        NotificationAlertObserver observer1=new MobileAlertObserverImp("Ashish",iphone);
        NotificationAlertObserver observer2=new EmailAlertObserverImp("ob2@gmail.com",iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.setStockCount(10);


    }
}